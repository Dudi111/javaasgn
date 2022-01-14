import java.util.Scanner;

public class CalculateIncomeTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Income");
        double myIncome=sc.nextDouble();

        System.out.println("Total income tax= "+mttax(myIncome));

    }
    public static double mttax(double income){
        if (income<=50000){
            return 0;
        }else if (income>50000 && income<=60000){
            double saving=income-50000;
            double tax=saving/10;
            return tax;
        }else if (income>60000 && income<=150000){
            double saving=income-60000;
            double tax=saving/20;
            return tax+1000;
        }else {
            double saving=income-150000;
            double tax=saving/30;
            return tax+5500;
        }
    }
}
