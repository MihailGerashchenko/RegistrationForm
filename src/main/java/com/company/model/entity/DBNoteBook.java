package com.company.model.entity;

public enum DBNoteBook {
    NOTE_ONE("Miroslav", "karabas25"),
    NOTE_TWO("Aslan", "tatata228"),
    NOTE_THREE("Juliany", "karas88"),
    NOTE_FOUR("Naum", "hangover111");

    private final String firstName;
    private final String login;

    DBNoteBook(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    public static boolean chekLogin(String loginData) {
        for (DBNoteBook note : DBNoteBook.values()) {
            if (note.getLogin().equals(loginData)) {
                return true;
            }
        }
        return false;
    }
}
