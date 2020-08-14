import java.util.Scanner;

public class BankStatement extends BankTransaction{
    public static int UserInput;

    static void BankStatement() {
        System.out.println("Please enter 1 for debited amount statement and 2 for credited amt statement and 3 for current balance: ");
        Scanner sc = new Scanner(System.in);
        UserInput = sc.nextInt();
        switch (UserInput) {
            case 1:
                System.out.println(name + " have  account no. : "+ accNo + " having " + acctype + " account type " + " debited " + debit + " rupees on " + getDate());
                break;
            case 2:
                System.out.println(name + " have account no.: "+accNo + " having " + acctype + " account type Credited " + Credit + " rupees on " + getDate());
                break;
            case 3:
                System.out.println("Hi, "+name+ " you have currently "+ (Credit-debit)+ " rupees in your account");
                break;
            default:
                System.out.println("Not a valid option");
        }


    }
}


