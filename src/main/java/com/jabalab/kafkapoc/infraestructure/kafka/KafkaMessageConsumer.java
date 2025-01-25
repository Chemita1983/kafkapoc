package com.jabalab.kafkapoc.infraestructure.kafka;

import com.jabalab.kafkapoc.domain.port.input.MessageConsumerPort;
import com.jabalab.kafkapoc.domain.port.usecase.PrintMessageUsecasePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaMessageConsumer implements MessageConsumerPort {

    private final PrintMessageUsecasePort printMessageUsecase;

    @KafkaListener(topics = "message-topic")
    public void listen(ConsumerRecord<String, String> record) {
        try {
            listen(record.value());
        } catch (Exception e) {
            log.error("Error procesando el mensaje: {}", e.getMessage());
        }
    }

    @Override
    public void listen(String message) {
        printMessageUsecase.logMessage(message);

    }
}

