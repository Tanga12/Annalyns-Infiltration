package project.analystinfiltration;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AnnalynsInfiltrationTest {

    @Test
    void testCanFastAttack() {
        assertTrue(AnnalynsInfiltration.canFastAttack(false));
        assertFalse(AnnalynsInfiltration.canFastAttack(true));
        
    }

    @Test
    void testCanSpy() {
        assertTrue(AnnalynsInfiltration.canSpy(false, false, true));
        assertFalse(AnnalynsInfiltration.canSpy(false, false, false));
        assertTrue(AnnalynsInfiltration.canSpy(true, false, false));
        assertTrue(AnnalynsInfiltration.canSpy(false, true, false));
        
    
    }

    @Test
    void testCanSignalPrisoner() {
        
    
    }
    @Test
    void testCanFreePrisoner() {
        
    
    }


    
}
