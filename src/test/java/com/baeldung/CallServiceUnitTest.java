package com.baeldung;

import com.baeldung.domain.call3times.CallMeService;
import com.baeldung.domain.call3times.CallService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MocksApplication.class)
public class CallServiceUnitTest {

    @InjectMocks
    private CallService callService;

    @Mock
    private CallMeService callMeService;

    @Test
    public void whenDoCall_thenCallHello3Times() {
        callService.doCall();

        verify(callMeService, times(3)).hello();
    }
}