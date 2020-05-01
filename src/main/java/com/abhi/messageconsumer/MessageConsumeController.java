package com.abhi.messageconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MessageConsumeController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String URL="http://192.168.56.1:8765/messaging-server-config/message-config/consume";

    @GetMapping(path = "/messaging-consume")
    public void getMessage(){

        Object response = restTemplate.getForObject(URL,Object.class);
        System.out.println(response);
    }
}
