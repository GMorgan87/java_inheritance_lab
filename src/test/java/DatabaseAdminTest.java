import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Gareth", "JT178826C", 30000);
    }

    @Test
    public void canGetName(){
        assertEquals("Gareth", databaseAdmin.getName());
    }

    @Test
    public void canGetniNumber(){
        assertEquals("JT178826C", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1.1);
        assertEquals(33000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, databaseAdmin.payBonus(), 0.1);
    }
}
