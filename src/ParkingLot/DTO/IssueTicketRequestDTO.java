package ParkingLot.DTO;

import ParkingLot.Models.enums.VehicleType;

public class IssueTicketRequestDTO {
    private String vehicleNumber;
    private String vehicleOwnerName;
    private String vehicleType;
    private Long gateId;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleOwnerName() {
        return vehicleOwnerName;
    }

    public void setVehicleOwnerName(String vehicleOwnerName) {
        this.vehicleOwnerName = vehicleOwnerName;
    }

//    public VehicleType getVehicleType() {
//        //return vehicleType;
//    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }
}
