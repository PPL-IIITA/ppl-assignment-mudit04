/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author MUDIT
 */
public class utility_log {
    
    @SuppressWarnings("empty-statement")
            
    void generate_girls_info(int no_of_girl) throws IOException{
        
        char[] girl_type = new char[20];
        int attractiveness;
        int intelligence;
        int Maintainence_budget;
        Random rand = new Random();
        File file1 = new File("girls_info.csv");
        
        
        String [] type_of_girl = {"the choosy","the normal","the desperate"} ;
       
        
        
                try{
			FileWriter fw = new FileWriter(file1);
                        for (int i = 0; i < no_of_girl; i++) {
                            
                            attractiveness = rand.nextInt(100);
                            intelligence = rand.nextInt(100);
                            Maintainence_budget = rand.nextInt(1000);
                            
                            fw.write(( type_of_girl[rand.nextInt(10)%3])+",Girl-"+(i+1)+","+attractiveness+","+intelligence+","+Maintainence_budget+System.lineSeparator());
                        }
                        fw.close();
		}
                catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
                }
        }
    
        void generate_boys_info(int no_of_boys){
        
            int attractiveness;
            int intelligence;
            int budget;
            int attraction_req;
            Random rand = new Random();
             String [] type_of_boy =  {"The Miser","The Generous","The Geeks"};
            
            
            File file2 = new File("boys_info.csv");
                try{
			FileWriter fw = new FileWriter(file2);
                        for (int i = 0; i < no_of_boys; i++) {
                            
                            attractiveness = rand.nextInt(100);
                            intelligence = (rand.nextInt(100));
                            budget = (rand.nextInt(1000));
                            attraction_req = (rand.nextInt(100)) ;

                            
                            fw.write(( type_of_boy[rand.nextInt(10)%3])+",Boy-"+(i+1)+","+attractiveness+","+budget+","+intelligence+","+attraction_req+System.lineSeparator());
                            
                        }
                        fw.close();
		}
                catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
        }
        
        
        void generate_gifts(int no_of_gifts){
        
            Random rand = new Random();
            String temp;
            int price;
            int value;
            int lux_rating;
            int difficulty_for_gift;
            int utility_value,utility_class;
            String [] type_of_gift =  {"essential gift","luxury gift","utility gift"};
            
            
            File file3 = new File("gifts_info.csv");
            
         
                try{
			FileWriter fw = new FileWriter(file3);
                         for (int i = 0; i < no_of_gifts; i++) {
                             
                             price = rand.nextInt(1000)+1;
                             value = rand.nextInt(100);
                             
                             temp =  type_of_gift[rand.nextInt(10)%3];
                             
                             if( temp.equals("essential gift") ){
                         
                                   fw.write(temp+","+price+","+value+System.lineSeparator());
                                
                         }
                             else if( temp.equals("luxury gift") ){
                                 
                                   lux_rating = rand.nextInt(10);
                                   difficulty_for_gift = rand.nextInt(10);
                                   fw.write(temp+","+price+","+lux_rating+","+difficulty_for_gift+","+value+System.lineSeparator());
                                
                         }
                             else if( temp.equals("utility gift") ){
                         
                                   utility_value = rand.nextInt(100);
                                   utility_class = rand.nextInt(10);
                                   fw.write(temp+","+price+","+utility_value+","+utility_class+","+value+System.lineSeparator());
                                
                         }
                            
                        }
                        
                        fw.close();
                       
                        
		}
                catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
        }
        
        
    }
    
