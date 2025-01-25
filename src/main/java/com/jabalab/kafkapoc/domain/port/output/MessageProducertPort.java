package com.jabalab.kafkapoc.domain.port.output;

public interface MessageProducertPort {

    void sendMessage(final String message);
}
