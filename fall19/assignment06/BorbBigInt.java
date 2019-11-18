import java.math.BigInteger;

public class BrobBigInt {
   
    public static void main (String[] args) {
    	BigInteger a = new BigInteger("203984");
    	BigInteger b = new BigInteger("293847");
    	System.out.println("Adding "+ b.toString() + " + " + a.toString() + " = " + (a.add(b)).toString() );
        System.out.println("Dividing "+ b.toString() + " / " + a.toString() + " = " + (b.divide(a)).toString() );
        System.out.println("Remainder "+ b.toString() + " / " + a.toString() + " = " + (b.remainder(a)).toString() );
    }


}