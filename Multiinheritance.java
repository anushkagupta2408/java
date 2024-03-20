class Multiinheritance{
float salary=40000;
int slry=60000;
public static void main(String args[]){
Programmer P=new Programmer();
System.out.println("Programmer salary "+P.salary);
System.out.println("Programmer bonus "+P.bonus);

Developer D=new Developer();
System.out.println("develper experience "+D.experience);
System.out.println("developer salary "+D.slry);
}
}
class Programmer extends Multiinheritance{
int bonus=10000;
}
class Developer extends Multiinheritance{
String experience="five years";
}