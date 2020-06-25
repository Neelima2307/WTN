package com.wipro.Overriding.Polymorphism;

class Fruit{
	String name;
	String taste;
	int size;
	public Fruit()
	{
		name="Apple";
		taste="sweet";
		size=10;
	}
	public void eat() {
		System.out.println(name+ " tastes "+taste);
	}
}
class Apple extends Fruit{
	public void eat()
	{
		System.out.println("It taste like Apple");
	}
}
class Orange extends Fruit
{
	public void eat() {
		System.out.println("It taste like Orange");
	}
}
public class Ex1_OP {
 public static void main(String[] args)
 {
	 new Fruit().eat();
	 new Apple().eat();
	 new Orange().eat();
 }
}
