package co.com.flypass.apirest.dtos.request.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

public record NotificationRequest(
        @JsonProperty("recipientName")
        String recipientName,
        @JsonProperty("contextSource")
        String contextSource,
        @JsonProperty("plate")
        String plate,
        @JsonProperty("mobileTokens")
        List<String> mobileTokens,
        @JsonProperty("deliveryMethods")
        List<ShippingMethod> deliveryMethods) {}


