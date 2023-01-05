package com.example.springdemo;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(Model model) {
        String greeting = "Greetings from Spring Boot! "
                + StringUtils.leftPad(String.valueOf(LocalDateTime.now().getHour()), 2, "0") + ":"
                + StringUtils.leftPad(String.valueOf(LocalDateTime.now().getMinute()), 2, "0") + ":"
                + StringUtils.leftPad(String.valueOf(LocalDateTime.now().getSecond()), 2, "0");
        model.addAttribute("date", greeting);
        return "hello";
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
