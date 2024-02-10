class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;

    int range(){
        return fuelcap*mpg;
    }
    double fuelneeded(int miles){
        return (double) miles/mpg; 
    }
}
public class VehicleDemo{
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();

        minivan.passengers = 12;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        System.out.println(minivan.range());
        System.out.println(minivan.fuelneeded(100));
    }
}

