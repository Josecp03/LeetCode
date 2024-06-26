import java.util.Arrays;

public class RemoveDuplicates {
    
    public static void main(String[] args) {
        int[] numeros = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(numeros));
    }
    
    public static int removeDuplicates(int[] nums) {
        int contador = 0; // Inicializar el contador

        // Recorrer el array de números
        for (int i = 0; i < nums.length; i++) {
            // Recorrer de nuevo el array para comprobar si se repite el número
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = Integer.MAX_VALUE; // Poner el mayor valor entero en la posición donde se repite el número
                } 
            }
        }

        Arrays.sort(nums); // Ordenar los elementos para que se queden los mayores a la derecha
        String[] arrayAux = new String[nums.length]; // Crear un array auxiliar de strings en vez de enteros con los mismos elementos que el anterior
        for (int i = 0; i < arrayAux.length; i++) {
            arrayAux[i] = String.valueOf(nums[i]);
        }

        // Recorrer el array auxiliar para colocar un _ en los elementos que se habían repetido, y en los que no, contarlos
        for (int i = 0; i < arrayAux.length; i++) {
            if (arrayAux[i].equals(String.valueOf(Integer.MAX_VALUE))) {
                arrayAux[i] = "_";
            } else {
                contador++;
            }
        }

        System.out.println(Arrays.toString(arrayAux)); // Imprimir el nuevo array

        return contador; // Devolver el número de elementos únicos
    }
}
