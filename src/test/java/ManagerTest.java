import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Zsolt", "JT178826D", 40000, "Teaching");
    }

    @Test
    public void canGetName(){
        assertEquals("Zsolt", manager.getName());
    }

    @Test
    public void canGetniNumber(){
        assertEquals("JT178826D", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Teaching", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1.05);
        assertEquals(42000, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400, manager.payBonus(), 0.1);
    }
}
