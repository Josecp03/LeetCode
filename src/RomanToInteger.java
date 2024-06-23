
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        // Inicializar los dos arrays
        int[] numeros = {1, 5, 10, 50, 100, 500, 1000};
        char[] numerosRomanos = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    
        // Inicializar la variable
        int numeroTraducido = 0;
    
        // Recorrer las letras
        int i = 0;
        while (i < s.length()) {
            // Verificar combinaciones especiales
            if (i < s.length() - 1 && s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                numeroTraducido += 4;
                i += 2; // Avanzar al siguiente par de caracteres
            } else if (i < s.length() - 1 && s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                numeroTraducido += 9;
                i += 2; // Avanzar al siguiente par de caracteres
            } else if (i < s.length() - 1 && s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                numeroTraducido += 40;
                i += 2; // Avanzar al siguiente par de caracteres
            } else if (i < s.length() - 1 && s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                numeroTraducido += 90;
                i += 2; // Avanzar al siguiente par de caracteres
            } else if (i < s.length() - 1 && s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                numeroTraducido += 400;
                i += 2; // Avanzar al siguiente par de caracteres
            } else if (i < s.length() - 1 && s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                numeroTraducido += 900;
                i += 2; // Avanzar al siguiente par de caracteres
            } else {
                // Recorrer el array de los numerosRomanos para encontrar la equivalencia
                int j = 0;
                while (j < numerosRomanos.length) {
                    if (s.charAt(i) == numerosRomanos[j]) {
                        numeroTraducido += numeros[j];
                        j = numerosRomanos.length; // Terminar el bucle al encontrar la equivalencia
                    } else {
                        j++;
                    }
                }
                i++;
            }
        }
    
        // Devolver el numeroTraducido
        return numeroTraducido;
    }
    
    
}