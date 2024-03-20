import java.util.Scanner;
class CalenderExample{
public static void main(String args[]){
Calender calender=calender.getInstance();
System.out.println("the current date is: "+calender.getTime());

calender.add(calender.DATE,-15);
System.out.println("15 days ago: "+calender.getTime());

calender.add(calender.MONTH,-4);
System.out.println("4 months later: "+calender.getTime());

calender.add(calender.YEAR,-2);
System.out.println("2 year later: "+calender.getTime());
}
}