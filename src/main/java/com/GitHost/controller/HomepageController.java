package com.GitHost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

    /**
     * Default landing page for GitHost,
     * will redirect to "/homepage"
     * @return the redirection "/homepage"
     */
    @GetMapping("/")
    public String landingPage(){
        return "redirect:/homepage";
    }

    @GetMapping("/homepage")
    public void homepage(){
    }
}
