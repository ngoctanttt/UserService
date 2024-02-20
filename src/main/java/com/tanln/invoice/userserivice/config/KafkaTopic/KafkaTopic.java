package com.tanln.invoice.userserivice.config.KafkaTopic;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {
    @Bean
    NewTopic createdUser(){
        return TopicBuilder.name("userCreated").build();
    }
}
