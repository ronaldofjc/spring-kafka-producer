package br.com.kafka.producer.controller;

import br.com.kafka.producer.domain.Book;
import br.com.kafka.producer.service.MessageProducer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@Tag(name = "Kafka Producer")
public class MessageController {

    private final MessageProducer messageProducer;

    @PostMapping("/publish/{key}")
    @Operation(summary = "Endpoint to publish message on kafka topic")
    public ResponseEntity<Object> publishMessages(@PathVariable("key") final String key, @RequestBody Book book) {
        log.info("Sending message: {}", book);
        messageProducer.publishToQueue(key, book);
        return ResponseEntity.ok().build();
    }
}
