package com.example.subscriptionproject.api;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    private SubscriptionRepository subscriptionRepo;

    SubscriptionServiceImpl(SubscriptionRepository subscriptionRepo) {
    this.subscriptionRepo = subscriptionRepo;
    }

    public void save(SubscriptionEntity subscriptionEntity) {
        subscriptionRepo.save(subscriptionEntity);
    }
    public void delete(SubscriptionEntity subscriptionEntity) {
        subscriptionRepo.delete(subscriptionEntity);
    }

    public Date addHoursToJavaUtilDate(Date date, int hours) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, hours);
        return calendar.getTime();
    }

}
