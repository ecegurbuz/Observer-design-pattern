/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerproject;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Lenovo
 */
public class Attendance implements Observer {
    
    private String message;
    @Override
    public void update(Observable obj, Object arg){
        if(arg instanceof String){
            message = (String) arg;
            System.out.println("Answer:" + message);
    }
    }
    
}
