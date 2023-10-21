package XYZ.InputString.view;

import java.util.Scanner;

import XYZ.InputString.controller.AnalyzeController;

public class Main {
    public static void main(String[] args) {
        AnalyzeController analyzeController = new AnalyzeController();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String");
        String analy = sc.nextLine();
        System.out.println("............Display.............\n"

                + "1.Display the list of number, list of even numbers, list of odd numbers, and list of square numbers.\n"
                + "2.Display the all characters, uppercase characters, lowercase characters, the special characters.\n");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                analyzeController.getNumber(analy);
                break;
            case 2:
                analyzeController.getCharacter(analy);
                break;
            case 3:
                break;
            default:
                break;
        }
    }
}
