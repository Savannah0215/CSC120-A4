public class Engine implements Driver {
    double currentFuel;
    double maxFuel;
    String FuelType;

    public Engine() {
      currentFuel = 100.0d;
      maxFuel = 100.0d;
    }
    private void refuel(){
      currentFuel = maxFuel;
    }

    private boolean go(){
      currentFuel = currentFuel - 25.0;
      System.out.println("Remaining fuel level: " + currentFuel);
      if (currentFuel > 0){
        return true;
      } else {
        return false;
      }
        
        
    }
}
