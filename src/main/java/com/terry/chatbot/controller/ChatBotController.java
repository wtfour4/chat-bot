package com.terry.chatbot.controller;


import com.terry.chatbot.service.ChatBotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatBotController {

    @Autowired
    ChatBotService chatBotService;

    @GetMapping("test")
    public String test(@RequestParam String question) {
        return chatBotService.test(question);
    }
}
