package com.jabalab.kafkapoc.application.usecase;

import com.jabalab.kafkapoc.domain.port.MessageConsumerPort;
import com.jabalab.kafkapoc.domain.port.usecase.PrintMessageUsecasePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrintMessageUseCase implements PrintMessageUsecasePort {

    final MessageConsumerPort messageConsumer;

    @Override
    public void printMessage(String message) {
         messageConsumer.processMessage(message);
    }
}
