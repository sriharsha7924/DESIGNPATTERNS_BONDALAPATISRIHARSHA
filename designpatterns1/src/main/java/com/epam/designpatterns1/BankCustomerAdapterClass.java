package com.epam.designpatterns1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;  
import java.io.InputStreamReader;  
public class BankCustomerAdapterClass extends BankDetailsAdapteeClass implements CreditCardTargetClassForAdapterPattern {  
	Logger LOGGER=LogManager.getLogger(BankCustomerAdapterClass.class);
	public void giveBankDetails(){  
  try{  
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      
   LOGGER.info("Enter the account holder name :");  
   String customername=br.readLine();   
      
   LOGGER.info("Enter the account number:");  
   long accno=Long.parseLong(br.readLine());  
  
      
   LOGGER.info("Enter the bank name :");  
   String bankname=br.readLine();  
      
   setAccHolderName(customername);  
   setAccNumber(accno);  
   setBankName(bankname);  
   }catch(Exception e){  
        e.printStackTrace();  
   }  
  }  
  @Override  
  public String getCreditCard() {  
   long accno=getAccNumber();  
   String accholdername=getAccHolderName();  
   String bname=getBankName();  
          
   return ("The Account number "+accno+" of "+accholdername+" in "+bname+  
                        "bank is valid and authenticated for issuing the credit card. ");  
  }  
}