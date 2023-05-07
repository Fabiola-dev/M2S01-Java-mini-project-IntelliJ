package Semana01;

import java.util.Scanner;

public class Exercicio {
    // Faça dentro do escopo do método main uma rotina
    // através de laço de repetição while um programa
    // que receberá nomes de alunos até que seja digitado
    // "fim”

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        System.out.println("Enter student name or the word FIM to stop:");
        String inputValue = entry.next();

        while (!inputValue.equalsIgnoreCase("FIM")) {
            System.out.println("Enter student name or the word FIM to stop:");
            inputValue = entry.next();
        }
    }
}
