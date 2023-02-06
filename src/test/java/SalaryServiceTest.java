import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SalaryServiceTest {

    @Test
    public void shouldCalculateSalaryWhenUnderLimit() {
        SalaryService salaryService = new SalaryService();
        int actual = salaryService.calculateSalary(50000);
        int expected = 2500;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSalaryLimit() {
        SalaryService salaryService = new SalaryService();
        int actual = salaryService.calculateSalary(100000000);
        int expected = 50000;
        Assert.assertEquals(expected, actual);
    }
}