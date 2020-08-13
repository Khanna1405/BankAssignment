import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Account {
    public static String name;
    public static int accNo=523456;
    public  static String PAN, acctype,gender,emailID,Branch;
    public  static String mobileNo;
    Scanner sc=new Scanner(System.in);


    public static String getDate() {
        DateFormat df = new SimpleDateFormat();
        Date dateobj = new Date();
        return df.format(dateobj);
    }

    public static void CustomerDetail() {
        System.out.println("Hi," + name + " you have successfully added account number " +accNo+" with " +acctype + " account with PAN number:" + PAN + " and emailID: " + emailID + " & Mobile No.:" + mobileNo+" has been registered with our bank on"+getDate());

    }
public static void ExistCustomerDetail(){
    System.out.println("Name: "+name+", Account no.: "+accNo+ ", Account Type: "+acctype+", Registered mobile number: "+mobileNo+", EmailID: "+emailID);
}


}

