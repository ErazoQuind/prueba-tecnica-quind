package co.com.flypass.apirest.controllers;


import co.com.flypass.dto.ShippingMethod;
import co.com.flypass.dto.request.NotificationRequest;
import co.com.flypass.dto.response.NotificationResponse;
import co.com.flypass.dto.response.Result;
import co.com.flypass.webclient.NotificationClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/test")
public class PruebaController {

    private static final Logger log = LoggerFactory.getLogger(PruebaController.class);
    private final NotificationClient notificationClient;

    @Autowired
    public PruebaController(NotificationClient notificationClient) {
        this.notificationClient = notificationClient;
    }

    @PostMapping("/send-message")
    public ResponseEntity<NotificationResponse> sendNotificationTest(@RequestBody NotificationRequest notificationRequestDTO) {
        log.info(notificationRequestDTO.toString());
        for (ShippingMethod deliveryMethod : notificationRequestDTO.shippingMethods()) {
            log.info(deliveryMethod.getChanel().toString());
        }
        Result<NotificationResponse> notificationResponseResult = notificationClient.sendToChannelBlock(notificationRequestDTO);
        log.warn(notificationResponseResult.getErrorMessages().toString());
        return ResponseEntity.ok(notificationResponseResult.getValue());
    }

}
