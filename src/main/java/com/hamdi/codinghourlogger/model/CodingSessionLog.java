package com.hamdi.codinghourlogger.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "coding_sessions")
public class CodingSession
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double hoursSpentCoding;
    private int numberOfBreaks;
    private boolean phoneUsed;
    private LocalDateTime date;
    private String projectWorkedOn;
    private String languageCodedIn;



    public CodingSession(){

    }
    //Getters
    public Long getId(){
        return id;
    }

    public double getHoursSpentCoding(){
        return hoursSpentCoding;
    }

    public int getNumberOfBreaks(){
        return numberOfBreaks;
    }

    public boolean isPhoneUsed(){
        return phoneUsed;
    }

    public LocalDateTime getDate(){
        return date;
    }

    public String getProjectWorkedOn(){
        return projectWorkedOn;
    }

    public String getLanguageCodedIn(){
        return languageCodedIn;
    }

    //Setters

    public void setHoursSpentCoding(double hoursSpentCoding){
        this.hoursSpentCoding = hoursSpentCoding;
    }

    public void setNumberOfBreaks(int numberOfBreaks){
        this.numberOfBreaks = numberOfBreaks;
    }

    public void setPhoneUsed(boolean phoneUsed){
        this.phoneUsed = phoneUsed;
    }

    public void setDate(LocalDateTime date){
        this.date = date;
    }

    public void setProjectWorkedOn(String projectWorkedOn){
        this.projectWorkedOn = projectWorkedOn;
    }

    public void setLanguageCodedIn(String languageCodedIn){
        this.languageCodedIn = languageCodedIn;
    }
}
