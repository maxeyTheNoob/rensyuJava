package com.company;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class stringToTime {
    public static String stampToString(java.sql.Timestamp time,String strFormat){
        DateFormat df = new SimpleDateFormat(strFormat);
        String str = df.format(time);
        return str;
    }
    public static void main(String args[]){
        String sf = "yyyy-MM-dd-HH-mm-ss 第ww周";
        java.sql.Timestamp ts = new java.sql.Timestamp(System.currentTimeMillis());
        String timeStamp ="";
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00")); //设置时区

        int year = calendar.get(Calendar.YEAR); //获取年份后两位
        int month = calendar.get(Calendar.MONTH)+1; //获取月份
        int day = calendar.get(Calendar.DAY_OF_MONTH); //获取日
        int hour = calendar.get(Calendar.HOUR_OF_DAY); //获取小时
        int min = calendar.get(Calendar.MINUTE); //获取分钟
        timeStamp=timeStamp+year+month+day+hour+min;

        //System.out.println(timeStamp);
        System.out.println(stampToString(ts,sf));
    }
}
