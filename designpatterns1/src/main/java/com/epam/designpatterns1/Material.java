package com.epam.designpatterns1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; 
abstract class Material{  
	 Logger LOGGER=LogManager.getLogger(Material.class);
    protected double cost;  
    abstract void getConstructionCost();  

    public void calculateConstructionCost(int area){  
    	 LOGGER.info(area*cost);  
     }  
}
class  Standard extends Material{  
//@override  
public void getConstructionCost(){  
    cost=1200;              
}  
}
class AboveStandard extends Material{  
  //@override   
   public void getConstructionCost(){   
       cost=1500;  
  }   
}
class  HighStandard extends Material{  
  //@override  
   public void getConstructionCost(){   
       cost=1550;  
  } 
}