package ParkingLot.Models.Strategies.SlotAllocationStrategy;

import ParkingLot.Models.Gate;
import ParkingLot.Models.ParkingSlot;
import ParkingLot.Models.enums.VehicleType;

public interface SlotAllocationStrategy {
    public ParkingSlot getParkingSlot(Gate gate, VehicleType vehicleType);
}
