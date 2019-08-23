package com.imooc.utils;

import java.util.Random;

/**
 * @Author wanghl
 * @Date: Created in 12:19 2019/8/23 0023
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return  System.currentTimeMillis() + String.valueOf(number);
    }
}
