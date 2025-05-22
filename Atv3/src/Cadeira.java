// ex 02

import java.util.LinkedList;
import java.util.Queue;

public class Cadeira {

    public static int jogar(int participantes, int batidas) {
        Queue<Integer> fila = new LinkedList<>();
        for (int i = 1; i <= participantes; i++) {
            fila.add(i);
        }

        while (fila.size() > 1) {
            
            for (int i = 1; i < batidas; i++) {
                fila.add(fila.poll());
            }
            
            fila.poll();
        }
        return fila.peek();
    }

    public static void main(String[] args) {
        int participantes = 7; 
        int batidas = 3;  
        int vencedor = jogar(participantes, batidas);
        System.out.println("O vencedor é o participante número: " + vencedor);
    }
}