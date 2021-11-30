
package birthyearcalculator;
import java.util.Scanner;
/** 
 * @author Eden Kendo-Pindi
 */
public class BirthYearCalculator {

   
    public static void main(String[] args) {
       Scanner info = new Scanner(System.in);
       System.out.printf("Please input a birth year:  ");
       String birthYear = info.nextLine();
String firstTwodigits = birthYear.substring(0,2);
char decade = birthYear.charAt(2);

System.out.println("Birth year:  "+birthYear);
System.out.printf("Century   :  ");
System.out.println(Integer.parseInt(firstTwodigits )+ 1);
System.out.println("Decade    :  "+decade);
    }
    
}
