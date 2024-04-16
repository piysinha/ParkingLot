package ParkingLot.Models;

import java.util.Date;

public class BaseModel {
    private Long id; //set id as auto increment
    private Date createdAt; // set as now - current time of the entry
    private Date updatedAt; // set as now

    public BaseModel(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
