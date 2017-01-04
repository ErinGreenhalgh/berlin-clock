import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HoursTest {
    @Test
    public void takesInANumberOfHours() {
        Hours  h = new Hours(15);
        assertEquals(h.getNumber(), 15);
    }

    @Test
    public void hasATopAndBottomRow(){
        Hours h = new Hours (1);
        String [] expectedTop = new String[4];
        String [] expectedBottom = new String[4];

        assertArrayEquals(h.getTopRow(), expectedTop);
        assertArrayEquals(h.getBottomRow(), expectedBottom);
    }

    @Test
    public void rowsDefaultToAllOff(){
        Hours h = new Hours(1);
        h.setTopRow();

        String[] expectedTop = new String[4];
        expectedTop[0] = "O";
        expectedTop[1] = "O";
        expectedTop[2] = "O";
        expectedTop[3] = "O";

        assertArrayEquals(h.getTopRow(), expectedTop);
    }

    @Test
    public void canTurnOnTopRow(){
        Hours h = new Hours(10);
        h.setTopRow();
        h.fillRowsFromNumber();

        String[] expected = new String[4];
        expected[0] = "R";
        expected[1] = "R";
        expected[2] = "O";
        expected[3] = "O";

        assertArrayEquals(h.getTopRow(), expected);
     }

    @Test
    public void canTurnOnBottomRow(){
        Hours h = new Hours(4);
        h.setBottomRow();
        h.fillRowsFromNumber();

        String[] expected = new String[4];
         expected[0] = "R";
         expected[1] = "R";
         expected[2] = "R";
         expected[3] = "R";

         assertArrayEquals(h.getBottomRow(), expected);
     }
}
