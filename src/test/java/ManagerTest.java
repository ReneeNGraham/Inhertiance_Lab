import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Neville", "NE356", 3000.50, "HR");
    }

    @Test
    public void managerHasDepartment() {
        assertEquals("HR", manager.getDeptName());
    }
}
