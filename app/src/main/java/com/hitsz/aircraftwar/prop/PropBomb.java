package com.hitsz.aircraftwar.prop;
import com.hitsz.aircraftwar.basic.*;
import com.hitsz.aircraftwar.bullet.*;
import com.hitsz.aircraftwar.factory.*;
import com.hitsz.aircraftwar.prop.*;
import com.hitsz.aircraftwar.strategy.*;
import com.hitsz.aircraftwar.aircraft.*;

public class PropBomb extends AbstractProp{

    public PropBomb(int x, int y) {
        super(x, y);
    }




    @Override
    public void propDo(){
        for(AbstractAircraft abstractAircraft:enemyAircrafts){
            abstractAircraft.getEffected(this);
        }
        for(BasicBullet basicBullet:enemyBullets){
            basicBullet.getEffected(this);
        }
        for(BasicBullet basicBullet:heroBullets){
            basicBullet.getEffected(this);
        }

    }

}
