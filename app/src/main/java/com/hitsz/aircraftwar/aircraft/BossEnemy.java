package com.hitsz.aircraftwar.aircraft;
import com.hitsz.aircraftwar.basic.*;
import com.hitsz.aircraftwar.bullet.*;
import com.hitsz.aircraftwar.factory.*;
import com.hitsz.aircraftwar.prop.*;
import com.hitsz.aircraftwar.strategy.*;
import com.hitsz.aircraftwar.aircraft.*;
import com.hitsz.aircraftwar.dao.*;


public class BossEnemy extends AbstractAircraft{


    public BossEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
        this.power=100;
        this.numOfBullet=5;
        this.setShootStrategy(new ScatterShootStrategy());
    }

    // 重载一个速度、血量自定义的构造方法
    public BossEnemy(int locationX, int locationY) {
        super(locationX,locationY,40,0,250);
        this.power=100;
        this.numOfBullet=5;
        this.setShootStrategy(new ScatterShootStrategy());
    }

    public BossEnemy(int addBlood){
        super(0,0,0,0,0);
        //TODO
//        super((int) ( Math.random() * (Main.WINDOW_WIDTH - ImageManager.ELITE_ENEMY_IMAGE.getWidth()))*1,
//                (int) (Math.random() * Main.WINDOW_HEIGHT * 0.2)*1,
//                40,
//                0,
//                250+addBlood);
        this.power=100;
        this.numOfBullet=5;
        this.setShootStrategy(new ScatterShootStrategy());
    }


    @Override
    public void forward() {
        //Boss机的飞行,只能够缓慢左右移动

        //1/50机会瞬移，其他情况不动
        int r=(int)(Math.random()*4);
        if(r==1){
            //随机往左或者右瞬移
            //得到1或者-1
            int lOrR=2*(int)(Math.random()*2)-1;
            //TODO
//            //瞬移距离为1/3窗口左右
//            int dis=Main.WINDOW_WIDTH/3;
//            if(locationX+dis*lOrR<0||locationX+dis*lOrR>Main.WINDOW_WIDTH){
//                ;
//            }else{
//                locationX+=lOrR*dis;
//            }
        }




        //Boss机不能出界


    }
}
