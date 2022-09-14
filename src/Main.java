import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car, CarData> hashMap = new HashMap<>();
        hashMap.put(new Car(1, "B5613AO"), new CarData(2010, "Toyota Wish", 5000, "White"));
        hashMap.put(new Car(2, "B7456TI"), new CarData(2012, "Mercedes 200", 7000, "Red"));
        hashMap.put(new Car(3, "B7341AU"), new CarData(2015, "Bmw 513", 9000, "Green"));
        hashMap.put(new Car(4, "B4566Ba"), new CarData(2018, "Lada Kalina", 5600, "Black"));
        hashMap.put(new Car(5, "B1355CG"), new CarData(2020, "Renault Logan", 8400, "Blue"));

        for (Map.Entry car: hashMap.entrySet()) {
            System.out.println(car.getKey() + ", " + car.getValue());
        }
    }
}