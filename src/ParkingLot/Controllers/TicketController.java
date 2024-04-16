package ParkingLot.Controllers;

import ParkingLot.DTO.IssueTicketRequestDTO;
import ParkingLot.DTO.IssueTicketResponseDTO;
import ParkingLot.DTO.enums.ResponseStatus;
import ParkingLot.Models.Ticket;
import ParkingLot.Services.TicketService;

public class TicketController {
    TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO){
        //validations
        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();
        try{
            Ticket ticket = ticketService.issueTicket(requestDTO.getVehicleNumber(),
                    requestDTO.getVehicleOwnerName(),
                    requestDTO.getVehicleType(),
                    requestDTO.getGateId());

            responseDTO.setTicket(ticket);
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception e){
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
            responseDTO.setMessage(e.getMessage());
        }
        return responseDTO;
    }
}
//Responsibilities of a controller

//take the input from the client
//interact with the client - getRequestDTO
//validate the request
//call the service, give it the input
//response from service