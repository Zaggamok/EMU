/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailmodulemaker;

/**
 *
 * @author Frish
 */
public class ModuleFactory {
    public Module makeModule(String moduleType){
      if(moduleType == null){
         return null;
      }	
      if(moduleType.equalsIgnoreCase("Body")){
          return new BodyModule();
      }
      
      return null;
    }
}