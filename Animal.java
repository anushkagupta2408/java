
//heirarical inheritance
class Animal{
void eat(){
System.out.println("animal is eating");
}
public static void main(String args []){
Dog d= new Dog();
d.eat();
d.bark();
Cat c=new Cat();
c.eat();
c.meow();
}
}
class Dog extends Animal{
void bark(){
System.out.println("dog is barking");
}
}





class Cat extends Animal{
void meow(){
System.out.println("catv is meowing");
}
}

