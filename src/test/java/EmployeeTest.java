import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before() {
        employee = new Manager("Hendrik", "HR456", 2500.00, "Construction");
    }

    @Test
    public void managerAsEmployee() {
        assertEquals("Hendrik", employee.getName());
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(250.00, employee.raiseSalary(00.10, 2750), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(250, employee.payBonus(), 00.01);
    }
}
