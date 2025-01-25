package com.jabalab.kafkapoc.domain.port;

public interface MessageConsumerPort {

    void processMessage(final String message);
}
