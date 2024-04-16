package ParkingLot.Models;

import ParkingLot.Models.enums.BillStatus;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private String billNumber;
    private Ticket ticket;
    private Date exitTime;
    private Gate generatedAt;
    private Operator generatedBy;
    private List<Payment> payments;
    private BillStatus billStatus;

    public Bill(){

    }
    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Gate getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(Gate generatedAt) {
        this.generatedAt = generatedAt;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}
