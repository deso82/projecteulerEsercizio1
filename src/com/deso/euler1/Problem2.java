package com.deso.euler1;

public class Problem2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int sum =0;
		for (int i=0;i<1000;i+=1){
			if(i%3==0 || i%5==0 ){
				sum+=i;
			}
		}
		long finish = System.currentTimeMillis();
		System.out.println("The result is: "+sum+" executed in "+(finish-start)+" ms");
	}
}
