package ParkingLot.Models;

import ParkingLot.Models.enums.ParkingSlotStatus;
import ParkingLot.Models.enums.VehicleType;

import java.util.List;

public class ParkingSlot extends BaseModel{
    private VehicleType vehicleTypes;
    private Vehicle vehicle;
    private ParkingFloor parkingFloor;
    private ParkingSlotStatus parkingSlotStatus;


    public VehicleType getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(VehicleType vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }
}
