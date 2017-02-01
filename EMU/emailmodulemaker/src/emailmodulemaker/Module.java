/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailmodulemaker;

import java.io.File;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author Frish
 */
public class Module {
    String moduleID = "";
    String moduleType = "";
    String moduleFilePath = "";
    
    
    // Method used to alter text in active document
    public void changeField(String field, String newText){
        // initiate change of module text
        File in = new File(moduleFilePath);
        Document htmlFile = null;
        try{
            htmlFile = Jsoup.parse(in, null);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        Element span = htmlFile.getElementById(field);
        System.out.println(span);
        
        span.text("hello world");
        System.out.println(span);
        
        
        
        System.out.println(htmlFile.body());
        // span ID
    }
    
    
    /////////////////////////////////////
    /////          VERBS            /////
    /////////////////////////////////////
    
    /**
    * @param s             new text for input field
    */
    
    public void changeHeader(String s){
        changeField("txt_sub", s);
    }
    
    public void changeSubtitle(String s){
        changeField("txt_sub", s);
    }
    
    public void changeBlurb(String s){
        changeField("txt_blurb", s);
    }
    
    /**
     * @param s             new text for input field
     * @param url           page url
     */
    public void changeBtn(String s, String url){
        changeField("CTA", s);
        changeField("CTA-URL", s);
    }
}
