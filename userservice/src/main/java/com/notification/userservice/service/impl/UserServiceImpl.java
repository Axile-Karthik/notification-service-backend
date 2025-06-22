package com.notification.userservice.service.impl;

import com.notification.userservice.dto.UserRequest;
import com.notification.userservice.enums.NotificationTypeEnum;
import com.notification.userservice.service.KafkaService;
import com.notification.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final KafkaService kafkaService;

    @Override
    public void kafkaProducer(UserRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("User request cannot be null");
        }

        NotificationTypeEnum type = request.notification().eventType().type();
        if (type == NotificationTypeEnum.EMAIL) {
            kafkaService.kafkaProducerEmail(request);
        } else if (type==NotificationTypeEnum.SMS) {
            kafkaService.kafkaProducerSms(request);

        } else {
            throw new IllegalArgumentException("Unsupported notification type: " + type);
        }

        log.info("User Name : {}", request.userName());
    }
}
