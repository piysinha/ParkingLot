package ParkingLot.Services;

import ParkingLot.DTO.IssueTicketRequestDTO;
import ParkingLot.Exceptions.GateNotFoundException;
import ParkingLot.Exceptions.ParkingLotNotFoundException;
import ParkingLot.Models.*;
import ParkingLot.Models.Factories.SlotAllocationFactory;
import ParkingLot.Models.Strategies.SlotAllocationStrategy.SlotAllocationStrategy;
import ParkingLot.Models.enums.SlotAllocationStrategyType;
import ParkingLot.Models.enums.VehicleType;
import ParkingLot.Repository.GateRepository;
import ParkingLot.Repository.ParkingLotRepository;
import ParkingLot.Repository.TicketRepository;
import ParkingLot.Repository.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    GateRepository gateRepository;
    VehicleRepository vehicleRepository;
    ParkingLotRepository parkingLotRepository;
    TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository){
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket (String vehicleNumber, String ownerName, VehicleType vehicleType,Long gateNumber) throws GateNotFoundException, ParkingLotNotFoundException {
        //1. Create a ticket
        Ticket ticket = new Ticket();
        //2. Fill all the data(attributes)

        //set ID

        //set createdDate

        //set lastUpdatedAt

        //set entry time
        ticket.setEntryTime(new Date());

        //set gate
        //we have a database we have tables for all the models which we have created
        // table for vehicle, table for gate, table for operator, table for parking-lot etc
        //table for gate this will store all the information about all the gates of all the parking lots
        //I want to get gate details for the given gate number.
        //I will execute a SQL query to the gate table and get the gate data for that gate number.
        // I will use repositories to handle all the crud operations on a model.

        Optional<Gate> gateOptional = gateRepository.getGateByGateNumber(gateNumber);
        if(!gateOptional.isPresent()){
            throw new GateNotFoundException("Gate does not exist for the given ID " + gateNumber);
        }
        Gate gate = gateOptional.get();
        ticket.setGeneratedAt(gate);

        //set operator
        ticket.setGeneratedBy(gate.getCurrentOperator());

        //set vehicle
        //get vehicle from DB if it exists then we can set it in the ticket
        //if vehicle record does not exist in the DB then add a new record in table
        Optional<Vehicle> vehicleOptional = vehicleRepository.getVehicleByNumber(vehicleNumber);
        Vehicle savedVehicle;

        if(!vehicleOptional.isPresent()){
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle.setNameOfOwner(ownerName);

            // save this vehicle object to the DB table if the entry is not present
            savedVehicle = vehicleRepository.saveVehicle(vehicle);
        }else{
            savedVehicle = vehicleOptional.get();
        }
        ticket.setVehicle(savedVehicle);
        //set assigned parking slot
        //for this parking lot we will have to get the strategy
        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.getParkingLotByGateId(gate.getId());
        if(!parkingLotOptional.isPresent()){
            throw new ParkingLotNotFoundException("Parking Lot Not Found");
        }
        ParkingLot parkingLot = parkingLotOptional.get();
        SlotAllocationStrategyType strategyType = parkingLot.getSlotAllocationStrategy();
        SlotAllocationStrategy slotAllocationStrategy = SlotAllocationFactory.getSlotAllocationStrategy(strategyType);
        ParkingSlot assignedSlot = slotAllocationStrategy.getParkingSlot(gate,vehicleType);
        ticket.setParkingSlot(assignedSlot);

        //Save the ticket to DB table.
        ticket = ticketRepository.saveTicket(ticket);

        //set ticket number;

        ticket.setTicketNumber("Ticket_"+ticket.getId());

        //3. Give back to the controller
        return ticket;
    }
}
