package se.iths;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Disabled;

@Disabled
public class TextProcessorTest {


    @Test
    @DisplayName("Example test method with no logic")
    public void testNoLogic() {
        assertTrue(3 > 0);
    }


    @Test
    public void testReverse() {
        assertEquals("regor", TextProcessor.reverse("roger"));
    }

    @Test
    public void testLowerCase() {
        assertEquals("roger", TextProcessor.lowerCase("ROGER"));
    }

    @Test
    public void testUpperCase() {
        assertEquals("ROGER", TextProcessor.upperCase("roger"));
    }

}
