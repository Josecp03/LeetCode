
public class RemoveElements {
    
    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        int valor = 2;

        System.out.println(removeElements(nums, valor));
    }

    public static int removeElements(int[] nums, int val) {
        int k = 0; // Inicializar el contador
    
        // Recorrer el array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) { // Comprobar si el elemento actual es igual al valor especificado
                nums[k] = nums[i];
                k++;
            }
        }
        
        // Devolver el contador
        return k;
    }

    
}
