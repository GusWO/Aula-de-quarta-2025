package com.acme.back;

import java.util.Date;

public class BankAccountException extends Exception {

    public BankAccountException(String message) {
        super(new Date().toString() + "\n"+ message);
    }
  
}
