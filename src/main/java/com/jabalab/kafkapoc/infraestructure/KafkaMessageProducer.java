package com.jabalab.kafkapoc.infraestructure;

import com.jabalab.kafkapoc.domain.port.MessageProducertPort;
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
        System.out.println("Message " + message + " has been sucessfully sent to the topic: " + MESSAGE_TOPIC);
    }
}

