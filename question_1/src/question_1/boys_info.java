/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_1;

/**
 *
 * @author MUDIT
 */
public class boys_info {
    
        String name,gf;
        String type_of_boy;
        int attractiveness;
        int intelligence;
        int budget;
        int attraction_req;
        boolean status;

    public boys_info(String name, String gf, String type_of_boy, int attractiveness, int intelligence, int budget, int attraction_req, boolean status) {
        this.name = name;
        this.gf = gf;
        this.type_of_boy = type_of_boy;
        this.attractiveness = attractiveness;
        this.intelligence = intelligence;
        this.budget = budget;
        this.attraction_req = attraction_req;
        this.status = status;
    }

   
    
            
   boolean search_for_gf(boys_info boy1,girls_info girl1){
       
       if(boy1.budget >= girl1.maintenance_budget  && boy1.attraction_req <= girl1.attractiveness) {
           return true;
            } 
       else 
           return false;
       
   
   }
        
        
     
                
    
}
