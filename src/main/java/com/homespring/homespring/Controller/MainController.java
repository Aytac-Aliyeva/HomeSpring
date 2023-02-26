package com.homespring.homespring.Controller;


import com.homespring.homespring.service.MainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @Autowired
    MainService service;


    @GetMapping("/main")
    public Boolean findIfContains() {
        String str = "Aytac";
        if (str.contains("yt")) {
            return true;
        } else return false;

    }

    @GetMapping("/matrix")
    public Boolean findIfStartsWith() {
        String str = "Elmira";
        if (str.startsWith("mi")) {
            return true;
        }
        return false;
    }

    @GetMapping("/matrix133")
    public String getFirstAndLastTwoLetterIfSame() {
        String str = "educated";
        if (str.startsWith("ed") && str.endsWith("ed")) {
            str.substring(2, str.length() - 2);
        }
        return str;
    }

    @GetMapping("/find")
    public Integer findSingleNumbers() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                return i;

            }

        }
        return null;
    }

    @GetMapping("/average")
    public float findAverage() {
        int[] array = {3, 5, 2};
        float sum = 0;
        float average = 0;
        for (int i : array)
            sum += i;
        average = sum / array.length;

        return average;
    }

    @GetMapping("/sum")
    public int sum(@RequestParam("a") int aa, @RequestParam("b") int bb) {
       return service.sum(aa, bb);


    }

    @GetMapping("/multi")
    public int multi(@RequestParam("a") int aa, @RequestParam("b") int bb) {
        return service.multi(aa, bb);
    }

    @GetMapping("/div")
    public int div(@RequestParam("a") int aa, @RequestParam("b") int bb) {
         return service.div(aa, bb);
    }


    @GetMapping("/sub")
    public int sub(@RequestParam("a") int aa, @RequestParam("b") int bb) {
        return service.sub(aa, bb);
    }
}
