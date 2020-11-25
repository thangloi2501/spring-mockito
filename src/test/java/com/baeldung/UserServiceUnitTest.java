package com.baeldung;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MocksApplication.class)
public class UserServiceUnitTest {

    @InjectMocks
    private UserService userService;

    @Autowired
    private UserService userServiceReal;

    @Mock
    private NameService nameService;

    @Test
    public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
        Mockito.when(nameService.getUserName("SomeId")).thenReturn("Mock user name");


        Mockito.when(nameService.getUserName("")).thenThrow(new RuntimeException("sss"));

        String testName = userService.getUserName("SomeId");

        int age = userServiceReal.getAge(10);

        Assert.assertEquals("Mock user name", testName);

        Assert.assertEquals(10, age);
    }
}