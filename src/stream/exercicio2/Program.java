package src.stream.exercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//operações terminais (pipeline)
public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        System.out.println("Lista original: " + list);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println("Multiplicando a lista por 10: " + Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y); //reduce: elemento neutro, argumentos -> operação
        System.out.println("Soma de todos os elementos da lista original = " + sum);

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0) //filtrando todos os números pares
                .map(x -> x * 10) //multiplicar os números pares por 10
                .collect(Collectors.toList()); //convertendo em lista

        System.out.println("Números pares: " + Arrays.toString(newList.toArray()));
    }
}
