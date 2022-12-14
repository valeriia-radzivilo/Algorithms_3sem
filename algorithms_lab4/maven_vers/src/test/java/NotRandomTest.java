
import org.junit.Test;
import com.labs.Additionals.*;

import static  org.junit.Assert.*;

public class NotRandomTest {
    @Test
    public void TestNotRandomValue()
    {
        int antAmount = 2,
                wildAntAmount = 0,
                citiesAmount = 5;
        int[][]distances = new int[][]{
                {0, 3, 28, 16, 28},
                {3, 0, 35, 3, 8},
                {28, 35, 0, 6, 38},
                {16, 3, 6, 0, 30},
                {28, 8, 38, 30, 0}
        };

        Graph gr = Graph.ready_graph(distances);
        gr.print_graph();
        int min = main_tsl.start_program(1, gr, antAmount,wildAntAmount,citiesAmount);

        System.out.println("\nMinimum from all iterations: "+ min);
        Graph.greedyLength(gr,citiesAmount);

        assertEquals(71,min);

    }
}
