import org.junit.Test;

public class RecursionsTest {

    @Test
    public void numWays() {
        Recursions rec = new Recursions();
        int actual2 = rec.numWays(2);
        assert 2 == actual2;

        int actual3 = rec.numWays(3);
        assert 3 == actual3;

        int actual4 = rec.numWays(4);
        assert 5 == actual4;
    }

    @Test
    public void numWays1() {

        Recursions rec = new Recursions();
        int[] steps = {1, 2};
        int actual2 = rec.numWays(2, steps);
        assert 2 == actual2;

        int actual3 = rec.numWays(3, steps);
        assert 3 == actual3;

        int actual4 = rec.numWays(4, steps);
        assert 5 == actual4;

    }
}