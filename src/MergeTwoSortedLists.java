
import java.util.ArrayList;


public class MergeTwoSortedLists {
    public static void main(String[] args) {
        int[] lista1 = {1,2,4,5,7};
        int[] lista2 = {1,3,4,6};
        System.out.println(mergeTwoLists(lista1, lista2));
    }

    public static  ArrayList<Integer> mergeTwoLists(int[] lista1,  int[] lista2) {

        // Inicializar la lista en la que vamos a  ir añadiendo los elementos de ambos arrays
        ArrayList<Integer> listaFinal = new ArrayList<>();

        // Recorrer la primera lista
        for (int i = 0; i < lista1.length; i++) {
            listaFinal.add(lista1[i]); // Añadir el elemento de la primera lista
            // Recorrer la segunda lista
            for (int j = 0; j < lista2.length; j++) {
                if (i == j) { // Comprobar que están a la misma altura ambos elemtos para añadirlos ordenados 
                    listaFinal.add(lista2[j]); // Añadir el elemento de la segunda lista
                }
                
            }
        }

        // Por si las longitudes de los arrays no son idénticas
        if (lista1.length < lista2.length) {
            int limite = lista2.length - (lista2.length - lista1.length); // Calcular desde donde hay que empezar a recorrer el array para añadir los elementos que quedan
            for (int i = limite; i < lista2.length; i++) {
                listaFinal.add(lista2[i]);
            }
        } else if (lista2.length < lista2.length) { // Repetir la misma operación pero en caso contrario
            int limite = lista1.length - (lista1.length - lista2.length);
            for (int i = limite; i < lista1.length; i++) {
                listaFinal.add(lista1[i]);
            }
        }

        // Devolver la lista final
        return listaFinal;
    }
}
