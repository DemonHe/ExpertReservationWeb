package com.service.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;

    @Column(name = "expertName")
    private String expertName;

    @Column(name = "title")
    private String title;

    @Column(name = "professionalType")
    private String professionalType;

    @Column(name = "text")
    private String text;

    @Column(name = "serviceType")
    private String serviceType;

    @Column(name = "subscribeTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date subscribeTime;

    public String getExpertName() {
        return expertName;
    }

    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProfessionalType() {
        return professionalType;
    }

    public void setProfessionalType(String professionalType) {
        this.professionalType = professionalType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Date getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getSubscribeAddress() {
        return subscribeAddress;
    }

    public void setSubscribeAddress(String subscribeAddress) {
        this.subscribeAddress = subscribeAddress;
    }

    @Column(name = "deadline")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deadline;

    @Column(name = "subscribeAddress")
    private String subscribeAddress;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }


}
