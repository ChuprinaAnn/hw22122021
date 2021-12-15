package com.example.hw22122021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@SpringBootApplication
public class Hw22122021Application {

    //создать ответ
    /* curl -X POST http://localhost:8080/theme -H 'Content-Type: text/plain' -d 'text' */
    @PostMapping("theme")
    public void addTheme(@RequestBody String text) {
        Theme themee = new Theme(text);
        theme.add(themee);
    }


}
