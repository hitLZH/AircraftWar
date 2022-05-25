package com.hitsz.aircraftwar.aircraft;
import com.hitsz.aircraftwar.basic.*;
import com.hitsz.aircraftwar.bullet.*;
import com.hitsz.aircraftwar.factory.*;
import com.hitsz.aircraftwar.prop.*;
import com.hitsz.aircraftwar.strategy.*;
import com.hitsz.aircraftwar.aircraft.*;
import com.hitsz.aircraftwar.dao.*;

import java.util.List;

public abstract class AbstractAircraft extends AbstractFlyingObject{
    /**
     * 生命值
     */
    protected int maxHp;
    protected int hp;

    //射击参数
    protected int power;
    protected int numOfBullet;

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getNumOfBullet() {
        return numOfBullet;
    }
    public void setNumOfBullet(int numOfBullet) {
        this.numOfBullet = numOfBullet;
    }

    //射击策略
    private Strategy shootStrategy;


    public void setShootStrategy(Strategy shootStrategy) {
        this.shootStrategy = shootStrategy;
    }

    public AbstractAircraft(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY);
        this.hp = hp;
        this.maxHp = hp;
    }

    public AbstractAircraft(int locationX, int locationY, int speedX, int speedY, int hp,Strategy strategy){
        super(locationX, locationY, speedX, speedY);
        this.hp = hp;
        this.maxHp = hp;
        this.shootStrategy=strategy;
    }

    public void decreaseHp(int decrease){
        hp -= decrease;
        if(hp <= 0){
            hp=0;
            vanish();
        }else if(hp>maxHp){
            hp=maxHp;
        }
    }

    public int getHp() {
        return hp;
    }


    /**
     * 飞机射击方法，可射击对象必须实现
     * @return
     *  可射击对象需实现，返回子弹
     *  非可射击对象空实现，返回null
     */
    public List<BasicBullet> shoot(){
        return shootStrategy.strategyShoot(this);
    }





//    使用观察者模式的观察方法,获得道具的影响
    @Override
    public void getEffected(AbstractProp abstractProp){
        this.vanish();
    };


}
