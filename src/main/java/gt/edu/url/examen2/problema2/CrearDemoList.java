/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema2;
import gt.edu.url.examen2.problema2.DemostracionLista;
/**
 *
 * @author Felipe
 */
public class CrearDemoList implements DemoList {
    
    public List<Integer>crearDemoLista(){
    
        List <Integer> MiLista = new DemostracionLista<>();    
        
        MiLista.add(0, 4);
        MiLista.add(0, 3);
        MiLista.add(0, 2);
        MiLista.add(1, 5);
        MiLista.add(1, 6);
        MiLista.add(3, 7);
        MiLista.add(0, 8);
        
        return MiLista;
    }
    
    

    
}
