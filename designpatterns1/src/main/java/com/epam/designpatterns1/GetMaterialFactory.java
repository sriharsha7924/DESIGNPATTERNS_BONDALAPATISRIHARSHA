package com.epam.designpatterns1;

public class GetMaterialFactory {
	  public Material getMaterial(String materialType){  
          if(materialType == null){  
           return null;  
          }  
        if(materialType.equalsIgnoreCase("Standard")) {  
               return new Standard();  
             }   
         else if(materialType.equalsIgnoreCase("Above Standard")){  
              return new AboveStandard();  
          }   
        else if(materialType.equalsIgnoreCase("High Standard")) {  
              return new HighStandard();  
        }
    return null;  
	  }
}
