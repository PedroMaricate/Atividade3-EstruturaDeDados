// ex 03

import java.util.LinkedList;

public class ListaIntercalada {

    public static LinkedList<Integer> intercalarListas(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> resultado = new LinkedList<>();
        int i = 0, j = 0;
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) <= l2.get(j)) {
                resultado.add(l1.get(i));
                i++;
            } else {
                resultado.add(l2.get(j));
                j++;
            }
        }
        while (i < l1.size()) {
            resultado.add(l1.get(i));
            i++;
        }

        while (j < l2.size()) {
            resultado.add(l2.get(j));
            j++;
        }
        return resultado;
    }
    public static void main(String[] args) {
        LinkedList<Integer> lista1 = new LinkedList<>();
        LinkedList<Integer> lista2 = new LinkedList<>();
        
        lista1.add(1);
        lista1.add(3);
        lista1.add(5);
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        LinkedList<Integer> resultado = intercalarListas(lista1, lista2);
        System.out.println("Lista intercalada e ordenada:");

        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}