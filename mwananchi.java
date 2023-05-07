/**
 * mwananchi
 * @author githu
 */
public class mwananchi  extends code{
    String firstName; 
    String lastName;
    String OBNumber;
    
    code code = new code();



    void details() {
        OBNumber = code.createCode();
        System.out.println("This is OB number :" + OBNumber);
    }
    
}