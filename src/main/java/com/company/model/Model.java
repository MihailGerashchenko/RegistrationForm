/*
 * @(#) com.company.model 9.1 26 21/09/06
 *
 * Copyright (c) 2021 Mihail Gerashchenko.
 * Kiev, Ukraine.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Mihail
 * Gerashchenko ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with Mihail Gerashchenko.
 */
package com.company.model;

import com.company.controller.Group;
import com.company.model.entity.NoteBook;

/**
 * My programme aimed at users who need either to validate registration or subscription.
 *
 * @author Mihail Gerashchenko
 * @version 9.1 26 September 2021
 */
public class Model {

    private String surname;
    private String firstName;
    private String fathersName;
    private String abreviationName;
    private String nickName;
    private String comments;
    private Group group;
    private String homePhone;
    private String mobilePhone;
    private String secondMobilePhone;
    private String email;
    private String skype;
    private String adresID;
    private String currentCity;
    private String street;
    private String buildingNumber;
    private String appartmentNumber;
    private String wholeAdress;
    private String inputDate;
    private String lastChangeDate;

    public Model() {
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void setAbreviationName(String abreviationName) {
        this.abreviationName = abreviationName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setSecondMobilePhone(String secondMobilePhone) {
        this.secondMobilePhone = secondMobilePhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public void setAdresID(String adresID) {
        this.adresID = adresID;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void setAppartmentNumber(String appartmentNumber) {
        this.appartmentNumber = appartmentNumber;
    }

    public void setWholeAdress(String wholeAdress) {
        this.wholeAdress = wholeAdress;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
    }

    public void setLastChangeDate(String lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    @Override
    public String toString() {
        return "Model{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", abreviationName='" + abreviationName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comments='" + comments + '\'' +
                ", group=" + group +
                ", homePhone='" + homePhone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", secondMobilePhone='" + secondMobilePhone + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", adresID='" + adresID + '\'' +
                ", currentCity='" + currentCity + '\'' +
                ", street='" + street + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", appartmentNumber='" + appartmentNumber + '\'' +
                ", wholeAdress='" + wholeAdress + '\'' +
                ", inputDate='" + inputDate + '\'' +
                ", lastChangeDate='" + lastChangeDate + '\'' +
                '}';
    }
}
