package com.api_senai.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api_senai.api.service.EmailService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send")
    public String sendEmail(@RequestParam String to, 
                            @RequestParam String subject, 
                            @RequestParam String content) {
        emailService.sendSimpleEmail(to, subject, content);
        return "E-mail enviado com sucesso!";
    }
}
