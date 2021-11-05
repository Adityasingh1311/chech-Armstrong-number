package com.company;

public class Main {
	public static void main(String[] args){
	int num2 = 153;
	int num1 = num2;
	int num = num2; int remainder = 0;
	int digit = 0;
	int result = 0;
	for(; num!=0; num/=10){
	   digit++;
	}
	for(; num1!=0; num1/=10) {
		remainder = num1 % 10;
		 result += (int) Math.pow(remainder, digit);
	}
	if(num2==result){
		System.out.println(num2+" is an armstrong number.");
	}
	else{
		System.out.println(num2+" is not an armstrong number.");
	}





	}

}