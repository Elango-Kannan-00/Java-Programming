class Animal {
void Dog()
{
System.out.println("Barkingg!!!!!..");
}
}
class Cat extends Animal{
void Eat()
{
System.out.println("Eatingg!!!...");
}
}
class Tiger extends Animal{
void Weeping()
{
System.out.println("Weepinggg..!!!");
}
}
class Hierheritance{
public static void main(String[] args)
{
Tiger x = new Tiger();
x.Weeping();
//x.Eat();
x.Dog();
}
}