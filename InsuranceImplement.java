package com.java.practice.opps;

interface InsImp{
	void calculatePremium();
	void calculateReturn();
}
class banks implements InsImp{
	void calculatePremium(double salary) {
		System.out.println("Premium: "+salary*0.05);
	}
	void calculateReturn(double salary) {
		System.out.println("Return: "+salary*0.02);
	}
}
public class InsuranceImplement {

	public static void main(String[] args) {
		banks obj = new banks();
		obj.calculatePremium(10000);
		obj.calculateReturn(10000);
	}

}
