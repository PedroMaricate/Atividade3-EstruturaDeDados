// ex 01

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class Servidor {

    public static int calcularDias(int[] cargas) {
        int dias = 0;
        boolean desligamento = true;

        List<Integer> lista = new ArrayList<>();
        for (int carga : cargas) {
            lista.add(carga);
        }

        while (desligamento) {
            desligamento = false;
            Stack<Integer> novaLista = new Stack<>();
            novaLista.push(lista.get(0));

            for (int i = 1; i < lista.size(); i++) {
                if (lista.get(i) <= lista.get(i - 1)) {
                    novaLista.push(lista.get(i));
                } else {
                    desligamento = true;
                }
            }

            if (desligamento) {
                dias++;
                lista = new ArrayList<>(novaLista);
            }
        }

        return dias;
    }

    public static void main(String[] args) {
        int[] cargas = {30, 25, 40, 20, 35, 50, 45};
        int resultado = calcularDias(cargas);
        System.out.println(resultado + " dias até que nenhum servidor mais seja desligado.");
    }
}