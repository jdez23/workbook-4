package com.pluralsight;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        NoteManager note = new NoteManager();

        // Create a new Note
        Note note1 = new Note(
                1, // id
                "Meeting Notes", // title
                "Discussed project roadmap and deadlines.", // description
                LocalDate.now(), // dateCreated
                "Work" // subject
        );

    }
}