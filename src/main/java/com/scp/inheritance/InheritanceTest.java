package com.scp.inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Only Parent...!!!!");
		Parent parent = new Parent();
		parent.mParent();

		System.out.println("Only Child...!!!!");
		Child child = new Child();
		child.mParent();
		child.mChild();

		System.out.println("Parent Hold Child...!!!!");
		Parent ParentRef = new Child();
		ParentRef.mParent();
		
	}

}
