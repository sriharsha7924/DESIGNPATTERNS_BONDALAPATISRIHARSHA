package com.epam.designpatterns1;

public class AreaOfRectangleStrategyPattern implements Strategy{
	 @Override  
	    public float calculation(float length, float breadth) {  
	        return length*breadth;  
	    }  
}
