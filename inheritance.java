class Animal
{
void run()
{
System.out.println("running............");
}
}
class Dog extends Animal
{
void eat()
{
System.out.println("eating.............");
}
}
class Lion extends Dog
{
void sleep()
{
System.out.println("sleeping............");
}
}
class Inheritance
{
public static void main(String []args)
{
Lion l=new Lion();
l.eat();
l.sleep();
l.run();
}
}