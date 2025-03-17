package com.chat.app.controller;


/* This controller is going to handle all the incomming messages that is send from the front-end and it brodcast to
all the clients basically. */

import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    // /app/sendMessage
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

    @GetMapping("chat")
    public String chat() {
        return "chat";
    }
}
