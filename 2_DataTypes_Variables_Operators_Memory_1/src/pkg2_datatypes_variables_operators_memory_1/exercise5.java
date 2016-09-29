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
public class exercise5 {
    
     public static void main(String[] args)
    {
    int x = 3;
    int y = 5;
    int z;
    z = x;
    x = y;
    y = z;
    
    //second way to swap variables using XOR
    int a = 2;
    int b = 4;
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    
    System.out.println(x + " " + y);
    System.out.println(a +" "+ b);
    }
    
}
