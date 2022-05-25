package com.hitsz.aircraftwar.factory;

import com.hitsz.aircraftwar.basic.AbstractFlyingObject;

public class MobEnemyFactory implements AbstractAircraftFactory{
    @Override
    public AbstractFlyingObject produce() {
        //TODO
//        return new MobEnemy(
//                (int) ( Math.random() * (Main.WINDOW_WIDTH - ImageManager.MOB_ENEMY_IMAGE.getWidth()))*1,
//                (int) (Math.random() * Main.WINDOW_HEIGHT * 0.2)*1,
//                0,
//                10,
//                30
//        );
        return null;
    }
}
