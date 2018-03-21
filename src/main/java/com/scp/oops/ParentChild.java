package com.scp.oops;

public class ParentChild {

	public static void main(String[] args) {
new ParentChild().parentSpecific(10);
new ParentChild().parentSpecific(new Integer(10));
ParentChild parent=new Child();
parent.parent();
	}
	public void parent()
	{
		System.out.println("Override Parent...!!");
	}

	public void parentSpecific(int n)
	{
		System.out.println("Parent specific int...!!");
	}

	public void parentSpecific(float n)
	{
		System.out.println("Parent specific float...!!");
	}

public void parentSpecific(Integer n)
	{
		System.out.println("Parent specific Integer...!!");
	}
}
class Child extends ParentChild
{
	public void parent()
	{
		System.out.println("Override Child...!!");
	}
	public void childSpecific()
	{
		System.out.println("Child specific...!!");
	}
}
