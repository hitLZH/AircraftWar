package com.hitsz.aircraftwar.aircraft;
import com.hitsz.aircraftwar.basic.*;
import com.hitsz.aircraftwar.bullet.*;
import com.hitsz.aircraftwar.factory.*;
import com.hitsz.aircraftwar.prop.*;
import com.hitsz.aircraftwar.strategy.*;
import com.hitsz.aircraftwar.aircraft.*;
import com.hitsz.aircraftwar.dao.*;


public class HeroAircraft extends AbstractAircraft{
    /** 攻击方式 */

    //TODO 单例英雄机初始化参数依赖界面大小和图片大小
//    private static HeroAircraft heroAircraft =new HeroAircraft(
//            Main.WINDOW_WIDTH / 2,
//            Main.WINDOW_HEIGHT - ImageManager.HERO_IMAGE.getHeight() ,
//            0, 0, 10000);
    private static HeroAircraft heroAircraft=null;


    /**
     * @param locationX 英雄机位置x坐标
     * @param locationY 英雄机位置y坐标
     * @param speedX 英雄机射出的子弹的基准速度（英雄机无特定速度）
     * @param speedY 英雄机射出的子弹的基准速度（英雄机无特定速度）
     * @param hp    初始生命值
     */
    private HeroAircraft(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
        this.power=30;
        this.numOfBullet=1;
//        this.setShootStrategy(new ScatterShootStrategy());
        this.setShootStrategy(new StraightShootStrategy());
    }

    public void heroInit(){

        //TODO 单例模式下每次重新使用英雄机，参数需依赖界面图片指定
//        this.locationX=Main.WINDOW_WIDTH / 2;
//        this.locationY=Main.WINDOW_HEIGHT - ImageManager.HERO_IMAGE.getHeight();
//        this.hp=10000;

    }

    public static HeroAircraft getHeroAircraft(){
        return heroAircraft;
    }

    @Override
    public void forward() {
        // 英雄机由鼠标控制，不通过forward函数移动
    }


    //使用观察者模式的观察方法,获得道具的影响
    @Override
    public void getEffected(AbstractProp abstractProp){
        //射击策略或者子弹数量改变
        if(abstractProp instanceof PropBlood){
            decreaseHp(-5000);
        }else{
            int a;
            a=(int)(Math.random()*3)+1;
            switch (a){
                case 1: //威力增加
                    setPower(100);
                    break;
                case 2: //数量增加,并且直射
                    setNumOfBullet(5);
                    setShootStrategy(new StraightShootStrategy());
                    break;
                case 3: //改变射击方式
                    setNumOfBullet(5);
                    setShootStrategy(new ScatterShootStrategy());
                    break;
                default:
                    break;
            }
            //开启一个线程计时结束英雄机子弹增加效果。
            Runnable runnable=()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setShootStrategy(new StraightShootStrategy());
                setNumOfBullet(1);

            };
            new Thread(runnable).start();
        }
    }

}
