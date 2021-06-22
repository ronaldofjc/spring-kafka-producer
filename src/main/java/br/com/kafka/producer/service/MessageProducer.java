package br.com.kafka.producer.service;

import br.com.kafka.producer.domain.Book;

public interface MessageProducer {
    void publishToQueue(String key, Book books);
}
