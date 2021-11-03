/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mytask;

/**
 *
 * @author bende
 */
public class Client implements Runnable {
    
    private Table t;
        
    
    public Client(Table t){
        this.t=t;}

    public Client() {
    }
    

    @Override
    public void run() {
        try {
            t.takeMeal();
        } catch(InterruptedException e){
         e.printStackTrace();
        }
    }
    
}
