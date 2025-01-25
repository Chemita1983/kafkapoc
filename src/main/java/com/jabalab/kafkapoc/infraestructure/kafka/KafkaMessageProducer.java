package com.jabalab.kafkapoc.infraestructure.kafka;

import com.jabalab.kafkapoc.domain.port.output.MessageProducertPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaMessageProducer implements MessageProducertPort {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String MESSAGE_TOPIC= "message-topic";

    @Override
    public void sendMessage(String message) {
        kafkaTemplate.send(MESSAGE_TOPIC, message);
        log.info("Message {} has been successfully sent to the topic: " + MESSAGE_TOPIC, message);
    }
}

