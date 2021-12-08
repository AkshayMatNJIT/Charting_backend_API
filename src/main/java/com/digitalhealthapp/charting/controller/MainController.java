package com.digitalhealthapp.charting.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String indexPage()
    {
        return "eCR application Dashboard";
    }

}
