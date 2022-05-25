package com.hitsz.aircraftwar.factory;
import com.hitsz.aircraftwar.basic.*;
import com.hitsz.aircraftwar.bullet.*;
import com.hitsz.aircraftwar.factory.*;
import com.hitsz.aircraftwar.prop.*;
import com.hitsz.aircraftwar.strategy.*;
import com.hitsz.aircraftwar.aircraft.*;

public class BossEnemyFactory implements AbstractAircraftFactory{
    @Override
    public AbstractFlyingObject produce() {
        //TODO
//        return new BossEnemy(
//                (int) ( Math.random() * (Main.WINDOW_WIDTH - ImageManager.ELITE_ENEMY_IMAGE.getWidth()))*1,
//                (int) (Math.random() * Main.WINDOW_HEIGHT * 0.2)*1
//        );
        return null;
    }

    public AbstractFlyingObject produce(int addblood) {
        //TODO
//
//        return new BossEnemy((int) ( Math.random() * (Main.WINDOW_WIDTH - ImageManager.ELITE_ENEMY_IMAGE.getWidth()))*1,
//                (int) (Math.random() * Main.WINDOW_HEIGHT * 0.2)*1,40 , 0, 250+addblood);
        return null;
    }
}
