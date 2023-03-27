package com.example.subscriptionproject.api;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "subscription", schema = "subschema")
public class SubscriptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID subscriptionId;
    @Column
    private Date createdAt;
    @Column
    private Date expiresAt;

    @Column
    private String status;

    public String getStatus() {
        return status;
    }

    public String setStatus(String status) {
        this.status = status;
        return status;
    }

    public UUID setSubscriptionId(UUID subscriptionId) {
        this.subscriptionId = subscriptionId;
        return subscriptionId;
    }

    public UUID getSubscriptionId() {
        return subscriptionId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return createdAt;
    }

    public Date getExpiresAt(Date date) {
        return expiresAt;
    }

    public Date setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
        return expiresAt;
    }

    public SubscriptionEntity(UUID subscriptionId, Date createdAt, Date expiresAt, String status) {
        this.subscriptionId = subscriptionId;
        this.createdAt = createdAt;
        this.expiresAt = expiresAt;
        this.status = status;
    }
    public SubscriptionEntity() {

    }

}
