package com.wipro.flowcontrolstatements;

public class Ex7_fcs {
	public static void main(String[] args)
	{
		char var=args[0].charAt(0);
		if (var>='A'&&var<='Z')
		{
			System.out.println(var+"->"+Character.toLowerCase(var));
		}
		if(var>='a'&&var<='z')
		{
			System.out.println(var+"->"+Character.toUpperCase(var));
		}
	}

}
