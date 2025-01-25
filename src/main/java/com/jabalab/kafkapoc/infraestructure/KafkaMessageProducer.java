package com.jabalab.kafkapoc.infraestructure;

import com.jabalab.kafkapoc.domain.port.MessageProducertPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaMessageProducer implements MessageProducertPort {

    @Override
    public void sendMessage(String message) {
        log.info("Message: {}", message);
    }
}
