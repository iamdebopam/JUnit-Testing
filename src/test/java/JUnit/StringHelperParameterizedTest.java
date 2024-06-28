package JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    private final String input;
    private final String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions(){
        String[][] expectedOutputs ={{"AACD","CD"},{"ACD","CD"}};
        return Arrays.asList(expectedOutputs);
    }
    StringHelper stringHelper = new StringHelper();
    @Test
    public void testTruncateAInFirst2Positions(){
        Assert.assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));
    }

    @Test
    public void testTruncateAInFirstPosition(){
        Assert.assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
    }

}
