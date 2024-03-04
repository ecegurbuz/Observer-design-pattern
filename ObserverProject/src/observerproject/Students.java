/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

/**
 *
 * @author Lenovo
 */
public class Students extends Observable implements Runnable {
    
    @Override
    public void run(){
        try{
            final InputStreamReader isr = new InputStreamReader(System.in);
            final BufferedReader br = new BufferedReader(isr);
            while (true){
                String response = br.readLine();
                setChanged();
                notifyObservers(response);
                
            }
            
        }
        catch(IOException e){
            e.printStackTrace();
            
        }
    }
    
}

    

