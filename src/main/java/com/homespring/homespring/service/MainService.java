package com.homespring.homespring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class MainService {

    public int sum(int aa, int bb) {

        return aa + bb;
    }


    public int multi(int aa, int bb) {
        return aa * bb;
    }


    public int div(int aa, int bb) {
        return aa / bb;
    }



    public int sub(int aa, int bb) {
        return aa - bb;
    }
}
