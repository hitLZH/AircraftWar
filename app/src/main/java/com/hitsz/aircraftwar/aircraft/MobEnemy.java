package com.hitsz.aircraftwar.aircraft;
import com.hitsz.aircraftwar.basic.*;
import com.hitsz.aircraftwar.bullet.*;
import com.hitsz.aircraftwar.factory.*;
import com.hitsz.aircraftwar.prop.*;
import com.hitsz.aircraftwar.strategy.*;
import com.hitsz.aircraftwar.aircraft.*;
import com.hitsz.aircraftwar.dao.*;


public class MobEnemy extends AbstractAircraft{

    public MobEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
        this.power=10;
        this.numOfBullet=1;
        this.setShootStrategy(new StraightShootStrategy());
    }

    @Override
    public void forward() {
        this.locationY+=speedY;
        //TODO 判定 y 轴向下飞行出界
//        if (locationY >= Main.WINDOW_HEIGHT ) {
//            vanish();
//        }
    }
}
