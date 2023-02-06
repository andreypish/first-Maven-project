import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CarTest {

    @Mock
    Car car;

    @Test
    public void test() {
        car.setCarBrand("BMW");
        car.setCarBrand("BMW");
        car.setCarBrand("BMW");

        Mockito.verify(car, Mockito.times(3)).setCarBrand(Mockito.anyString());
    }
}