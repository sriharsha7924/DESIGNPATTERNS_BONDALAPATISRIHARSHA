package com.epam.designpatterns1;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; 
import java.util.*;
public class ConstructionCostUsingFactoryMain {
	public static void main(String args[])throws IOException{
		 Logger LOGGER=LogManager.getLogger(ConstructionCostUsingFactoryMain.class);
		Scanner sc=new Scanner(System.in);
	      GetMaterialFactory Factory = new GetMaterialFactory();  
	        
	      LOGGER.info("Enter the type of material : ");   
	  
	      String materialName=sc.next()+sc.nextLine();  
	      LOGGER.info("Enter the area in square meters: ");  
	      int units=sc.nextInt();  
	      sc.close();
	      Material p = Factory.getMaterial(materialName);  
	      //call getgetConstructionCost() method and calculateConstructionCost()method of required type of material.  
	  
	      LOGGER.info("For material type "+materialName+" the cost for  "+units+" area is: ");  
	           p.getConstructionCost();  
	           p.calculateConstructionCost(units);  
	            }
	
}
