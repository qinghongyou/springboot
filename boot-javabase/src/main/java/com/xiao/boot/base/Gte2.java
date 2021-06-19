package com.xiao.boot.base;

import java.util.Calendar;
import java.util.Date;

public class Gte2 {
    public static void main(String[] args) {
        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, -2);
        Date gte2 = c.getTime();
        //String qyt= format.format(start);//前一天
        System.out.print("gte2 "+gte2.getTime());
    }
}
