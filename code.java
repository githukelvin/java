
import java.util.Scanner;
/**
 * code
 */
public class code {
    String nameOfStation;
    String nameOfPolice;
    // date
    String date;
    int incident;



    String createCode(String name)
    {
        // scan user input
        Scanner scanName = new Scanner(System.in);
        System.out.println("Enter the name of the station");
        nameOfStation = scanName.nextLine();
        System.out.println("Police name is :" + name);
        nameOfPolice = name;
        System.out.println("Enter date of the incident . \n  Format is  dd/mm/yyyy");
        date = scanName.nextLine();
        System.out.println("Incident Number");
        incident = Integer.parseInt(scanName.nextLine());
        // scanName.close();
        // create object  code
        String uniqueCode = nameOfStation+"/"+date+"/"+incident+"-"+nameOfPolice;


        // System.out.println("This is  the Unique Code  :" + uniqueCode);

        
        return uniqueCode;

    }
    


    // create a unique that contains name of station,date of the incident,serial number
   
    
}