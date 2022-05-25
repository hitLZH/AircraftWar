package com.hitsz.aircraftwar.prop;
import com.hitsz.aircraftwar.basic.*;
import com.hitsz.aircraftwar.bullet.*;
import com.hitsz.aircraftwar.factory.*;
import com.hitsz.aircraftwar.prop.*;
import com.hitsz.aircraftwar.strategy.*;
import com.hitsz.aircraftwar.aircraft.*;

public class PropBlood extends AbstractProp{

    public PropBlood(int x, int y) {
        super(x, y);
    }



    //通知方法
    @Override
    public void propDo(){
        heroAircraft.getEffected(this);
    }
}
