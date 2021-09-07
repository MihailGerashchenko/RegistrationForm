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
/**
 * My programme aimed at users who need either to validate registration or subscription.
 *
 * @author Mihail Gerashchenko
 * @version 9.1 26 September 2021
 */
public interface RegexContainer {

    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_LOGIN = "[A-Za-z0-9_-]{1,20}";
    String FOR_COMMENTS = "^[A-Z][a-z]{1,20}$";
    String GROUP = "[A-Z]{4,9}";
    String PHONE_NUMBER = "^[0-9]{6,20}$";
    String MOBILE_NUMBER = "^.[0-9]{5,15}$";
    String EMAIL = "^[a-zA-Z\\d][\\w\\.-]{0,15}@[a-zA-Z]{1,10}\\.((com|net|org)(\\.ua)?|ua|ru)$";
    String INDEX = "[0-9]{3,7}";
    String BUILDING = "[A-Za-z0-9_-]{1,10}";
    String APPARTMENT = "[A-Za-z0-9_-]{1,10}";
    String FIRST_DATE = "[0-9_.]{1,10}";
    String LAST_DATE = "[0-9_.]{1,10}";
}
