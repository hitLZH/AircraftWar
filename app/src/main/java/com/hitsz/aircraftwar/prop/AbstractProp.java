package com.hitsz.aircraftwar.prop;
import com.hitsz.aircraftwar.basic.*;
import com.hitsz.aircraftwar.bullet.*;
import com.hitsz.aircraftwar.factory.*;
import com.hitsz.aircraftwar.prop.*;
import com.hitsz.aircraftwar.strategy.*;
import com.hitsz.aircraftwar.aircraft.*;

import java.util.List;

public abstract class AbstractProp extends AbstractFlyingObject{

    protected static  HeroAircraft heroAircraft;
    protected static List<AbstractAircraft> enemyAircrafts;
    protected static List<BasicBullet> heroBullets;
    protected static List<BasicBullet> enemyBullets;


    //使用观察者模式的方法

    public static void setHeroAircraft(HeroAircraft heroAircraft){
        AbstractProp.heroAircraft=heroAircraft;
    }
    public static void setEnemyAircrafts(List<AbstractAircraft> enemyAircrafts){
        AbstractProp.enemyAircrafts=enemyAircrafts;
    }
    public static void setHeroBullets(List<BasicBullet> basicBullets){
        AbstractProp.heroBullets=heroBullets;
    }
    public static void setEnemyBullets(List<BasicBullet> enemyBullets){
        AbstractProp.enemyBullets=enemyBullets;
    }

    //通知方法
    public abstract void propDo();



    // 重载生成道具类型的方法
    public AbstractProp(int x,int y){
        super(x,y,0,0);
        this.speedY=2;
    }

    // 重载crash方法，专门用来实现道具与英雄机的碰撞
    public boolean crash(HeroAircraft heroAircraft){
        int x=heroAircraft.getLocationX();
        int y=heroAircraft.getLocationY();
        int width=heroAircraft.getWidth();
        int height=heroAircraft.getHeight();
        if(
                this.locationX+(this.width+width)/2<x
                        ||this.locationX-(this.width+width)/2>x
                        ||this.locationY+(this.height+height)/2<y
                        ||this.locationY-(this.height+height)/2>y
        ){  //如果没有发生碰撞
            return false;
        }else{
            //如果发生碰撞了，实现该类型的无效化
            this.vanish();
            return true;
        }
    }


    // 实现抽象父类中的移动方法
    @Override
    public void forward(){
        //作为道具，需要缓慢移动
        this.locationY+=this.speedY;
        //TODO 道具移动边界判定
//        if(this.locationY> Main.WINDOW_HEIGHT){
//            this.vanish();
//        }
    }

    //道具不会受到道具作用，
    @Override
    public void getEffected(AbstractProp abstractProp) {
        return ;
    }


}
