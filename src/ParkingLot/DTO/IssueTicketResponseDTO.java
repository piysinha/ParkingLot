package ParkingLot.DTO;

import ParkingLot.DTO.enums.ResponseStatus;
import ParkingLot.Models.Ticket;

public class IssueTicketResponseDTO {
    private Ticket ticket;
    private String message;
    private ResponseStatus responseStatus;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
