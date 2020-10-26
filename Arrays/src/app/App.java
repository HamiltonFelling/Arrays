package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String sen[] = {"Rogan","Brandon"};
        String jun[] = {"Bryan", "Hamilton", "Kenadi", "Mason",};
        String sop[] = {"Luke", "Will", "Alexis", "Taten"};

    while (1 < 2){
        System.out.println("Please type a student name to know their grade level");

        String student = input.nextLine();

        for (int i = 0; i < sop.length; i++){
            if(student.equals(sop[i]))
                System.out.println("Grade 10");
        }

        for (int i = 0; i < jun.length; i++){
            if(student.equals(jun[i]))
                System.out.println("Grade 11");
        }

        for (int i = 0; i < sen.length; i++){
            if(student.equals(sen[i]))
                System.out.println("Grade 12");
        }
    }


    }
}