//package com.example.email_sender.dto;
//
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import lombok.Data;
//
//@Data
//public class EmailReqDto {
//    @NotBlank(message = "Recipient email is required")
//    @Email(message = "Invalid recipient email")
//    private String to;
//
//    @NotBlank(message = "Subject is required")
//    private String subject;
//
//    @NotBlank(message = "Email body is required")
//    private String body;
//
//        // getters and setters
//    }
package com.example.email_sender.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class EmailReqDto {

    @NotBlank(message = "Recipient email is required")
    @Email(message = "Invalid recipient email")
    private String to;

    @NotBlank(message = "Subject is required")
    private String subject;

    @NotBlank(message = "Email body is required")
    private String body;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
