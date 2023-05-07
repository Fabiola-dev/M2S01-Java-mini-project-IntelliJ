package Semana01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        ArrayList<String> studentsName = new ArrayList<>();

        Scanner entry = new Scanner(System.in);
        System.out.println("Enter student name or the word FIM to stop:");
        String inputValue = entry.next();

        while (!inputValue.equalsIgnoreCase("FIM")) {
            studentsName.add(inputValue);
            System.out.println("Enter student name or the word FIM to stop:");
            inputValue = entry.next();
        }


    }
}
