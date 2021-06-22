package br.com.kafka.producer.service.impl;

import br.com.kafka.producer.domain.Book;
import br.com.kafka.producer.service.MessageProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageProducerImpl implements MessageProducer {

    private final KafkaTemplate<String, Book> kafkaTemplate;

    private static final String TOPIC = "message.topic";

    @Override
    public void publishToQueue(String key, Book book) {
        log.info("Send message. Key: {}, Book: {}", key, book);
        kafkaTemplate.send(TOPIC, key, book);
    }
}
