/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spanish.vocab.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Lloyd
 */
public class SpanishModel 
{
       final private HashMap<String, String> lesson6= new HashMap<>();
        
       
        
        public SpanishModel()
        {
            lesson6.put("disgusting","asqueroso");
            lesson6.put("animal","el bicho");
            lesson6.put("mess","el desorden");
            lesson6.put("to throw out","echar");
            lesson6.put("to spend","gastar");
            lesson6.put("fed up","harto");
            lesson6.put("stinking","hediondo");
            lesson6.put("pet","la mascota");
            lesson6.put("smell","el olor");
            lesson6.put("money","la plata");
            lesson6.put("to take a picture","sacar una foto");
            lesson6.put("to leave","abandonar");
            lesson6.put("to take care of","cuidar"); 
            lesson6.put("unemployed","desempleado"); 
            lesson6.put("to get rid of","deshacerse");
            lesson6.put("choice","eleccion");
            lesson6.put("shouts","los gritos");
            lesson6.put("home","el hogar");
            lesson6.put("limp","la cojera");
            lesson6.put("to plot","confabular");
            lesson6.put("mourning","el duelo");
            lesson6.put("middle age","la edad madura");
            lesson6.put("environment","el etorno");
            lesson6.put("to choose","escoger");
            lesson6.put("legacy","la herencia");  
            lesson6.put("influence","el influjo");
            lesson6.put("discomfort","el malestar");
            lesson6.put("to pose","plantear");
            lesson6.put("to reject","rechazar");
            lesson6.put("birth rate","la tasa de natalidad");
            lesson6.put("rudeness","la descortesia");
            lesson6.put("boundaries","los limites");
            lesson6.put("to get upset","molestarse");
            lesson6.put("reluctanctly","reganadientes");
            lesson6.put("to give up","renunciar");
            lesson6.put("to delay","retrasar");
            lesson6.put("to put up with","soportar");
            lesson6.put("view","la vision");
             
             
        }
    
        private String checkWord(String p, String h)
        {                 //args: spanish word entered, english word in textView used as key
        
        
            if(p.contains(lesson6.get(h)))//see if the spanish word they entered matches the value of the english word
            {
                 return "Correct";
            }
            else 
            {
                return "Nope!";
            }
            
        }
        
        public String checkAnswer(String p, String h)
        {
         
           
        
            
            return checkWord(p,h);
            
        }
        
       
        private String generateWord()//generates a random word
        {
             Random r= new Random();
             
               ArrayList<String> english= new ArrayList<>(lesson6.keySet());
               
               
               int index= r.nextInt(english.size());
        
               
               return english.get(index);
        }
        
       
        
        
        public String getWord()
        {
        
        
            return generateWord();
        }
        
        public String getCorrectWord(String w)
        {
        
                String correct= lesson6.get(w);
        
                
                return correct;
        }
        
        
}
