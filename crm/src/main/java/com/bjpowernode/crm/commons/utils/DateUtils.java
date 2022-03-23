package com.bjpowernode.crm.commons.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 对Date类型数据进行处理的工具类
 */
public class DateUtils {
    /**
     * 对指定的date对象进行格式化: yyyy-MM-dd HH:mm:ss
     * @param date
     * @return
     */
    public static String formateDateTime(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr=sdf.format(date);
        return dateStr;
    }

    /**
     * 对指定的date对象进行格式化: yyyy-MM-dd
     * @param date
     * @return
     */
    public static String formateDate(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String dateStr=sdf.format(date);
        return dateStr;
    }

    /**
     * 对指定的date对象进行格式化: HH:mm:ss
     * @param date
     * @return
     */
    public static String formateTime(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
        String dateStr=sdf.format(date);
        return dateStr;
    }
}
