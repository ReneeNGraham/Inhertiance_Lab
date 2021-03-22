import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Neville", "NE356", 3000.50, "HR", 10000.00);
    }

    @Test
    public void directorHasBudget() {
        assertEquals(10000.00, director.getBudget(), 00.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(600.1, director.payBonus(), 00.01);
    }
}

