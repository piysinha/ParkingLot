package ParkingLot.Repository;

import ParkingLot.Models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
    private Map<Long,Ticket> ticketTable = new TreeMap<>();
    private static Long counter = 0L;
    // In order to maintain the uniqueness of the count in each server we use different algorithms
    public Ticket saveTicket(Ticket ticket){
        //db.execute("insert into ticket_table () values (ticket.getEntryTime...)")
        //String response = db.execute("select * from ticket_table where ticket_entry_time = ticket.getEntryDate();")
        // ticket = convertToTicketObject(response);
        counter++;
        ticket.setId(counter);
        ticketTable.put(counter,ticket);
        return ticket;
    }
}
