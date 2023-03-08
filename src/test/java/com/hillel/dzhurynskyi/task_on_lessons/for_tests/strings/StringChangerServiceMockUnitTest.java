package com.hillel.dzhurynskyi.task_on_lessons.for_tests.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * @author spasko
 */
@ExtendWith(MockitoExtension.class)
class StringChangerServiceMockUnitTest {

    @InjectMocks
    private StringChangerService stringChangerService;
    @Spy
    private StringLowerUpperService lowerUpperService;

    @Test
    void addStartAndEndUpper() {
        when(lowerUpperService.toUpper("end")).thenReturn("END");
//      doReturn("END").when(lowerUpperService).toUpper("end");
        String actual = stringChangerService.addStartAndEndUpper("start", "end", "input");

        assertEquals("startinputEND", actual);
    }
}