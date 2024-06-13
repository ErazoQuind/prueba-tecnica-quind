package co.com.flypass.apirest.dtos.request.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = WhatsAppShipping.class, name = "WHATSAPP")
})
public abstract class ShippingMethod {
    private final NotificationType type;

    // Constructor
    protected ShippingMethod(@JsonProperty("type") NotificationType type) {
        this.type = type;
    }

    // Getters y Setters
    public NotificationType getType() {
        return type;
    }

    // Enum para los tipos de notificación
    public enum NotificationType {
        SMS,
        EMAIL,
        WHATSAPP,
        OTHER
    }
}
