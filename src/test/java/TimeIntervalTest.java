import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class TimeIntervalTest {

    @Test
    public void areInitializedWithTopAndBottomsRows() {
        TimeInterval ti = new TimeInterval();
        ArrayList<String> expectedTop = new ArrayList<>();
        ArrayList<String> expectedBottom = new ArrayList<>();

        assertEquals(ti.getTopRow(), expectedTop);
        assertEquals(ti.getBottomRow(), expectedBottom);

     }
}
