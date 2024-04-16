package ParkingLot.Repository;

import ParkingLot.Models.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {

    private Map <String,Vehicle> vehicleTable = new TreeMap<>();
    public Optional<Vehicle> getVehicleByNumber(String vehicleNumber){
        //String response = db.execute("select * from vehicle where vehicle_Number = vehicleNumber")
        //vehicle vehicleObject = convertResponseToVehicle(response);
        //if(vehicleObject != null){
        //      return Optional.of(vehicleObject);
        //}
        if(vehicleTable.containsKey(vehicleNumber)){
            return Optional.of(vehicleTable.get(vehicleTable));
        }
        return Optional.empty();
    }
    public Vehicle saveVehicle(Vehicle vehicle){
        //db.execute = "insert into vehicle (vehicle_number, owner_name, vehicle_type)
        //              values (vehicle.getVehicleNumber(),vehicle.getNameOfOwner(),vehicle.getVehicleType)"
        //String response = db.execute("select * from vehicle where vehicle_Number = vehicleNumber")
        //vehicle = convertResponseToVehicle(response);
        //if(vehicle != null){
        //      return Optional.of(vehicle);
        //}

        vehicleTable.put(vehicle.getVehicleNumber(),vehicle);

        return vehicle;

    }
}
