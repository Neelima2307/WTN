package com.wipro.OopClassesandObjects;

public class Ex1_OCO {
	double H,W,D;

Ex1_OCO(double Height,double Width ,double Depth)
		 {
	   	 H=Height;
		     W=Width;
		     D=Depth;
		 }
		    double volume()
		    { 
		    	double volume;
		        volume=H*W*D;
		        return volume;
		    }
 public static void main(String[] args) 
		    {
		    	Ex1_OCO box = new Ex1_OCO(7.5,77.3,7.6);
		        System.out.println(box.volume());
		    }
	}


