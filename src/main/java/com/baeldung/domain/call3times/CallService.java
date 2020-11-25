package com.baeldung.domain.call3times;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallService {

    @Autowired
    private CallMeService callMeService;

    public void doCall() {
        for (int i = 0; i < 3; i++)
            callMeService.hello();
    }
}
