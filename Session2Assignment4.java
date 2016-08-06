import java.util.Scanner;
public class Session2Assignment4
{
    public static void main(String [] args) 
    {

       Scanner sc = new Scanner(System.in);

       String month;
       System.out.print("Enter the month name: ");
       month = sc.next();

     switch(month)
      {
	case "January":
	       System.out.println("Total number of days in January is 31");
	       break;
	case "February":
	       System.out.println("Total number of days in February is 29");
	       break;
	case "March":
	       System.out.println("Total number of days in March is 31");
	       break;
	case "April":
               System.out.println("Total number of days in April is 30");
	       break;
	case "May":
	       System.out.println("Total number of days in May is 31");
	       break;
	case "June":
               System.out.println("Total number of days in June is 30");
	       break;
	case "July":
	       System.out.println("Total number of days in July is 31");
	       break;
	case "August":
               System.out.println("Total number of days in August is 31");
	       break;
	case "September":
	       System.out.println("Total number of days in September is 30");
	       break;
	case "October":
               System.out.println("Total number of days in October is 31");
	       break;
	case "November":
	       System.out.println("Total number of days in November is 30");
	       break;
	case "December":
	       System.out.println("Total number of days in December is 31");
	       break;
	default:
              System.out.println("Invalid Month. Please try again....");
	       break;
      }


     }

}