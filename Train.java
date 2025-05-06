public class Train implements Locomotive{
    private int fuelType;
    private double fuelCapacity;
    private int nCars;
    private int passengerCapacity;
  
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
      this.fuelType = fuelType;
      Engine.maxFuel = fuelCapacity;
      this.nCars = nCars;
      nCars * Car.maxCapacity = passengerCapacity;
    }
    public Engine getEngine(){
    }
    public Car getCar(int i){
    }
    public int getMaxCapacity(){
    }
    public int seatsRemaining(){
    }
    printManifest(){
    }
}
