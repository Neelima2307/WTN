package com.wipro.abstractionclass;
abstract class GeneralBank {
	abstract double getSavingIntrestRate();
	 abstract double getFixedIntrestRate();
	}
	 class ICICIBank extends GeneralBank
	{
	public double getSavingIntrestRate()
	{
	return 4.0;
	}
	public double getFixedIntrestRate()
	{
	return 8.5;
	}
	}
	 class KotMBank extends GeneralBank
	{
	public double getSavingIntrestRate() 
	{
	return 6.0;
	}
	public double getFixedIntrestRate()
	{
	return 9.0;
	}
}
