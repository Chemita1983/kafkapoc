package com.jabalab.kafkapoc.domain.port.input;

public interface MessageConsumerPort {

    void listen(final String message);
}
