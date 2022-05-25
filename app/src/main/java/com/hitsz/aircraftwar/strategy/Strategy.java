package com.hitsz.aircraftwar.strategy;
import com.hitsz.aircraftwar.basic.*;
import com.hitsz.aircraftwar.bullet.*;
import com.hitsz.aircraftwar.factory.*;
import com.hitsz.aircraftwar.prop.*;
import com.hitsz.aircraftwar.strategy.*;
import com.hitsz.aircraftwar.aircraft.*;

import java.util.List;

public interface Strategy {
    //根据策略生成不同的设计效果
    public abstract List<BasicBullet> strategyShoot(AbstractAircraft abstractAircraft);

}
