package com.hitsz.aircraftwar.aircraft;
import com.hitsz.aircraftwar.basic.*;
import com.hitsz.aircraftwar.bullet.*;
import com.hitsz.aircraftwar.factory.*;
import com.hitsz.aircraftwar.prop.*;
import com.hitsz.aircraftwar.strategy.*;
import com.hitsz.aircraftwar.aircraft.*;
import com.hitsz.aircraftwar.dao.*;

public class EliteEnemy extends AbstractAircraft{

    public EliteEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }

    // 重载一个速度、血量自定义的构造方法
    public EliteEnemy(int locationX, int locationY) {

        super(locationX, locationY, 40, 10, 50);
        this.power = 30;
        this.numOfBullet = 1;
        this.setShootStrategy(new StraightShootStrategy());
    }


    @Override
    public void forward() {
        //TODO Main.WINDOW_WIDTH需要更新
//        // 重写父类的移动方法
//        int a = (int) (Math.random() * 10);
//        if (a < 5) {
//            //一半的几率向下移动
//            this.locationY += speedY;
//        } else if (a >= 5 && a < 7) {
//            //五分之一的几率左右移动
//            a = (int) (Math.random() * 2);
//            if (a == 0) {   //向左
//                if (this.locationX - speedX > 0) {
//                    this.locationX -= speedX;
//                }
//            } else {  //向右
//                if (this.locationX + speedX < Main.WINDOW_WIDTH) {
//                    this.locationX += speedX;
//                }
//            }
//        } else {
//            //还有3/10的几率不动
//        }
//        // 判定 y 轴向下飞行出界
//        if (locationY >= Main.WINDOW_HEIGHT) {
//            vanish();
//        }
    }
}
