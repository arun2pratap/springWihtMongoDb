package com.example.repo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;

@Document
public class OnTheBooksRoomsPace implements Serializable{

    @Id
    public String id;

    Integer propertyId;
    LocalDate asOfDate;
    LocalDate occupancyDate ;
    String segment;
    Integer rn;
    Double revenue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public LocalDate getOccupancyDate() {
        return occupancyDate;
    }

    public void setOccupancyDate(LocalDate occupancyDate) {
        this.occupancyDate = occupancyDate;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public Integer getRn() {
        return rn;
    }

    public void setRn(Integer rn) {
        this.rn = rn;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public LocalDate getAsOfDate() {
        return asOfDate;
    }

    public void setAsOfDate(LocalDate asOfDate) {
        this.asOfDate = asOfDate;
    }

    @Override
    public String toString() {
        return "OnTheBooksRoomsPace{" +
                "id='" + id + '\'' +
                ", propertyId=" + propertyId +
                ", asOfDate=" + asOfDate +
                ", occupancyDate=" + occupancyDate +
                ", segment='" + segment + '\'' +
                ", rn=" + rn +
                ", revenue=" + revenue +
                '}';
    }
}

