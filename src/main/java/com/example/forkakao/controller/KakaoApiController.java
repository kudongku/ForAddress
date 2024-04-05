package com.example.forkakao.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KakaoApiController {

    @PostMapping("/kakao/api/address")
    public void getAddress(@RequestBody addressDto address){
        System.out.println(address.getAddress());
    }
}
