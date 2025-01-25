package com.jabalab.kafkapoc.infraestructure.api;


import com.jabalab.kafkapoc.domain.port.usecase.SendMessageUsecasePort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {

    final SendMessageUsecasePort sendMessageUsecase;

    @PostMapping("/message")
    void sendMessage(@RequestBody String message) {
        sendMessageUsecase.sendMessage(message);
    }
}
