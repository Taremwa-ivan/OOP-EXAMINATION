package balextranit;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompanyTest {
    private Company company;
    private Passenger passenger;

    @Before
    public void setUp() {
        company = new Company();
        company.addVehicle(new Vehicle(4));

        Location pickup = new Location(10, 20);
        Location destination = new Location(30, 40);
        passenger = new Passenger(pickup, destination);
    }

    @Test
    public void testScheduleVehicle_Success() {
        assertTrue("Vehicle should be scheduled", company.scheduleVehicle(passenger));
    }

    @Test
    public void testScheduleVehicle_Failure_NoVehicles() {
        Company noVehicleCompany = new Company();
        assertFalse("No vehicle should be scheduled", noVehicleCompany.scheduleVehicle(passenger));
    }
}
