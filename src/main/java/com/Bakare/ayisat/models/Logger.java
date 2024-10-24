package com.Bakare.ayisat.models;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    public Logger(String logs) {

        try(FileWriter fw = new FileWriter("src/main/resources/logs", true)) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println(logs);
            System.out.println(logs);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}