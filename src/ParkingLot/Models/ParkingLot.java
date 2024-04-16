package ParkingLot.Models;

import ParkingLot.Models.Strategies.FeeCalculationStrategy.FeeCalculationStrategy;
import ParkingLot.Models.Strategies.SlotAllocationStrategy.SlotAllocationStrategy;
import ParkingLot.Models.enums.FeeCalculationStrategyType;
import ParkingLot.Models.enums.ParkingLotStatus;
import ParkingLot.Models.enums.SlotAllocationStrategyType;
import ParkingLot.Models.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private List<VehicleType> allowedVehicleTypes;
    private ParkingLotStatus parkingLotStatus;
    private FeeCalculationStrategyType feeCalculationStrategyType;
    private SlotAllocationStrategyType slotAllocationStrategyType;

    public ParkingLot(){
        this.parkingFloors = new ArrayList<>();
        this.gates = new ArrayList<>();
        this.allowedVehicleTypes = new ArrayList<>();
        this.parkingLotStatus = ParkingLotStatus.OPEN;
        this.feeCalculationStrategyType = FeeCalculationStrategyType.HOURLY;
        this.slotAllocationStrategyType = SlotAllocationStrategyType.RANDOM;

    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public void setAllowedVehicleTypes(List<VehicleType> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public FeeCalculationStrategyType getFeeCalculationStrategy() {
        return feeCalculationStrategyType;
    }

    public void setFeeCalculationStrategy(FeeCalculationStrategyType feeCalculationStrategyType) {
        this.feeCalculationStrategyType = feeCalculationStrategyType;
    }

    public SlotAllocationStrategyType getSlotAllocationStrategy() {
        return slotAllocationStrategyType;
    }

    public void setSlotAllocationStrategy(SlotAllocationStrategyType slotAllocationStrategyType) {
        this.slotAllocationStrategyType = slotAllocationStrategyType;
    }
}
