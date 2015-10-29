
package sodamachine;

import static sodamachine.Coins.QUARTER;


public class SodaMachine {

   
    public static void main(String[] args) {
      MaquinaSodas ms = new MaquinaSodas();
      ms.price = 4 * QUARTER;
      System.out.println(ms.price);
    }
    
}

