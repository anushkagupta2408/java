class Singleinheritance{
float salary=40000;

public static void main(String args[]){
Programmer P=new Programmer();
System.out.println("Programmer salary "+P.salary);
System.out.println("Programmer bonus "+P.bonus);
}
}

class Programmer extends singleinheritance{
int bonus=10000;
}