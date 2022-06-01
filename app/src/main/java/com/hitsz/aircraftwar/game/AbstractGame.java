package com.hitsz.aircraftwar.game;

import com.hitsz.aircraftwar.aircraft.AbstractAircraft;
import com.hitsz.aircraftwar.aircraft.BossEnemy;
import com.hitsz.aircraftwar.aircraft.EliteEnemy;
import com.hitsz.aircraftwar.aircraft.HeroAircraft;
import com.hitsz.aircraftwar.aircraft.MobEnemy;
import com.hitsz.aircraftwar.basic.AbstractFlyingObject;
import com.hitsz.aircraftwar.bullet.BasicBullet;
import com.hitsz.aircraftwar.factory.FlyingObjectFactory;
import com.hitsz.aircraftwar.parameter.EasyParameterPool;
import com.hitsz.aircraftwar.parameter.ParameterPool;
import com.hitsz.aircraftwar.prop.AbstractProp;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGame {


    /*
    * 游戏类需要的类成员变量
    *
    * */

    //主角，英雄机
    protected HeroAircraft heroAircraft=HeroAircraft.getHeroAircraft();


    //敌机子弹
    protected List<BasicBullet> heroBullets=new ArrayList<>();

    //英雄机子弹
    protected List<BasicBullet> enemyBullets=new ArrayList<>();

    //敌机列表
    protected List<AbstractAircraft> enemyAircrafts=new ArrayList<>();

    protected List<AbstractProp> abstractProps=new ArrayList<>();






    //游戏是否结束的标志
    protected boolean ifFinsh=true;

    //游戏回合数，将根据游戏回合数来设置游戏难度的上升
    protected long numOfRounds=0;

    protected long score=0;


    //用来添加难度的参数池，参数池会根据不同的难度来返回不同的飞机数量上限，和血量系数
    protected ParameterPool parameterPool=new EasyParameterPool();


    /*
    * 对游戏的主要操作
    * 1. 初始化，或者说对游戏的参数进行设定,设定参数，比如设定参数池
    * 2. 重新开始游戏
    * 3. 单步运行
    * 4. 结束游戏
    *
    * */

    //对游戏参数进行设定
    public void setParameterPool(ParameterPool parameterPool){
        this.parameterPool=parameterPool;
    }






    //初始化游戏参数
    public void init(){
        ifFinsh=false;  //设置游戏标记为正在进行中

        //清除敌机

        numOfRounds=0;
        score=0;
        heroAircraft.init();

        //清理各种飞机和子弹
        for(int i=0;i<enemyAircrafts.size();i++){
            enemyAircrafts.get(i).vanish();
        }
        enemyAircrafts.clear();
        for(int i=0;i<heroBullets.size();i++){
            heroBullets.get(i).vanish();
        }
        heroBullets.clear();
        for(int i=0;i<enemyBullets.size();i++){
            enemyBullets.get(i).vanish();
        }
        enemyBullets.clear();


    }




    //定时进行游戏粗糙版,开始个循环进行单步游戏的线程
    public void action(){
        init();
        new Thread(()->{
            while(!ifFinsh){
                synchronized ("") {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        System.out.println("计时异常");
                        e.printStackTrace();
                    }
                    curRoundAction();
                }
            }
        }).start();
    }



    //单步进行游戏
    public void curRoundAction(){
        if(ifFinsh) return;     //如果游戏结束了，则该方法不会有效，直接退出

        //进行生成判定

        if(score%500==430){  //如果分数达到，生成一次Boss机

        }
        if(score%110==100){    //分数达到100生成一次精英机

        }
//        if(){       //如果普通机数量没有达到上限，生成普通机
//
//        }

        //移动


        //射击


        //撞击检测


        //后处理


        //清除已经失效的飞行物


        //判断游戏是否结束



    }




    //结束游戏
    public void endGame(){
        ifFinsh=true;
        //关闭全部音乐线程

    }








    /*
    * 获取游戏信息操作
    * 1. 返回所有飞行对象的列表
    * 2. 返回游戏分数
    * 3. 返回游戏进行的回合数，等等
    * 4. 返回游戏中的Boss机列表
    * 5. 返回游戏中的精英机队列表
    * 6. 返回游戏中的普通机列表
    * 7. 返回游戏中的道具列表
    * 9. 返回游戏中的子弹列表
    * */

    public List<AbstractAircraft> getEnemyAircrafts(){
        return enemyAircrafts;
    }

    public List<BasicBullet> getHeroBullets(){
        return heroBullets;
    }

    public List<BasicBullet> getEnemyBullets(){
        return enemyBullets;
    }

    public List<BossEnemy> getBossEnemyAircrafts(){
        List<BossEnemy> out=new ArrayList<>();
        for(int i=0;i<enemyAircrafts.size();i++){
            if(enemyAircrafts.get(i) instanceof BossEnemy){
                out.add((BossEnemy) enemyAircrafts.get(i));
            }
        }
        return out;
    }

    public List<EliteEnemy> getEliteEnemyAircrafts(){
        List<EliteEnemy> out=new ArrayList<>();
        for(int i=0;i<enemyAircrafts.size();i++) {
            if (enemyAircrafts.get(i) instanceof EliteEnemy) {
                out.add((EliteEnemy) enemyAircrafts.get(i));
            }
        }
        return out;
    }
    public List<MobEnemy> getMobEnemyAircrafts(){
        List<MobEnemy> out=new ArrayList<>();
        for(int i=0;i<enemyAircrafts.size();i++) {
            if (enemyAircrafts.get(i) instanceof MobEnemy) {
                out.add((MobEnemy)enemyAircrafts.get(i));
            }
        }
        return out;
    }

    //返回道具列表








    /*
    * 游戏类通用的基础方法
    * 1. 清除列表中失效的对象
    * 2. 对列表中的对象进行移动
    * 3. 进行撞击判定，并设定撞击对象失效
    *
    * */



}
