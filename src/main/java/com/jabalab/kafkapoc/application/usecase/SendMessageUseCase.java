package com.jabalab.kafkapoc.application.usecase;

import com.jabalab.kafkapoc.domain.port.MessageProducertPort;
import com.jabalab.kafkapoc.domain.port.usecase.SendMessageUsecasePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendMessageUseCase implements SendMessageUsecasePort {

    final MessageProducertPort messageProducertPort;

    @Override
    public void sendMessage(String message) {
        messageProducertPort.sendMessage(message);
    }
}
