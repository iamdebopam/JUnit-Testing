package JUnit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {
    StringHelper stringHelper = new StringHelper();
    @Test
    public void testTruncateAInFirst2Positions(){
        Assert.assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirstPosition(){
        Assert.assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegetiveScenario(){
        //assertEquals(false, stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario(){
        //assertEquals(false, stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
}
