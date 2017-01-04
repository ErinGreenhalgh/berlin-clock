import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class HoursTest {


    @Test
    public void hasATopAndBottomRow(){
        Hours h = new Hours ();
        String [] expectedTop = new String[4];
        String [] expectedBottom = new String[4];

        assertArrayEquals(h.getTopRow(), expectedTop);
        assertArrayEquals(h.getBottomRow(), expectedBottom);
    }

    @Test
    public void rowsDefaultToAllOff(){
        Hours h = new Hours();
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
        Hours h = new Hours();
        h.setTopRow();
        h.fillRowsFromNumber(10);

        String[] expected = new String[4];
        expected[0] = "R";
        expected[1] = "R";
        expected[2] = "O";
        expected[3] = "O";

        assertArrayEquals(h.getTopRow(), expected);
     }

    @Test
    public void canTurnOnBottomRow(){
        Hours h = new Hours();
        h.setBottomRow();
        h.fillRowsFromNumber(4);

        String[] expected = new String[4];
         expected[0] = "R";
         expected[1] = "R";
         expected[2] = "R";
         expected[3] = "R";

         assertArrayEquals(h.getBottomRow(), expected);
     }

     @Test
    public void canTurnOnBothRows(){
        int number = 13;
        Hours h = new Hours();
        h.setTopRow();
        h.setBottomRow();
        h.fillRowsFromNumber(number);

        String[] expectedTop = new String[4];
        expectedTop[0] = "R";
        expectedTop[1] = "R";
        expectedTop[2] = "O";
        expectedTop[3] = "O";

        String[] expectedBottom = new String[4];
        expectedBottom[0] = "R";
        expectedBottom[1] = "R";
        expectedBottom[2] = "R";
        expectedBottom[3] = "O";

        assertArrayEquals(h.getTopRow(), expectedTop);
        assertArrayEquals(h.getBottomRow(), expectedBottom);
     }

     @Test
    public void canReturnARepresentationOfHours(){
        int hours = 12;
        Hours h = new Hours();
        String[][] result = h.display(hours);

        String[][] expected = new String[2][4];
        String[] top = new String[4];
        String[] bottom = new String[4];

        top[0] = "R";
        top[1] = "R";
        top[2] = "O";
        top[3] = "O";

        bottom[0] = "R";
        bottom[1] = "R";
        bottom[2] = "O";
        bottom[3] = "O";

        expected[0] = top;
        expected[1] = bottom;

        assertArrayEquals(result, expected);
     }
}
