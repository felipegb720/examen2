/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema0;
import java.util.*;
import gt.edu.url.examen2.problema2.DemostracionLista;
import gt.edu.url.examen2.problema4.PositionAtIndex;
import gt.edu.url.examen2.problema3.ListaPosicional;
import gt.edu.url.examen2.problema3.Position;
import gt.edu.url.examen2.problema5.DynamicStack;


/**
 *
 * @author Felipe
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("");
        System.out.println("    PARCIAL NUMERO 2 ");
        System.out.println("");
        System.out.println("    PROBLEMA NUMERO 2 ");
        System.out.println("    EN CLASE");
        System.out.println("");
        
        
        
        System.out.println("    PROBLEMA NUMERO 4 ");

        PositionAtIndex<String> ObjProblem4 = new PositionAtIndex<>(); 
		
        ObjProblem4.addFirst("ONTARIO");   // PAISES
	
        ObjProblem4.addFirst("CANADA");
	
        ObjProblem4.addLast("PANCH");
	
        ObjProblem4.addLast("CALGARY");
	
        ObjProblem4.addFirst("SASKETCHUAN");
	
        System.out.println(ObjProblem4.positionAtIndex(4).getElement()); //  OBTENCION DE VAOR A INDEX
        
       
                
        System.out.println("    PROBLEMA NUMERO 3 ");

        ListaPosicional<String> ObjProblem3 = new ListaPosicional<>(); 
        Position<String> Pointer0, Pointer1,Pointer2,Pointer3,Pointer4; 

        Pointer0 = ObjProblem3.addFirst("CANADA"); 

        Pointer1 = ObjProblem3.addAfter(Pointer0, "VANCOUVER"); 

        Pointer2 = ObjProblem3.addAfter(Pointer1, "TORONTO"); 

        Pointer3 = ObjProblem3.addAfter(Pointer2, "STRATON"); 

        Pointer4 = ObjProblem3.addAfter(Pointer3, "QUEBEC"); 

        ObjProblem3.addAfter(Pointer4, "MICHAEL SCOTT"); 

        System.out.println(Pointer1.getElement());  // INTECHANGE POInTER
        System.out.println(Pointer2.getElement());

        ObjProblem3.swap(Pointer1, Pointer2);

        String Path = null;
        do{
            try{
                
                Position<String> tempPosition = ObjProblem3.first();
                
                Path =ObjProblem3.remove(tempPosition);
               
                System.out.println(Path);
            }
            catch(Exception e){
                
                Path =null;
                break;
            }
        }

        while(Path != null);  
        
        
         System.out.println("    PROBLEMA NUMERO 5----------------- ");
         
         DynamicStack<String> ObjectProblem5 = new DynamicStack<>();
		
         ObjectProblem5.push("1");
		
         ObjectProblem5.push("2");
		
         ObjectProblem5.push("3");
		
         ObjectProblem5.push("4");
		
         ObjectProblem5.push("5");
                
         System.out.println(ObjectProblem5.pop());
        
}

}


        
    
    

