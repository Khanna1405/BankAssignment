import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int UserOption, input, UserInput;
        System.out.println("Choose 1 to continue and any other integer to exit:");
        input = sc.nextInt();
        sc.nextLine();
        while (input == 1) {
            System.out.println(" for new customer press 1 and for existing customer press 2");
            UserInput = sc.nextInt();

           BankStatement CustInput=new BankStatement();


            if (UserInput==1){
                System.out.println("Please Enter Customer Name:");
                BankStatement.name=sc.next();
                System.out.println("Please Enter registered mobile no. ");
                BankStatement.mobileNo=sc.next();
                System.out.println("Please Entered PAN number");
                BankStatement.PAN=sc.next();
                System.out.println(" please entered registered email id:");
                BankStatement.emailID=sc.next();
                System.out.println(" Please add your account type:");
                BankStatement.acctype=sc.next();
                System.out.println("Please add branch code:");
                BankStatement.Branch=sc.next();
                Account.CustomerDetail();


            }
            else if (UserInput==2){
                System.out.println(" Please enter an input, 1 for customer detail, 2 for transaction, 3 for account statement");
                UserOption=sc.nextInt();
                switch(UserOption){
                    case 1:
                        CustInput.ExistCustomerDetail();
                        break;
                    case 2:
                        CustInput.Transaction();
                        break;
                    case 3:
                        CustInput.BankStatement();
                        break;
                    default:
                        System.out.println("not a valid input");
                }




            }
            System.out.println("do you want to continue then press 1 else press any other integer ");
            input=sc.nextInt();

        }

    }
}
