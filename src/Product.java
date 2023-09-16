import Types.VehicleType;
import Vehicles.Vehicle;

public class Product {
     private VehicleType typeOfVehicle;
     private Vehicle vehicle;

    public Product(VehicleType typeOfVehicle, Vehicle vehicle) {
        this.typeOfVehicle = typeOfVehicle;
        this.vehicle = vehicle;
    }

    public VehicleType getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(VehicleType typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    public void display(){
        this.vehicle.display();
        System.out.println();
        this.typeOfVehicle.display();
    }

}
