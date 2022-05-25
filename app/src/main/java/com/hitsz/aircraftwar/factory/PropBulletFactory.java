package com.hitsz.aircraftwar.factory;

import com.hitsz.aircraftwar.basic.AbstractFlyingObject;

public class PropBulletFactory  implements AbstractPropFactory{

    @Override
    public AbstractFlyingObject produce() {
        //TODO
//        return new PropBullet(
//                (int) ( Math.random() * (Main.WINDOW_WIDTH - ImageManager.Prop_Blood_IMAGE.getWidth()))*1,
//                (int) (Math.random() * Main.WINDOW_HEIGHT * 0.2+Main.WINDOW_HEIGHT*0.6)*1
//        );
        return null;
    }


}
