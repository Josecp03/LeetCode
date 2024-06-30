/*
 * Crea una función que reciba un número entero y devuelva la cantidad de dígitos
 */

public class DigitosNumero {

    public static void main(String[] args) {
        
        int n = 1638;
        System.out.println(digitosNumero(n));

    }


    private static int digitosNumero(int n) {
        
        String numero = String.valueOf(n);
        return numero.length();

    }

}