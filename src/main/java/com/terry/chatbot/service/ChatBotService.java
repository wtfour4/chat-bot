package com.terry.chatbot.service;

import com.plexpt.chatgpt.ChatGPT;
import com.plexpt.chatgpt.util.Proxys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.net.Proxy;

@Slf4j
@Service
public class ChatBotService {

    //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 -- y9000p
    //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 -- mba
    private static String key = "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";

    public String test(String question) {
        log.info("\nquestion: \n{}", question);
        Proxy proxy = Proxys.http("127.0.0.1", 7890);

        ChatGPT chatGPT = ChatGPT.builder()
                .apiKey(key)
                .proxy(proxy)
                .apiHost("https://api.openai.com/") //反向代理地址
                .build()
                .init();

        String res = chatGPT.chat(question);
        log.info("\nchatGpt: \n{}", res);
        return res;
    }
}
