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
    public void testBrand() {
        car.setCarBrand("BMW");
        car.setCarBrand("BMW");
        car.setCarBrand("BMW");

        Mockito.verify(car, Mockito.times(3)).setCarBrand(Mockito.anyString());
    }

    @Mock
    Wheel wheel;

    @Test
    public void testWheel(){
        Car car = new Car(wheel);
        Mockito.when(wheel.countWheels(2,2)).thenReturn(5);
        System.out.println(car.getWheelsCount(2,2));
    }
}