/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.edu.ups.est.nuevo;

import Modelo.ColaTareas;
import Modelo.PilaTareas;
import Modelo.Tarea;
import java.util.ArrayList;

/**
 *
 * @author LAB-05
 */
public class Nuevo {

    public static void main(String[] args) {
        System.out.println("Colas y Pilas implementacopn generixca");
        ColaTareas<String> colaTareas = new ColaTareas<>();
        ColaTareas<Integer> colaTareasInt = new ColaTareas<>();
        ColaTareas<int[]> colaTareasArreglo = new ColaTareas<>();
        ColaTareas<String[]> colaTareasArregloString = new ColaTareas<>();
        
        PilaTareas<Integer> pilaTareas = new PilaTareas<>();
        PilaTareas<ColaTareas> pilaTareasDeColas = new PilaTareas<>();
        
        
        colaTareas.agregarTarea(new Tarea(1,"Tarea1"));
        colaTareas.agregarTarea(new Tarea(2,"Tarea2"));
        colaTareas.agregarTarea(new Tarea(3,"Tarea3"));
        colaTareas.agregarTarea(new Tarea(4,"Tarea4"));
        colaTareas.agregarTarea(new Tarea(5,"Tarea5")); 
        
        colaTareasInt.agregarTarea(new Tarea(1,1));
        colaTareasInt.agregarTarea(new Tarea(2,2));
        colaTareasInt.agregarTarea(new Tarea(3,3));
        colaTareasInt.agregarTarea(new Tarea(4,4));
        colaTareasInt.agregarTarea(new Tarea(5,5));
        
        int[]a= new int[]{1,2,3};
        Integer[] b= {1,2,3};
        Integer[] c= {1,2,3};
        colaTareasArreglo.agregarTarea(new Tarea(1, a));
        colaTareasArreglo.agregarTarea(new Tarea(2, b));
        colaTareasArreglo.agregarTarea(new Tarea(3, c));

        String[] d ={"A","a","A"};
        String[] e ={"A","a","A"};
        String[] f ={"A","a","A"};
        colaTareasArregloString.agregarTarea(new Tarea(1, d));
        colaTareasArregloString.agregarTarea(new Tarea(2, e));
        colaTareasArregloString.agregarTarea(new Tarea(3, f));
 
        
        pilaTareas.agregarTarea(new Tarea(6,6));
        pilaTareas.agregarTarea(new Tarea(7,7));
        pilaTareas.agregarTarea(new Tarea(8,8));
        
        pilaTareasDeColas.agregarTarea(new Tarea(9,colaTareas));
        
        while(!colaTareas.estaVacia()){
            Tarea<String> tareaProcesada = colaTareas.procesarTarea();
            
            
            System.out.println("Prosesando tarea de la cola: \n\t Sale-->"+ tareaProcesada.getId()+"-"+tareaProcesada.getAtributo());
             }
        while(!colaTareasInt.estaVacia()){
            Tarea<Integer> tareaProcesadaInt = colaTareasInt.procesarTarea();
            System.out.println("Procesando tarea de la cola \n\t Sale--> "+ tareaProcesadaInt.getId()+"-"+tareaProcesadaInt.toString());
       
        }
        while(!colaTareasArreglo.estaVacia()){
            Tarea<int[]> tareaProcesadaTarea = colaTareasArreglo.procesarTarea();
            System.out.println("Procesando tarea de la cola \n\t Sale--> "+ tareaProcesadaTarea.getId()+"-"+tareaProcesadaTarea.toString());
       
        }
        while(!colaTareasArregloString.estaVacia()){
            Tarea<String[]> tareaProcesadaTarea2 = colaTareasArregloString.procesarTarea();
            System.out.println("Procesando tarea de la cola \n\t Sale--> "+ tareaProcesadaTarea2.getId()+"-"+tareaProcesadaTarea2.toString());
       
        }
        
        while(!pilaTareas.estaVacia()){
            Tarea<Integer> tareaProcesada=pilaTareas.procesarTarea();
            System.out.println("Procesando tarea de la Pila \n\t Sale--> "+ tareaProcesada.getId()+"-"+tareaProcesada.getAtributo());
        }
    }
}
