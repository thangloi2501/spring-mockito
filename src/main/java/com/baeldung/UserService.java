package com.baeldung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private NameService nameService;

    private AgeService ageService;

    @Autowired
    public UserService(NameService nameService, AgeService ageService) {
        this.nameService = nameService;
        this.ageService = ageService;
    }

    public String getUserName(String id) {
        return nameService.getUserName(id);
    }

    public int getAge(int age) {
        return ageService.getUserName(age);
    }
}
