package com.dongbaosoft.part02;

import java.util.Arrays;

public class ArrayTest {

	/**
	 * @param args
	 */
	public void printArr(int[] intArr1)
	{
		for(int tmpInt:intArr1)
		{
			System.out.println(tmpInt);
		}
		System.out.println("-------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArr1;
		intArr1=new int[]{1,7,11,3,5,13,2};
		ArrayTest t = new ArrayTest();
		//t.printArr(intArr1);
		Arrays.sort(intArr1);
		//t.printArr(intArr1);
		
		int[] intArr2;
		intArr2 = Arrays.copyOf(intArr1, 3);
		t.printArr(intArr2);
		
		Student stuArr[] = new Student[3];
		
		for(int i=0;i<3;i++)
		{
			stuArr[i] = new Student();
			stuArr[i].setAge(32);
			stuArr[i].setName("yao_"+(i+1));
			
		}
		
		for(Student tmpStu:stuArr)
		{
			System.out.println(tmpStu.getName());
		}
	}

}
