package com.company.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputNoteNoteBookTest {
    InputNoteNoteBook inputNoteNoteBook = new InputNoteNoteBook();

    @Test
    @DisplayName("To test the method to interface the abbreviation name ")
    void TestAbbreviationName() {
        assertTrue(inputNoteNoteBook.makeUpAbbreviationName());
    }

    @Test
    @DisplayName("To test the method to interface comprehensive adress")
    void makeUpComprehensiveAdress() {
        assertTrue(inputNoteNoteBook.makeUpComprehensiveAdress());
    }
}