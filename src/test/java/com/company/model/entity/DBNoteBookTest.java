package com.company.model.entity;

import com.company.controller.Controller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.company.controller.RegexContainer.REGEX_NAME_LAT;
import static com.company.view.TextConstant.FIRST_NAME_DATA;
import static java.util.regex.Pattern.matches;
import static org.junit.jupiter.api.Assertions.*;

class DBNoteBookTest {

    @Test
    @DisplayName("Check login to compare with database")
    void testToCheckLogin() {
        String ONE_LOGIN = "karabas25";
        String TWO_LOGIN = "tatata228";
        String THREE_LOGIN = "karas88";
        String FOUR_LOGIN = "hangover111";
        String FIFTH_LOGIN = "maven228";

        Assertions.assertAll(
                // This tests display the logins from the database
                () -> assertTrue(DBNoteBook.chekLogin(ONE_LOGIN)),
                () -> assertTrue(DBNoteBook.chekLogin(TWO_LOGIN)),
                () -> assertTrue(DBNoteBook.chekLogin(THREE_LOGIN)),
                () -> assertTrue(DBNoteBook.chekLogin(FOUR_LOGIN)),
                // This test displays the login from an outsource
                () -> assertFalse(DBNoteBook.chekLogin(FIFTH_LOGIN)));
    }

    @Test
    @DisplayName("Check REGEX competence")
    void testToCheckREGEX() {
        String name = "Aleksiy";
        Pattern pattern = Pattern.compile(REGEX_NAME_LAT);
        Matcher matcher = pattern.matcher(name);
        assertTrue(matcher.matches());
    }
}