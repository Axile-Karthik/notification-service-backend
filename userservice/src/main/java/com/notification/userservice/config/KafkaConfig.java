package com.notification.userservice.config;

import com.notification.userservice.constants.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic smsTopic(){
        return TopicBuilder.name(AppConstants.SMS)
                .partitions(3)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic emailTopic(){
        return TopicBuilder.name(AppConstants.EMAIL)
                .partitions(3)
                .replicas(1)
                .build();
    }
}
