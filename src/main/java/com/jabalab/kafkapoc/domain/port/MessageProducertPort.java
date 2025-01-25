package com.jabalab.kafkapoc.domain.port;

public interface MessageProducertPort {

    void sendMessage(final String message);
}
