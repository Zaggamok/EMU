/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailmodulemaker;

import java.io.IOException;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;

/**
 *
 * @author Frish
 */
public class Emailmodulemaker {
    
    public static String templateFileLocation = "C:\\workspace\\mods_pf\\";
    public static String fileLocation = "C:\\workspace\\mods_pf\\body-template.xml";
    public static Document inputFile = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner ( System.in); // scanner for keyboard input
        ModuleFactory moduleFactory = new ModuleFactory();
        
        Module bodyModule = moduleFactory.makeModule("body");
        
        bodyModule.changeHeader("bodyModule header changes to this text.");
        
        String scannerInput = scanner.next();
                
        // print out input which is passed to module
        System.out.println("scannerInput = " + scannerInput);
        //System.out.println(inputFile.body());
        
        // may have to init Scanner and read on event
        
        // assemble template
        
        
        // save template
        
        
        
    }
    
    
    // TEMPLATE METHODS
    
    private static void fillTemplateWithModules(){
        // insert modules
        
        // save template
        
    }
    
    
    
    
    
    
    
    
    
    /**
     * Get document from location
     * @param fileLoc               file location
     
    public static void fetchContent(String fileLoc){
        
        
        // loads document and parses with Jsoup HTML parser
        try{
            inputFile = Jsoup.parse(new File(fileLoc), "UTF-8");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        
    }

    private static void fillModule() {
        Element span = inputFile.getElementById("txt_body");
        System.out.println(span);
        
        span.text("hello world");
        System.out.println(span);
    }

    private static void fetchTemplate(String fileLoc) {
            try{
            inputFile = Jsoup.parse(new File(fileLoc), "UTF-8");
        }
        catch(IOException e){
            e.printStackTrace();
        }    
    }
    */
    
}
