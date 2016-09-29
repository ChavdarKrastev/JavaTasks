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
public class exercise2 {
    public static void main(String[] args)
    {
    short year = 2015;
    boolean leapYear = (( year % 4 == 0 ) && (year % 100 != 0)) || (year % 400 == 0);

    System.out.println(leapYear);
    }
}
