package com.example.email_sender.controller;
import com.example.email_sender.dto.EmailReqDto;
import com.example.email_sender.service.EmailService;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/email")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

//    @PostMapping("/send")
//    public String sendEmail(
//            @RequestParam String to,
//            @RequestParam String subject,
//            @RequestParam String body) {
//
//        emailService.sendEmail(to, subject, body);
//
//        return "Email sent successfully";
//    }

@PostMapping("/send")
public String sendEmail(@Valid  @RequestBody EmailReqDto request) {

    emailService.sendEmail(
            request.getTo(),
            request.getSubject(),
            request.getBody()
    );

    return "Email sent successfully";
}
    @PostMapping("/send-html")
    public String sendHtmlEmail(@RequestBody EmailReqDto request)
            throws MessagingException {

        emailService.sendHtmlEmail(
                request.getTo(),
                request.getSubject(),
                request.getBody()
        );

        return "HTML email sent successfully";
    }

    @PostMapping("/send-with-attachment")
    public String sendWithAttachment(
            @RequestParam String to,
            @RequestParam String subject,
            @RequestParam String body,
            @RequestParam MultipartFile file) throws Exception {

        emailService.sendEmailWithAttachment(
                to,
                subject,
                body,
                file
        );

        return "Email with attachment sent successfully";
    }

}