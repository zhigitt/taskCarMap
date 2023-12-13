import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, 001);
        CarInfo carInfo = new CarInfo(2018, "Audi", 10000, "red");

        Map<Car, CarInfo> carCarInfoMap = new HashMap<>();
        carCarInfoMap.put(car, carInfo);

        System.out.println(carCarInfoMap.entrySet());
    }
}