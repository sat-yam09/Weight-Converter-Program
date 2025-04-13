import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Double weight;
        Double newweight;
        int choice;

        System.out.println("<<--Welcome to weight Converter-->>");
        System.out.println("1: Kgs to lbs");
        System.out.println("2: lbs to kgs");

        System.out.print("Enter Choice: ");
        choice = s.nextInt();
        if (choice==1){
            System.out.print("Enter weight into kg: ");
            weight = s.nextDouble();
            newweight = weight*2.2046226218;
            System.out.printf("The new weight in lbs is %.2f", newweight);
        } else if (choice==2) {
            System.out.print("Enter weight into lb: ");
            weight = s.nextDouble();
            newweight = weight*0.45359237;
            System.out.printf("The new weight in lbs is %.2f", newweight);
        }
        else {
            System.out.println("Not valid choice");
        }


    }
}