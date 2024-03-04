/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerproject;

/**
 *
 * @author Lenovo
 */
public class ObserverProject {

     public static void main(String[] args){
        System.out.println("Attendance:");
        
        
        final Students student = new Students();
        final Attendance atd = new Attendance();
        
        student.addObserver(atd);
        
        Thread thread = new Thread(student);
        thread.start();
    }

}
