package com.example.springdemo;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot! "
                + StringUtils.leftPad(String.valueOf(LocalDateTime.now().getHour()), 2, "0") + ":"
                + StringUtils.leftPad(String.valueOf(LocalDateTime.now().getMinute()), 2, "0") + ":"
                + StringUtils.leftPad(String.valueOf(LocalDateTime.now().getSecond()), 2, "0");
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @GetMapping("/earn")
    public String getPlayReward() {
        return "Earn 5k";
    }

}
