package com.example.subscriptionproject.controller;

import com.example.subscriptionproject.api.SubscriptionEntity;
import com.example.subscriptionproject.api.SubscriptionServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.*;

@RestController
@RequestMapping("/api")
public class SubscriptionController {

    private SubscriptionServiceImpl subscriptionService;

    SubscriptionController(SubscriptionServiceImpl subscriptionService){
        this.subscriptionService = subscriptionService;
    }

    @GetMapping
    public ResponseEntity<?> getSub() {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        Map<String, Object> map1 = new LinkedHashMap<String, Object>();
        map.put("family","CALL_RECORDING");
        map.put("transport",map1);
            map1.put("type", "WEBHOOK");
            map1.put("endpoint", "https://webhook.site/3337c25a-7f4a-4b5a-8f14-fec98c7f5f41");
            return new ResponseEntity<>(map, HttpStatus.OK);
        }
    }
