import java.util.*;
public class PercentageOfMarks {
    public static void main(String[] args) {
    	Scanner scobj = new Scanner(System.in);
		System.out.print("Enter sub1 number:");
		float sub1 = scobj.nextFloat();
		System.out.print("Enter sub2 number:");
		float sub2 = scobj.nextFloat();
		System.out.print("Enter sub3 number:");
		float sub3 = scobj.nextFloat();
		System.out.print("Enter sub4 number:");
		float sub4 = scobj.nextFloat();
		System.out.print("Enter sub5 number:");
		float sub5 = scobj.nextFloat();
    		float totalMarks = sub1+sub2+sub3+sub4+sub5;
		System.out.println("Your totol marks is:" + totalMarks);
		float per = (totalMarks/500)*100;
		System.out.println("Your percentage is :"+ per);
    }
}
