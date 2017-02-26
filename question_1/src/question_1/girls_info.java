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
public class girls_info {

    static String csv;
    
    String name,bf;
    String type_of_girl;
    int attractiveness;
    int intelligence;
    int maintenance_budget;
    boolean status;
    

    public girls_info(String name, String bf, int attractiveness, int intelligence, int maintenance_budget, boolean status) {
        this.name = name;
        this.bf = bf;
        this.attractiveness = attractiveness;
        this.intelligence = intelligence;
        this.maintenance_budget = maintenance_budget;
        this.status = status;
    }

    girls_info() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
    
    
    
}
