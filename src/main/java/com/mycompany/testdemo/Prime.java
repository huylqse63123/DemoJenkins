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

   public boolean isPrimeNumber(int input) {
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
}