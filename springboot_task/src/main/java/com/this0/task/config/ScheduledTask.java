package com.this0.task.config;

import org.joda.time.DateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

    // cron表达式设置执行规则，这里是每5秒执行一次，用cron在线工具，不手动写
    @Scheduled(cron = "0/5 * * * * ?")
    public void remind() {

        DateTime dateTime = new DateTime();
        String dateString = dateTime.toString("yyyy-MM-dd-hh-mm-ss");

        //打印当前时间
        System.out.println(dateString);
    }
}
