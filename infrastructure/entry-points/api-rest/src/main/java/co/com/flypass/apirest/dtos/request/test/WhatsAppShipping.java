package co.com.flypass.apirest.dtos.request.test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WhatsAppShipping extends ShippingMethod {

    private String phoneNumber;

    private String templateName;

    private List<String> templateParams;

    private String imageUrl;

    private String imageData;

    private String pdfUrl;

    private String pdfData;

    private String videoUrl;

    @JsonCreator
    public WhatsAppShipping(@JsonProperty("phoneNumber") String phoneNumber,
            @JsonProperty("templateName") String templateName,
            @JsonProperty("templateParams") List<String> templateParams,
            @JsonProperty("imageUrl") String imageUrl,
            @JsonProperty("imageData") String imageData,
            @JsonProperty("pdfUrl") String pdfUrl,
            @JsonProperty("pdfData") String pdfData,
            @JsonProperty("videoUrl") String videoUrl) {
        super(NotificationType.WHATSAPP);
        this.phoneNumber = phoneNumber;
        this.templateName = templateName;
        this.templateParams = templateParams;
        this.imageUrl = imageUrl;
        this.imageData = imageData;
        this.pdfUrl = pdfUrl;
        this.pdfData = pdfData;
        this.videoUrl = videoUrl;
    }

    // Getters y Setters
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public List<String> getTemplateParams() {
        return templateParams;
    }

    public void setTemplateParams(List<String> templateParams) {
        this.templateParams = templateParams;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageData() {
        return imageData;
    }

    public void setImageData(String imageData) {
        this.imageData = imageData;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public String getPdfData() {
        return pdfData;
    }

    public void setPdfData(String pdfData) {
        this.pdfData = pdfData;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

//
//    public List<MediaButtonConfig> getMediaButtonCfg() {
//        return mediaButtonCfg;
//    }
//
//    public void setMediaButtonCfg(List<MediaButtonConfig> mediaButtonCfg) {
//        this.mediaButtonCfg = mediaButtonCfg;
//    }

}
