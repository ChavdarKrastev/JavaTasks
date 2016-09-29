/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_datatypes_variables_operators_memory_1;

/**
 *
 * @author user1
 */
public class PrintFromSeconds {
      public static void main(String[] args)
    {
    int seconds = 7546565;
    int days;
    int hours;
    int minutes;
    int sec;
    days = seconds/(60*60*24);
    hours = (seconds%(60*60*24))/3600;
    minutes = ((seconds%(60*60*24))%3600)/60;
    sec = ((seconds%(60*60*24))%3600)%60;

    System.out.println("days-"+ days+" hours-"+ hours+" minutes-"+ minutes+" seconds-"+sec);
    }
}
