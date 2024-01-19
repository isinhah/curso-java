package src.stream.exercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10); //Criação de uma stream a partir da lista
        System.out.println(Arrays.toString(st1.toArray())); //Imprimindo a stream

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob"); //Criando a stream com streamOf
        System.out.println(Arrays.toString(st2.toArray())); //Imprimindo a stream

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); //primeiro elemento, função da iteração
        System.out.println(Arrays.toString(st3.limit(10).toArray())); //Limitando a stream (até 10 elementos)

        //Fibonnacci --> cada elemento é a soma dos dois anteriores
        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(20).toArray()));
    }
}
