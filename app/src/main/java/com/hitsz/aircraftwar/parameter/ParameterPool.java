package com.hitsz.aircraftwar.parameter;




/*
* 用来对游戏参数进行设定的参数池，能够根据回合数返回对应的游戏参数
* 比如各种敌机的血量，数量上限随着回合数的增长的变化等
* 其实使用的是策略模式
* */
public interface ParameterPool {


    //返回Boss机的数量上限,根据回合数
    public int getMaxNumOfBoss(long numOfRounds);


    //根据回合数返回精英机的数量上限
    public int getMaxNumOfElite(long numOfRounds);

    //根据回合数返回普通敌机的数量上限
    public int getMaxNumOfMob(long numOfRounds);


    /*返回各种敌机的血量值
    * */
    public int getBloodOfBoss(long numOfRounds);

    public int getBloodOfElite(long numOfRounds);

    public int getBloodOfMob(long numOfRounds);


    //返回各种敌机的子弹威力参数
    public int getPowerOfBoss(long numOfRounds);

    public int getPowerOfElite(long numOfRounds);

    public int getPowerOfMob(long numOfRounds);


     //返回各种道具掉落几率... 先不写，






}
