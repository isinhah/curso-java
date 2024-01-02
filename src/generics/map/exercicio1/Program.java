package src.generics.map.exercicio1;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        //Estrutura para armazenar cookies
        //Tipo string (chave), tipo string (valor)
        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username", "isabel"); //chave e valor
        cookies.put("email", "isabel@gmail.com");
        cookies.put("phone", "8198242321");

        cookies.remove("email"); //Remove a chave
        cookies.put("phone", "1234"); //Sobrescreve o valor

        System.out.println("ALL COOKIES: ");
        for (String key : cookies.keySet()) { //vai pegar as chaves do cookies
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println("Contem a chave 'phone'? " + cookies.containsKey("phone")); //contém a chave
        System.out.println("Quantos cookies? " + cookies.size());
    }
}
