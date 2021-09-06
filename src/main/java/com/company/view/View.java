/*
 * @(#) com.company.view 9.1 26 21/09/06
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
package com.company.view;
import java.util.Locale;
import java.util.ResourceBundle;
import static com.company.view.TextConstant.INPUT_STRING_DATA;
import static com.company.view.TextConstant.WRONG_INPUT_DATA;
/**
 * My programme aimed at users who need either to validate registration or subscription.
 *
 * @author Mihail Gerashchenko
 * @version 9.1 26 September 2021
 */
public class View {

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    //new Locale("ua", "UA"));  // Ukrainian
                    new Locale("en"));        // English

    /**
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * @param message
     * @return
     */
    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }
}

