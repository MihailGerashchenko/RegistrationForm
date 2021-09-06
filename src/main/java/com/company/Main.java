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
package com.company;
import com.company.controller.Controller;
import com.company.model.Model;
import com.company.view.View;
/**
 * My programme aimed at users who need either to validate registration or subscription.
 *
 * @author Mihail Gerashchenko
 * @version 9.1 26 September 2021
 */
public class Main {

    public static void main(String[] args) {

        Controller controller =
                new Controller(new Model(), new View());
        // Run
        controller.processUser();

    }
}
