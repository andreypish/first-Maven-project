public class Car {
    public String carBrand;
    Wheel wheel;

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Car(Wheel wheel) {
        this.wheel = wheel;
    }

    public int getWheelsCount(int frontWheels, int backWheels) {
        return wheel.countWheels(frontWheels, backWheels);
    }
}
