package com.baeldung;

import org.springframework.stereotype.Service;

@Service
public class AgeService {
    public int getUserName(int age) {
        return age;
    }
}
