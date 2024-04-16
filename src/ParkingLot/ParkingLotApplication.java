package ParkingLot;

import ParkingLot.Controllers.TicketController;
import ParkingLot.Repository.GateRepository;
import ParkingLot.Repository.ParkingLotRepository;
import ParkingLot.Repository.TicketRepository;
import ParkingLot.Repository.VehicleRepository;
import ParkingLot.Services.TicketService;

public class ParkingLotApplication {
    public static void main(String[] args) {

        // We have to resolve the repositories
        //what solves the dependency graphs?? topological sorting
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        //how do you store data in memory;

    }
}
