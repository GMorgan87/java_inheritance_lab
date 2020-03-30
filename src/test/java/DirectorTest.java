import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Zsolt", "JT178826D", 40000, "Teaching", 100000);
    }

    @Test
    public void canGetName(){
        assertEquals("Zsolt", director.getName());
    }

    @Test
    public void canGetniNumber(){
        assertEquals("JT178826D", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000, director.getSalary(), 0.1);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Teaching", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1.05);
        assertEquals(42000, director.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(800, director.payBonus(), 0.1);
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000, director.getBudget(), 0.1);
    }
}
