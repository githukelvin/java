// import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

/**
 * Askari
 * @author kelvin githu
 */
public class Askari extends mwananchi  {
    String lastName;
    String details;
    String OBNumber;
    int i;
    String policeName;
    String ob;

   code code = new code();
   


    private Scanner scanner = new Scanner(System.in);

    public String requestName() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);
        // scanner.close();
        return name;
    }


    public void enterDetails() {
        Askari askari = new Askari();
        mwananchi mwananchi = new mwananchi();
        policeName = askari.requestName();
        OBNumber = code.createCode(policeName);
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter details of Case OBNumber # :" + (i+1)+OBNumber + ": \n");
            ob = (i+1)+OBNumber;
           mwananchi.details(ob);
           mwananchi.display();
        }
        scanner.close();
        
    }


   
    
}