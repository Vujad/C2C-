package com.dealdove.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pageController {
    //你媽的這個是什麼鬼
    //branch test 新增 不該出現在dev
    //dev 不會在main上更新

    @GetMapping("/01_home_page")
    public String test(Model model){
        return "01_home_page";
    }

//    tt
    @GetMapping("/04_product_page")
    public String productPage(Model model){
        return "04_product_page";
    }
}
