package com.example.testtechuber.core.exceptiions;

import com.example.testtechuber.adapters.EmailSenderGateway;

public class EmailServiceException extends RuntimeException{
    public EmailServiceException(String msg){
        super(msg);
    }

    public EmailServiceException(String msg, Throwable cause){
        super(msg, cause);
    }

}
