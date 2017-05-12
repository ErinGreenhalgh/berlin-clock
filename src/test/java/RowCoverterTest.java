import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RowCoverterTest {
    @Test
    public void testItConvertsAnArrayOfStringsToASingleString(){
        RowConverter converter = new RowConverter();
        String[] input = new String[3];
        input[0] = "R";
        input[1] = "O";
        input[2] = "R";

        String expectedResult = "R | O | R";
        String actualResult = converter.convert(input);
        assertEquals(expectedResult, actualResult);
    }



}
