import java.util.*;

public class UsedCar {
    String vin;
    String make;
    int year;
    int mileage;
    int price;
    public final static String DEFAULT_VIN = "999";
    final int VIN_NUM_LENGTH = 4;
    final int LOW_YEAR = 1997;
    final int HIGH_YEAR = 2017;
    final String[] MAKES = {"Ford", "Honda", "Toyota", "Chrysler", "Other"};

    public UsedCar(String num, String carMake, int carYear, int miles, int pr) throws UsedCarException {
        boolean validMake = false;
        for (int i = 0; i < MAKES.length; i++) {
            if (MAKES[i].equals(carMake)) validMake = true;
        }
        if (num.length() != VIN_NUM_LENGTH || !validMake || (carYear < LOW_YEAR || carYear > HIGH_YEAR) || miles < 0 || pr < 0)
            throw new UsedCarException(num);

        vin = num;
        make = carMake;
        year = carYear;
        mileage = miles;
        price = pr;
    }

    public UsedCar() {
        vin = DEFAULT_VIN;
    }

    public String getVin() {
        return vin;
    }

    public String toString() {
        return "VIN " + vin + "  Make: " + make +
                "\n   Year: " + year + "  " + mileage + " miles   $" +
                price;
    }
}
