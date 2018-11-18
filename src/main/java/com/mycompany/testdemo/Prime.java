/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testdemo;

/**
 *
 * @author cwalk
 */
public class Prime {

   public static boolean isPrimeNumber(int input) {
      if (input < 2) {
         return false;
      }
      for (int i = 2; i < input; i++) {
         if (input % i == 0) {
            return false;
         }
      }
      return true;
   }
   
   public static void main(String[] args) {
      boolean check = isPrimeNumber(5);
      System.out.println(check ? "hihi" : "Sai zoi");
      System.out.println(isPrimeNumber(6) ? "HIHI" : "Lai sai tiep");
   }
}
