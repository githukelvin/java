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

    code code = new code();
    mwananchi mwananchi = new mwananchi();
   

    

    void requestName(){
        Scanner nme = new Scanner(System.in);
        System.out.println("Enter Your Last Name");
        lastName = nme.nextLine();
        System.out.println(lastName);

    }


    void enterDetails() {
        Askari askari = new Askari();
        askari.requestName();
        for (i = 0; i < 1; i++) {
               mwananchi.details();
        }
    }



   
    
}