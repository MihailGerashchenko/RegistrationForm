/*
 * @(#) com.company.controller 9.1 26 21/09/06
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
package com.company.controller;

import com.company.model.Model;
import com.company.model.entity.DBNoteBook;
import com.company.model.entity.NotUniqueLoginException;
import com.company.model.entity.NoteBook;
import com.company.view.View;

import java.util.Scanner;

import static com.company.controller.RegexContainer.*;
import static com.company.view.TextConstant.*;

/**
 * My programme aimed at users who need either to validate registration or subscription.
 *
 * @author Mihail Gerashchenko
 * @version 9.1 26 September 2021
 */
public class InputNoteNoteBook {
    private View view;
    private Scanner sc;
    private Model model;
    private NoteBook noteBook;

    public InputNoteNoteBook() {
    }

    public InputNoteNoteBook(View view, Scanner sc, Model model) {
        this.view = view;
        this.sc = sc;
        this.model = model;
    }

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
    private String comprehensiveAdress;
    private String inputDate;
    private String lastChangeDate;

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getComments() {
        return comments;
    }

    public Group getGroup() {
        return group;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getSecondMobilePhone() {
        return secondMobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public String getAdresID() {
        return adresID;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public String getStreet() {
        return street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getAppartmentNumber() {
        return appartmentNumber;
    }

    public String getInputDate() {
        return inputDate;
    }

    public String getLastChangeDate() {
        return lastChangeDate;
    }

    public String getAbreviationName() {
        return abreviationName;
    }

    public String getComprehensiveAdress() {
        return comprehensiveAdress;
    }


    public void inputNote() {
        UtilityController utilityController = new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.surname = utilityController.inputStringValueWithScanner(SURNAME_DATA, str);
        this.firstName = utilityController.inputStringValueWithScanner(FIRST_NAME_DATA, str);
        this.fathersName = utilityController.inputStringValueWithScanner(FATHERSNAME_DATA, str);

        this.nickName = utilityController.inputStringValueWithScanner(NICKNAME_DATA, REGEX_LOGIN);
        getNoteBook(sc, getFirstName(), getNickName(), utilityController);
        this.comments = utilityController.inputStringValueWithScanner(COMMENTS_DATA, FOR_COMMENTS);
        this.group = Group.valueOf(utilityController.inputStringValueWithScanner(GROUP_DATA, GROUP));
        this.homePhone = utilityController.inputStringValueWithScanner(HOME_NUMBER_DATA, PHONE_NUMBER);
        this.mobilePhone = utilityController.inputStringValueWithScanner(MOBILE_PHONE_DATA, MOBILE_NUMBER);
        this.secondMobilePhone = utilityController.inputStringValueWithScanner(SECOND_MOBILE_PHONE_DATA, MOBILE_NUMBER);
        this.email = utilityController.inputStringValueWithScanner(EMAIL_DATA, EMAIL);
        this.skype = utilityController.inputStringValueWithScanner(SKYPE_DATA, REGEX_LOGIN);
        this.adresID = utilityController.inputStringValueWithScanner(ADRES_ID_DATA, INDEX);
        this.currentCity = utilityController.inputStringValueWithScanner(CURRENT_CITY_DATA, str);
        this.street = utilityController.inputStringValueWithScanner(STREET_DATA, str);
        this.buildingNumber = utilityController.inputStringValueWithScanner(BUILDING_NUBMER_DATA, BUILDING);
        this.appartmentNumber = utilityController.inputStringValueWithScanner(APPARTMENT_NUMBER_DATA, APPARTMENT);
        this.inputDate = utilityController.inputStringValueWithScanner(INPUT_DATA, FIRST_DATE);
        this.lastChangeDate = utilityController.inputStringValueWithScanner(LAST_CHANGE_DATE, LAST_DATE);
        makeUpAbbreviationName();
        makeUpComprehensiveAdress();

        model.setSurname(getSurname());
        model.setFirstName(getFirstName());
        model.setFathersName(getFathersName());
        model.setNickName(getNickName());
        model.setComments(getComments());
        model.setGroup(getGroup());
        model.setHomePhone(getHomePhone());
        model.setMobilePhone(getMobilePhone());
        model.setSecondMobilePhone(getSecondMobilePhone());
        model.setEmail(getEmail());
        model.setSkype(getSkype());
        model.setAdresID(getAdresID());
        model.setCurrentCity(getCurrentCity());
        model.setStreet(getStreet());
        model.setBuildingNumber(getBuildingNumber());
        model.setAppartmentNumber(getAppartmentNumber());
        model.setInputDate(getInputDate());
        model.setLastChangeDate(getLastChangeDate());
        model.setAbreviationName(getAbreviationName());
        model.setWholeAdress(getComprehensiveAdress());
    }

    public boolean makeUpAbbreviationName() {
        StringBuilder sb = new StringBuilder();
        sb.append(getSurname()).append(" ").append(getFirstName().
                charAt(0)).append(".");
        this.abreviationName = sb.toString();
        return true;
    }

    public boolean makeUpComprehensiveAdress() {
        StringBuilder sb = new StringBuilder();
        sb.append(getAdresID()).append(" ").append(getCurrentCity()).
                append(" ").append(getStreet()).append(" ").append(getBuildingNumber()).
                append(" ").append(getAppartmentNumber());
        this.comprehensiveAdress = sb.toString();
        return true;
    }

    public NoteBook getNoteBook(Scanner sc, String firstName, String nickName, UtilityController utilityController) {
        NoteBook noteBook = null;
        for (; ; ) {
            try {
                noteBook = new NoteBook(firstName, nickName);

                break;
            } catch (NotUniqueLoginException e) {
                e.printStackTrace();
                System.out.println("Not unique login " + e.getLoginData());
                getLoginMethod(sc, utilityController);
            }
        }
        return noteBook;
    }

    private void getLoginMethod(Scanner sc, UtilityController utilityController) {
        for (; ; ) {
            String res = sc.nextLine();//utilityController.inputStringValueWithScanner(NICKNAME_DATA, REGEX_LOGIN);

            if (DBNoteBook.chekLogin(res)) {
                continue;
            } else {
                setNickName(res);
                //    setNickName();
                break;
            }
        }
    }
}

