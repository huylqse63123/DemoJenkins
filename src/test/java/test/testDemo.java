/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.mycompany.testdemo.Prime;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author cwalk
 */
public class testDemo {
   
   @Test
   public void testisPrime1() {
      Prime demo1 = new Prime();
      boolean check = demo1.isPrimeNumber(-1);
      assertFalse(check);
   }
   
   @Test
   public void testisPrime2() {
      Prime demo1 = new Prime();
      boolean check = demo1.isPrimeNumber(0);
      assertFalse(check);
   }
   
   @Test
   public void testisPrime3() {
      Prime demo1 = new Prime();
      boolean check = demo1.isPrimeNumber(5);
      assertTrue(check);
   }
}
