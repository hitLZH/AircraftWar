package com.hitsz.aircraftwar.application;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.hitsz.aircraftwar.R;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 该类为工具类，负责加载图片
 */
public class ImageManager {
    public static Bitmap BACKGROUND1_IMAGE;
    public static Bitmap BACKGROUND2_IMAGE;
    public static Bitmap BACKGROUND3_IMAGE;

    public static Bitmap HERO_IMAGE;
    public static Bitmap MOB_ENEMY_IMAGE;
    public static Bitmap ELITE_ENEMY_IMAGE;
    public static Bitmap BOSS_ENEMY_IMAGE;

    public static Bitmap HERO_BULLET_IMAGE;
    public static Bitmap ENEMY_BULLET_IMAGE;

    public static Bitmap BLOOD_SUPPLY_IMAGE;
    public static Bitmap BOMB_SUPPLY_IMAGE;
    public static Bitmap FIRE_SUPPLY_IMAGE;

    /**
     * 在原代码块中会抛出异常，移植到android，不知道decodeResource方法抛出的异常，故未处理，可能导致问题
     */
    static {
            //设置不同的背景图片
            BACKGROUND1_IMAGE = BitmapFactory.decodeResource(getResources(), R.drawable.bg);
            BACKGROUND2_IMAGE = BitmapFactory.decodeResource(getResources(), R.drawable.bg2);
            BACKGROUND3_IMAGE = BitmapFactory.decodeResource(getResources(), R.drawable.bg3);


            HERO_IMAGE = BitmapFactory.decodeResource(getResources(), R.drawable.hero);
            MOB_ENEMY_IMAGE = BitmapFactory.decodeResource(getResources(), R.drawable.mob);
            ELITE_ENEMY_IMAGE = BitmapFactory.decodeResource(getResources(), R.drawable.elite);
            BOSS_ENEMY_IMAGE = BitmapFactory.decodeResource(getResources(), R.drawable.boss);

            HERO_BULLET_IMAGE = BitmapFactory.decodeResource(getResources(), R.drawable.bullet_hero);
            ENEMY_BULLET_IMAGE = BitmapFactory.decodeResource(getResources(), R.drawable.bullet_enemy);


            BLOOD_SUPPLY_IMAGE = BitmapFactory.decodeResource(getResources(), R.drawable.prop_blood);
            BOMB_SUPPLY_IMAGE = BitmapFactory.decodeResource(getResources(), R.drawable.prop_bomb);
            FIRE_SUPPLY_IMAGE = BitmapFactory.decodeResource(getResources(), R.drawable.prop_bullet);
    }

    /**
     * 该方法解决了ImageManager类中没有getResources方法的问题
     * 来源：http://t.zoukankan.com/zhujiabin-p-4229169.html
     */
    static Resources getResources() {
        Resources mResources = null;
        mResources = getResources();
        return mResources;
    }
}
