package ParkingLot.Models.Factories;

import ParkingLot.Models.Strategies.SlotAllocationStrategy.FarthestSlotAllocationStrategy;
import ParkingLot.Models.Strategies.SlotAllocationStrategy.NearestSlotAllocationStrategy;
import ParkingLot.Models.Strategies.SlotAllocationStrategy.RandomSlotAllocationStrategy;
import ParkingLot.Models.Strategies.SlotAllocationStrategy.SlotAllocationStrategy;
import ParkingLot.Models.enums.SlotAllocationStrategyType;

public class SlotAllocationFactory {
    public static SlotAllocationStrategy getSlotAllocationStrategy(SlotAllocationStrategyType strategyType){
        if(strategyType==SlotAllocationStrategyType.RANDOM){
            return new RandomSlotAllocationStrategy();
        }else if (strategyType == SlotAllocationStrategyType.NEAREST_TO_GATE){
            return new NearestSlotAllocationStrategy();
        }else{
            return new FarthestSlotAllocationStrategy();
        }
    }
}
