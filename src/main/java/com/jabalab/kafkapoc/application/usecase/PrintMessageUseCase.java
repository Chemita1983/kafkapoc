package com.jabalab.kafkapoc.application.usecase;

import com.jabalab.kafkapoc.domain.port.usecase.PrintMessageUsecasePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PrintMessageUseCase implements PrintMessageUsecasePort {

    @Override
    public void logMessage(String message) {
         log.info("Message: {}", message);
    }
}
