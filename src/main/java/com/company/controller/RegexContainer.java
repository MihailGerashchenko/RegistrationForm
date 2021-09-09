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
}
