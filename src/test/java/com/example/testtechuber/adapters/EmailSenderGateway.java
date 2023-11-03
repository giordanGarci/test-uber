package com.example.testtechuber.adapters;

import com.example.testtechuber.core.EmailSenderUseCase;

public interface EmailSenderGateway{
    void sendEmail(String to, String subject, String body);
}
