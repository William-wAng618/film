package com.william.film.pojo;

import java.util.Date;

public class Schedule {
    private Integer scheduleId;

    private Integer movieId;

    private Integer theaterId;

    private Integer hallId;

    private String broadcastType;

    private Double schedulePrice;

    private Date scheduleDate;

    private Date scheduleBeginDateTime;

    private Date scheduleEndDateTime;

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(Integer theaterId) {
        this.theaterId = theaterId;
    }

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    public String getBroadcastType() {
        return broadcastType;
    }

    public void setBroadcastType(String broadcastType) {
        this.broadcastType = broadcastType;
    }

    public Double getSchedulePrice() {
        return schedulePrice;
    }

    public void setSchedulePrice(Double schedulePrice) {
        this.schedulePrice = schedulePrice;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public Date getScheduleBeginDateTime() {
        return scheduleBeginDateTime;
    }

    public void setScheduleBeginDateTime(Date scheduleBeginDateTime) {
        this.scheduleBeginDateTime = scheduleBeginDateTime;
    }

    public Date getScheduleEndDateTime() {
        return scheduleEndDateTime;
    }

    public void setScheduleEndDateTime(Date scheduleEndDateTime) {
        this.scheduleEndDateTime = scheduleEndDateTime;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleId=" + scheduleId +
                ", movieId=" + movieId +
                ", theaterId=" + theaterId +
                ", hallId=" + hallId +
                ", broadcastType='" + broadcastType + '\'' +
                ", schedulePrice=" + schedulePrice +
                ", scheduleDate=" + scheduleDate +
                ", scheduleBeginDateTime=" + scheduleBeginDateTime +
                ", scheduleEndDateTime=" + scheduleEndDateTime +
                '}';
    }
}