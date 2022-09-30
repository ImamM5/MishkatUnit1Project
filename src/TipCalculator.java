import java.util.Scanner;

public class TipCalculator
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello welcome to Tip Calculator");
        System.out.println("-------------------------------");
        System.out.println();
        System.out.print("Please input the total bill: ");
        double tBill = input.nextDouble();
        System.out.print("Please input the tip percentage (in a whole number, without the percentage sign): ");
        double tTip = input.nextDouble();
        System.out.print("Please input the number of people in the party: ");
        int people = input.nextInt();
        System.out.println();

        double tipAmount = tBill*(tTip/100);
        double tTipBill = tBill + tipAmount;
        double tipPerPerson = (tBill/people) * (tTip/100);
        double tPerPerson = (tBill/people) + tipPerPerson;

        System.out.print("Total tip amount: ");
        System.out.printf("%.2f", tipAmount);
        System.out.println();
        System.out.print("Total bill including tip: ");
        System.out.printf("%.2f", tTipBill);
        System.out.println();
        System.out.print("Tip per person: ");
        System.out.printf("%.2f", tipPerPerson);
        System.out.println();
        System.out.print("Total per person: ");
        System.out.printf("%.2f", tPerPerson);
        System.out.println();
        System.out.println("-------------------------------");

    }
}
