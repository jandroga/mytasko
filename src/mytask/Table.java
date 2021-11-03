/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mytask;

import java.util.LinkedList;
import java.util.Queue;
import javafx.scene.AccessibleAction;




/**
 *
 * @author bende
 */
public class Table {
    
    public int mealsMax = 10;
    
    public int mealsOnTable = 0;
    
        public void prepararTaula(){
        Client cl = new Client(this);
        Chef cf = new Chef(this);
        Thread t1 = new Thread(cl);
        Thread t2 = new Thread(cf);
          
    }
    
    public void placeMeal() throws InterruptedException{//Cooking meal cap a s'altra banda, classe Chef
        if(espaiTaula()) {
            System.out.println("Chef preparant menjar");
        } else {
            System.out.println("Chef esperant a que se buidi sa taula");
        }
        Thread.sleep(5000);
        mealsOnTable++;
        System.out.println("Menjar llest! Deixant-lo a sa taula, queden " + (mealsMax-mealsOnTable) + " espais per plats");
        
        
    
    }
    public void takeMeal() throws InterruptedException{
        if(mealsOnTable>0){
            System.out.println("El client ha agafat un plat de la taula, ara en queden "+mealsOnTable);}
        else{
        }
    
        
        
    }
    
    public boolean espaiTaula(){
        if(mealsOnTable<mealsMax);
        return true;
    }
            
            
    public Table(){
        
        
        
    }
    

    
    //synchronized long BlockingQueue(){}
    
    
    /*
    Synchronize sense thread ni ná aquí
    Crear arraylist on placeMeal i takeMeal fiquin i llevin
    un número d'ordre. Una queue. 
    */

    
}
