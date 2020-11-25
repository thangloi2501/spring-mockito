package com.baeldung;

import com.baeldung.domain.throwexception.CalculatorService;
import com.baeldung.domain.throwexception.ExceptionService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MocksApplication.class)
public class CalculatorServiceUnitTest {

    @InjectMocks
    private CalculatorService calculatorService;

    @Mock
    private ExceptionService exceptionService;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void whenCallThrowHere_thenExceptionThrown() {
        when(exceptionService.throwHere(10)).thenThrow(new RuntimeException("Division by zero error"));

        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Division by zero error");

        int a = calculatorService.doCalculation(10);

    }
}