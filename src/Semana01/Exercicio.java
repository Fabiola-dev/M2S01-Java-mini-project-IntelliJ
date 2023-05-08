package Semana01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        ArrayList<String> studentsName = new ArrayList<>();
        ArrayList<float[]> studentGrades = new ArrayList<>();

        Scanner entry = new Scanner(System.in);
        System.out.println("Enter student name or the word FIM to stop:");
        String inputValue = entry.next();

        while (!inputValue.equalsIgnoreCase("FIM")) {
            studentsName.add(inputValue);
            System.out.println("Digite a primeira nota do aluno:");
            float nota1 = entry.nextFloat();
            System.out.println("Digite a segunda nota do aluno:");
            float nota2 = entry.nextFloat();
            System.out.println("Digite a terceira nota do aluno:");
            float nota3 = entry.nextFloat();

            float[] notas = new float[3];
            notas[0] = nota1;
            notas[1] = nota2;
            notas[2] = nota3;
            studentGrades.add(notas);

            System.out.println("Enter student name or the word FIM to stop:");
            inputValue = entry.next();
        }

        for ( int i = 0 ; i < studentsName.size() ; i++ ) {
            System.out.println("Student: " + studentsName.get(i));
            System.out.println("Grade: " + Arrays.toString(studentGrades.get(i)));

            double totalGrades = 0.0;
            for ( int j = 0 ; j < studentGrades.get(i).length ; j++) {
                totalGrades += studentGrades.get(i)[j];
            }
            double mean = totalGrades /studentGrades.get(i).length;
            System.out.println("Mean: " + mean);
        }

    }
}
