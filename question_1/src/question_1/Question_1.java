/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author MUDIT
 */
public class Question_1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
   
    
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        utility_log info= new utility_log();
        
        info.generate_boys_info(100); // for generating random boys information
        
        info.generate_girls_info(50); // for generating random girls information
        
        info.generate_gifts(50); // for generating random different types of gifts
        
        
    int i=0;
    int maintenance_budget;
    int intelligence;
    int attractiveness;
    String name;
    String bf = ""; // intializing 
    String gf = ""; // intializing
    girls_info girl[] = new girls_info[100]; // object array for girls
    
    boys_info boy[] = new boys_info[200]; // object array for boys
        
   try{
        FileReader fr = null;
        BufferedReader br;
        fr=new FileReader("girls_info.csv"); // open girls_info file
        br=new BufferedReader(fr);
        String line = "";
        while((line=br.readLine())!=null) {
            
            String[] G = line.split(",");
            
            name = G[1];
            attractiveness =  Integer.parseInt(G[2]);
            intelligence =  Integer.parseInt(G[3]);
            maintenance_budget = Integer.parseInt(G[4]);
            
            girl[i] = new girls_info(name,bf,attractiveness,intelligence, maintenance_budget,false); // passing attributes in girls object
            i++;
        }
    }
   catch(FileNotFoundException e){
                            e.printStackTrace();
                    }catch(IOException e){
                            e.printStackTrace();
                    }
   /* catch(NullPointerException nx) {
        nx.printStackTrace();
    }
    catch(IOException e) {
        e.printStackTrace();
    }*/
   
   
   
   
   
   i=0;
   try{
        FileReader fr = null;
        BufferedReader br;
        fr=new FileReader("boys_info.csv"); // oopen boys_info file
        br=new BufferedReader(fr);
        String line = "";
        while((line=br.readLine())!=null) {
            
            String[] B = line.split(",");
            String type = B[0];
            name = B[1];
            attractiveness =  Integer.parseInt(B[2]);
            int budget = Integer.parseInt(B[3]);
            
            intelligence =  Integer.parseInt(B[4]);
            int req = Integer.parseInt(B[5]);
            
            boy[i] = new boys_info(name,gf,type,attractiveness,intelligence,budget,req,false); //// passing attributes in boys object
            i++;
        }
    }
   catch(FileNotFoundException e){
                            e.printStackTrace();
                    }catch(IOException e){
                            e.printStackTrace();
                    }
   /* catch(NullPointerException nx) {
        nx.printStackTrace();
    }
    catch(IOException e) {
        e.printStackTrace();
    }*/
   
   
   File file = new File("ouput.csv");
   
    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Calendar calobj = Calendar.getInstance();
    
    FileWriter fw = new FileWriter(file);
    /*try{
                fw.write("Type_of_Event,BoyFriend,GirlFriend,Date_Time_Stamp"+System.lineSeparator());
        }
        catch(FileNotFoundException e){
                e.printStackTrace();
        }catch(IOException e){
                e.printStackTrace();
        }*/
    
    
    for(i=0;i<50;i++){
    
       for(int j=0;j<100;j++){
        
            if(boy[j].search_for_gf(boy[j], girl[i]) &&  boy[j].status == false && girl[i].status == false){ // check if they can be coupled or not
                
                
                    boy[j].status = true;
                    girl[i].status = true;
                try{
                            fw.write("boy-"+j+","+" get Commited with"+","+"girl-"+i+","+df.format(calobj.getTime())+System.lineSeparator());//writing in output file 
                            
                    }
                    catch(FileNotFoundException e){
                            e.printStackTrace();
                    }catch(IOException e){
                            e.printStackTrace();
                    }
            }
            
            
        }
       
        
    }
    fw.close();
        
    }

   
    
}
