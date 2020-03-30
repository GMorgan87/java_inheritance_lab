import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Gareth", "JT178826C", 30000);
    }

    @Test
    public void canGetName(){
        assertEquals("Gareth", developer.getName());
    }

    @Test
    public void canGetniNumber(){
        assertEquals("JT178826C", developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1.1);
        assertEquals(33000, developer.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, developer.payBonus(), 0.1);
    }
}
