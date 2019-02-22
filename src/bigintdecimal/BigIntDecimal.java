
package bigintdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;

public class BigIntDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat f = new DecimalFormat("###,###");
        DecimalFormat m = new DecimalFormat("$###,###.##");
        BigInteger wiPop = new BigInteger("5726398");
        BigInteger caPop = new BigInteger("38041430");
        BigInteger txPop = new BigInteger("26059203");
        
        BigInteger wiToCa = wiPop.multiply(caPop);
        BigInteger txCopies = txPop.multiply(wiToCa);
        BigDecimal totalCopies = new BigDecimal(txCopies.toString());
        BigDecimal cost = new BigDecimal("3.23");
        BigDecimal totalCost = totalCopies.multiply(cost);
        
        System.out.println("Letters sent to CA: " + f.format(wiToCa) + " letters");
        System.out.println("Copies sent to TX: " + f.format(txCopies) + " copies");
        System.out.println("Total cost of copies sent to TX: " + m.format(totalCost));
        
        
    }
    
}
