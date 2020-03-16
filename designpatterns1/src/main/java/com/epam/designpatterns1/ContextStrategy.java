package com.epam.designpatterns1;

public class ContextStrategy {
	 private Strategy strategy;  
     
     public ContextStrategy(Strategy strategy){  
        this.strategy = strategy;  
     }  

     public float executeStrategy(float num1, float num2){  
        return strategy.calculation(num1, num2);  
     }  
}
