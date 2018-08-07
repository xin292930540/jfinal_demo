package com.demo.itTask;

import java.util.Calendar;

public class test implements Runnable {
    public void run() {
        Calendar calendar = Calendar.getInstance();
        System.out.println("每分钟执行一次"+calendar.get(Calendar.MINUTE));
    }
}
