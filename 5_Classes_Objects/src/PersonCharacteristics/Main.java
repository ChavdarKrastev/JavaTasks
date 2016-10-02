/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonCharacteristics;

import java.util.Scanner;

/**
 *
 * @author user1
 */
public class Main {
    
    public static void main(String[] args)
    {
        Person p1 = new Person();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("how many person characteristics would you like to enter");
        String person = sc.nextLine();
        int per = Integer.parseInt(person);

//creating an array of objects        
        Person[] persons = new Person[per];
        for(int i =0; i<per; i++)
        {
            System.out.println("person " + (i+1));
            p1.initialize();
            Person individual = new Person(p1.gender,p1.firstName,p1.lastName,p1.yearOfBirth,p1.weightKg,p1.age,p1.heightCm,p1.profession,p1.average);
            persons [i] = individual;
        }
        
      for(int i=0; i<persons.length;i++)
      {
          if (persons[i].gender == 'f') {
                String f = persons[i].firstName + " " + persons[i].lastName + " is " + persons[i].age + " years old. Her weight is " + persons[i].weightKg + " and she is " + persons[i].heightCm + " cm tall. She is a " + persons[i].profession + " with average grade of " + persons[i].average;
                System.out.println(f);
            } else if (persons[i].gender == 'm') {
                String m = persons[i].firstName + " " + persons[i].lastName + " is " + persons[i].age + " years old. His weight is " + persons[i].weightKg + " and he is " + persons[i].heightCm + " cm tall. He is a " + persons[i].profession + " with average grade of " + persons[i].average;
                System.out.println(m);
            } else if (persons[i].gender < 16) {
                String u = persons[i].firstName + " " + persons[i].lastName + " is under-aged";
                System.out.println(u);
            }
      }
        
    }
    
}
