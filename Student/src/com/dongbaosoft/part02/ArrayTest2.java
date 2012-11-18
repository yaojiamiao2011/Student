package com.dongbaosoft.part02;

public class ArrayTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//以下为九九乘法表，动态数组；
		int intArr[][]=new int[9][];
		for (int i = 1; i < 10; i++) {
			int tmpArr[] = new int[i];

			for (int j = 1; j < i + 1; j++) {
				tmpArr[j - 1] = i * j;
			}
			intArr[i - 1] = tmpArr;
		}

		for (int tmpArr[] : intArr) {
			for (int tmpInt : tmpArr) {
				System.out.print(tmpInt + ";");
			}
			System.out.println("");
		}
	}

}
