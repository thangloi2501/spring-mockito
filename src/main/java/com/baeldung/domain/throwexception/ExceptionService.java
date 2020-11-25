package com.baeldung.domain.throwexception;

import org.springframework.stereotype.Service;

@Service
public class ExceptionService {

    public int throwHere(int a) {
        return a / 0;
    }
}
