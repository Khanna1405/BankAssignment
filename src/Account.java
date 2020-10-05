import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Account {
    public static String name;
    public static String accNo;
    public  static String PAN, acctype,gender,emailID,Branch;
    public  static String mobileNo;
    Scanner sc=new Scanner(System.in);

    public  static String accNo(){
        accNo= Branch+"1234";
        return accNo;

    }


    public static String getDate() {
        DateFormat df = new SimpleDateFormat();
        Date date = new Date();
        return df.format(date);
    }

    public static void CustomerDetail() {

        System.out.println("Hi, " + name + " you have successfully added  " +acctype + " account with PAN number:" + PAN + " and  Mobile No.:" + mobileNo+" with this account number "+accNo()+" on: "+getDate());

    }
    public static void ExistCustomerDetail(){
    System.out.println("Name: "+name+", Account no.: "+accNo+ ", Account Type: "+acctype+", Registered mobile number: "+mobileNo);
}


}

