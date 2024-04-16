package ParkingLot.Repository;

import ParkingLot.Models.Gate;
import ParkingLot.Models.ParkingLot;

import java.util.*;

public class ParkingLotRepository {
    private Map<Long,ParkingLot> parkingLotTable = new TreeMap<>();
    public Optional<ParkingLot> getParkingLotByGateId (Long gateId){
        //String response = db.execute("Select * from parking_lots");
        //List<ParkingLot> parkingLotList = convertToParkingLotList(response);
        List<ParkingLot> parkingLotList = (List<ParkingLot>) parkingLotTable.values();
        for(ParkingLot parkingLot : parkingLotList){
            List<Gate> gatesList = parkingLot.getGates();
            for(Gate gate: gatesList){
                if(gate.getId()==gateId){
                    return Optional.of(parkingLot);
                }
            }
        }
        return Optional.empty();
    }
}
