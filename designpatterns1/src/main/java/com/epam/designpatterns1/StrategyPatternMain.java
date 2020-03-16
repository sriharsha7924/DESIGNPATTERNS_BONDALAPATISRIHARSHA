package com.epam.designpatterns1;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; 
public class StrategyPatternMain {  
	 public static void main(String[] args) throws NumberFormatException, IOException {
    Logger LOGGER=LogManager.getLogger(StrategyPatternMain.class);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    LOGGER.info("Enter the length: ");  
    float value1=Float.parseFloat(br.readLine()); 
    LOGGER.info("Enter the breadth: ");  
    float value2=Float.parseFloat(br.readLine());  
    ContextStrategy context = new ContextStrategy(new AreaOfRectangleStrategyPattern());
    LOGGER.info(" AreaOfRectangle= " + context.executeStrategy(value1, value2));  

    context = new ContextStrategy(new PerimeterOfRectangleStrategy()); 
    LOGGER.info(" PerimeterOfRectangle= " + context.executeStrategy(value1, value2));
 }  

}
