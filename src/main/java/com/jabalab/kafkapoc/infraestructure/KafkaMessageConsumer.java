package com.jabalab.kafkapoc.infraestructure;

import com.jabalab.kafkapoc.domain.port.MessageConsumerPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaMessageConsumer implements MessageConsumerPort {

    @Override
    public void processMessage(String message) {

    }
}
