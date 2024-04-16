package ParkingLot.Models.Strategies.SlotAllocationStrategy;

import ParkingLot.Models.Gate;
import ParkingLot.Models.ParkingSlot;
import ParkingLot.Models.enums.VehicleType;

public class RandomSlotAllocationStrategy implements SlotAllocationStrategy{

    @Override
    public ParkingSlot getParkingSlot(Gate gate, VehicleType vehicleType) {
        return null;
    }
}
