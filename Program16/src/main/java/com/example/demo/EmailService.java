package com.example.demo;
import org.springframework.stereotype.Component;
@Component("emailService")
public class EmailService implements MessageService {
  public String message() { return "Message from EmailService"; }
}
