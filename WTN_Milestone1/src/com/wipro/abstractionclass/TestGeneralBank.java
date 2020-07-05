package com.wipro.abstractionclass;

public class TestGeneralBank {
	public static void main(String[] args)
	{
	ICICIBank iciciBank = new ICICIBank();
	KotMBank kotMBank = new KotMBank();
	System.out.println(iciciBank.getSavingIntrestRate());
	System.out.println(iciciBank.getFixedIntrestRate());
	System.out.println(kotMBank.getSavingIntrestRate());
	System.out.println(kotMBank.getFixedIntrestRate());
	GeneralBank obj = new ICICIBank();
	GeneralBank obj2 = new KotMBank();
	System.out.println(obj.getSavingIntrestRate());
	System.out.println(obj2.getSavingIntrestRate());
	System.out.println(obj.getFixedIntrestRate());
	System.out.println(obj2.getFixedIntrestRate());
	}
}
