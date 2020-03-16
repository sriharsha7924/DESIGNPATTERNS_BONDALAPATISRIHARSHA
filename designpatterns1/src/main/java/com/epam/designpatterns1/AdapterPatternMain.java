package com.epam.designpatterns1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; 
public class AdapterPatternMain {
	 public static void main(String args[]){  
		 Logger LOGGER=LogManager.getLogger(ConstructionCostUsingFactoryMain.class);
		  CreditCardTargetClassForAdapterPattern targetInterface=new BankCustomerAdapterClass();  
		  targetInterface.giveBankDetails();  
		  LOGGER.info(targetInterface.getCreditCard());  
		 }   
}
