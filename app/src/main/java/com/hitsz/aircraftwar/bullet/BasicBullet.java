package com.hitsz.aircraftwar.bullet;
import com.hitsz.aircraftwar.basic.*;
import com.hitsz.aircraftwar.bullet.*;
import com.hitsz.aircraftwar.factory.*;
import com.hitsz.aircraftwar.prop.*;
import com.hitsz.aircraftwar.strategy.*;
import com.hitsz.aircraftwar.aircraft.*;
import com.hitsz.aircraftwar.dao.*;


public class BasicBullet extends AbstractFlyingObject{

    private int power = 10;

    public BasicBullet(int locationX, int locationY, int speedX, int speedY, int power) {
        super(locationX, locationY, speedX, speedY);
        this.power = power;
    }

    @Override
    public void forward() {

        //speedY为正时向下，为负时向上
        this.locationY+=speedY;
        this.locationX+=speedX;
        //TODO 判定出界方法
        // 判定 x 轴出界
//        if (locationX <= 0 || locationX >= Main.WINDOW_WIDTH) {
//            vanish();
//        }
//        // 判定 y 轴出界
//        if (speedY > 0 && locationY >= Main.WINDOW_HEIGHT ) {
//            // 向下飞行出界
//            vanish();
//        }else if (locationY <= 0){
//            // 向上飞行出界
//            vanish();
//        }
    }

    public int getPower() {
        return power;
    }

//    //使用观察者模式的观察方法,获得道具的影响
//    @Override
    public void getEffected(AbstractProp abstractProp){
        this.vanish();
    }


}
