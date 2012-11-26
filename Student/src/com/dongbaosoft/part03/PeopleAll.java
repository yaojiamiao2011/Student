package com.dongbaosoft.part03;

public class PeopleAll extends People implements Manager, Programer {

	@Override
	public void writeDoc() {
		// TODO Auto-generated method stub
		System.out.println("all - writeDoc");
	}

	@Override
	public void coding() {
		// TODO Auto-generated method stub
		System.out.println("all - coding");
	}

	@Override
	public void editRule() {
		// TODO Auto-generated method stub
		System.out.println("all - editRule");
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("all - study");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("all - work");
	}

}
