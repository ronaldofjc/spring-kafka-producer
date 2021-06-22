package br.com.kafka.producer.utils;

import br.com.kafka.producer.domain.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Serializer;

@Slf4j
public class MessageSerializer implements Serializer<Book> {

    @Override
    public byte[] serialize(String topic, Book book) {
        byte[] serializedValue = null;
        ObjectMapper om = new ObjectMapper();
        if(book != null) {
            try {
                serializedValue = om.writeValueAsString(book).getBytes();
            } catch (JsonProcessingException e) {
                log.error("Error in serialize: " + e);
            }
        }
        return serializedValue;
    }
}
