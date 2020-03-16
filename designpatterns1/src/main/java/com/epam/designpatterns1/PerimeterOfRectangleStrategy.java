package com.epam.designpatterns1;

public class PerimeterOfRectangleStrategy implements Strategy{
	 @Override  
	    public float calculation(float length, float breadth) {  
	        return 2*(length+breadth);  
	    } 
}
