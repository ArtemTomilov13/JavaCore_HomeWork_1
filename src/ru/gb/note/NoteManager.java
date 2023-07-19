package ru.gb.note;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class NoteManager {
    public void addNote(String content) {
        try {
            LocalDateTime timestamp = LocalDateTime.now();
            String note = "[" + timestamp + "]" + content + "\n";

            FileWriter fileWriter = new FileWriter("notes.txt", true);
            fileWriter.write(note);
            fileWriter.close();

            System.out.println("Заметка успешно добавлена");

        } catch (IOException e) {
            System.out.println("Произошла ошибка при добавлении заметки");
            e.printStackTrace();
        }
    }
}
