/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.model.core.entities;

/**
 *
 * @author Klac
 */
abstract class Entity implements java.io.Serializable{

    public Entity() {
    }
    
        
    protected String normalizeText(String text){
        if(text == null || text.compareTo("") == 0) return null;
        if(text.contains(" ")){
            String[] texts = text.split(" ");
            StringBuilder sb = new StringBuilder();
            for(String texto : texts){
                sb.append(normalizeText(texto));
                sb.append(" ");
            }
            return sb.toString();
        }else{
            if(text.length() > 0){
                String newText = text.toLowerCase();
                return newText.replaceFirst(String.valueOf(newText.charAt(0)), String.valueOf(Character.toUpperCase(newText.charAt(0))));
            }
            return text;
        }
    }
   
}
