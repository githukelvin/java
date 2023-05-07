import java.util.Scanner;

/**
 * mwananchi
 * @author githu
 */
public class mwananchi  extends code{
    String firstName; 
    String lastName;
    String Case;
    int caseNumber;
    String Gender;
    int Age;
    String Address;
    String Phone;
    String OBNumber;
    

    
    code code = new code();



    void details(String number) {
        // scanner
        Scanner sc = new Scanner(System.in);
        // print welcome message
        System.out.println("Welcome to Mwananchi Reporting  and Cases ");
        // user input
        System.out.println("Enter  Mwananchi First Name");
        firstName = sc.nextLine();
        System.out.println("Enter Mwananchi Last Name");
        lastName = sc.nextLine();
        System.out.println("Enter Mwananchi Case Detail/ Case been reported");
        Case = sc.nextLine();
        System.out.println("Enter Mwananchi Case Number");
        caseNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Mwananchi Gender");
        Gender = sc.nextLine();
        System.out.println("Enter Mwananchi Age");
        Age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Mwananchi Address");
        Address = sc.nextLine();
        System.out.println("Enter Mwananchi Phone Number");
        Phone = sc.nextLine();
        System.out.println("This is the OB Number");
        OBNumber = number;
        System.out.println("This is the Case reported ");

        // print all  in table form
        


        
    }

    public void display() {
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Case : " + Case);
        System.out.println("Case Number : " + caseNumber);
        System.out.println("Gender : " + Gender);
        System.out.println("Age : " + Age);
        System.out.println("Address : " + Address);
        System.out.println("Phone Number : " + Phone);
        System.out.println("OB Number : " + OBNumber);
        // print end message
        System.out.println("Thank you for reporting ");
        
    }
    
}