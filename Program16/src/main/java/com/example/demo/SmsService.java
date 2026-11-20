package com.example.demo;
import org.springframework.stereotype.Component;
@Component("smsService")
public class SmsService implements MessageService {
  public String message() { return "Message from SmsService"; }
}
