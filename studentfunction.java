class studentfunction{
public static void main(String[] args){
student s1=new student();
student s2=new student();

s1.insertRecord(5,"avi");
s2.insertRecord(4,"anu");
s1.displayinformation();
s2.displayinformation();
}
}

class student{
int roll;
String name;

void insertRecord(int r,String n){
roll=r;
name=n;
}
void displayinformation(){
System.out.println(roll+" "+name);
}
}


