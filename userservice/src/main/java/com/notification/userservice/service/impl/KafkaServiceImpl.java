package com.notification.userservice.service.impl;

import com.notification.userservice.constants.AppConstants;
import com.notification.userservice.dto.UserRequest;
import com.notification.userservice.service.KafkaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaServiceImpl implements KafkaService {

    private final KafkaTemplate<String, UserRequest> kafkaTemplate;

    @Override
    public void kafkaProducer(UserRequest request) {
        log.info("Sending message to Kafka: {}", request);
        kafkaTemplate.send(AppConstants.SMS,request);
    }
}
