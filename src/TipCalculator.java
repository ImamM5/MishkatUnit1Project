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
        double tPerPerson = (tBill/4) + tipPerPerson;

        System.out.println("Total tip amount: "+ tipAmount);
        System.out.println("Total bill including tip: "+ tTipBill);
        System.out.println("Tip per person: "+ tipPerPerson);
        System.out.println("Total per person: "+ tPerPerson);
        System.out.println("-------------------------------");

    }
}
