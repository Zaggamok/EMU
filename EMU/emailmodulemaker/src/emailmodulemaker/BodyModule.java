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
 * Contains module contents and actions for Body module
 * @author Frish
 */
public class BodyModule extends Module {
    

    // content specific to Module
    static String BodyModuleFilePath = "C:\\workspace\\mods_pf\\body-template.xml";
    
    File inputFile = new File(BodyModuleFilePath);
    
    
    
    public String returnModuleContents(){
        String moduleContents = BodyModuleFilePath;
        
        return moduleContents;
    }
    
    public void changeField(String field, String newText){
        
        Document htmlFile = null;
        try{
            htmlFile = Jsoup.parse(inputFile, null);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        Element span = htmlFile.getElementById(field);
        System.out.println(span);
        
        span.text(newText);
        System.out.println(span);
        
        // return htmlFile
        
        String moduleContents = htmlFile.toString();
        
        
        //System.out.println(htmlFile.body());
        // span ID
    }
    
    public void changeHeader(String s){
        changeField("txt_body", s);
    }
    
    public void changeSubtitle(String s){
        changeField("txt_sub", s);
    }
    
    public void changeBlurb(String s){
        changeField("txt_blurb", s);
    }
    
    public void changeBtn(String s, String url){
        //changeField("CTA", s);
        //changeField("CTA=URL", url);
    }
    
}
