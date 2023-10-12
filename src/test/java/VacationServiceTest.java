
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.VacationService;



public class VacationServiceTest {
    @Test
    public void testCashVacation() {
        VacationService service = new VacationService();
        int expected = 3;
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVacationRich() {
        VacationService service = new VacationService();
        int expected = 2;
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
