package ua.mm.courses;

/**
 * Created by mmaloshtan2 on 23.07.2015.
 */
public class Factory {
    public Controller getCar(String selectedCar){
        if(selectedCar.equals("sedan")){
            return new Sedan();
        }
        else if (selectedCar.equals("truck")){
            return new Truck();
        }
        else if (selectedCar.equals("bike")){
            return new Bike();
        }
        else
        return null;
    }
}
