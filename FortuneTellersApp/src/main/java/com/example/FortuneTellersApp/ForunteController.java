package com.example.FortuneTellersApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForunteController {

    @GetMapping("/tellFortune")
    public String tellFortune(){
        return "Trust your guts";
    }

}
