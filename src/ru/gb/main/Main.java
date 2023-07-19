package ru.gb.main;

import ru.gb.note.NoteManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NoteManager noteManager = new NoteManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите заметку: ");
        String noteContent = scanner.nextLine();
        noteManager.addNote(noteContent);
        scanner.close();
    }
}