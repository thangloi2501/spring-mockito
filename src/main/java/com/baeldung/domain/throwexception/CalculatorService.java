package com.baeldung.domain.throwexception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    @Autowired
    private ExceptionService exceptionService;

    public int doCalculation(int a) {
        return exceptionService.throwHere(a);
    }
}
