package com.univer.api.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grants/oauth2/v1")
public class Oauth2Controller {


    @GetMapping("/token")
    public ResponseEntity<String> token(){
        return ResponseEntity.ok("token");
    }


}
