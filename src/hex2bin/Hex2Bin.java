
/*integrantres: 
  Mayeleen Rodriguez Gomez cod:2016114118
  Luis Hatum
*/
package hex2bin;

import  java.util.Scanner;

/**
 *
 * @author Maye
 */
public class Hex2Bin {

    private final String[] hexBits = {
        "0000", "0001", "0010", "0011",
        "0100", "0101", "0110", "0111",
        "1000", "1001", "1010", "1011",
        "1100", "1101", "1110", "1111"
    };
    public static void main(String[] args)
    {        
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese una Cadena Hexadecimal: ");
        String hexStr = in.next();
        
        Hex2Bin aHex2Bin = new Hex2Bin();
        if ( ! aHex2Bin.esHex(hexStr)) {
            System.out.printf("Cadena Hexadecimal Invalida \"%1$s\"\n", hexStr);
            return;
        }
        aHex2Bin.convertHexToBin(hexStr);
    }
    
    
    private boolean esHex(String hexStr)
    {
        for (int i = 0; i < hexStr.length(); i++) {
            if (0 > Character.digit(hexStr.toLowerCase().charAt(i), 16)) {
                return false;
            }
        }
        return true;
    }
    
    
    private void convertHexToBin(String hexStr)
    {
        
        System.out.printf("El binario equivalente para hexadecimal. %1$s es ", hexStr);
        
        for (int i = 0; i < hexStr.length(); i++) {
            int j = Character.digit(hexStr.toLowerCase().charAt(i), 16);
            System.out.printf("%1$s ", hexBits[j]);
        }
        System.out.println();
    }
    
}
