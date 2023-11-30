package src.data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instaciacao {
    public static void main(String[] args) {

        //DateTimeFormatter --> formato data-hora customizado
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();

        LocalDate d4 = LocalDate.parse("2023-11-12");
        LocalDateTime d5 = LocalDateTime.parse("2023-11-12T09:09:25");

        Instant d6 = Instant.parse("2023-11-12T09:25:40Z"); //Criar horario no padrao de londres
        Instant d7 = Instant.parse("2023-11-12T09:25:40-03:00"); //Brasil -> Vai mostrar o horario em londres

        LocalDate d8 = LocalDate.parse("12/11/2023", fmt1); //Ou, LocalDate d8 = LocalDate.parse("12/11/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"););
        LocalDateTime d9 = LocalDateTime.parse("12/11/2023 09:34", fmt2);

        LocalDate d10 = LocalDate.of(2023, 11, 12);
        LocalDateTime d11 = LocalDateTime.of(2023, 11, 12, 9, 30);

        System.out.println("Data local: " + d1);
        System.out.println("Data-hora local com segundos: " + d2 );
        System.out.println("Data-hora com GMT: " + d3 );
        System.out.println("Data-hora em texto: " + d4);
        System.out.println("Data-hora com segundos: " + d5);
        System.out.println("Data-hora de Londres: " + d6);
        System.out.println("Horário do brasil para Londres: " + d7);
        System.out.println("Data customizada: " + d8);
        System.out.println("Data-hora customizado: " + d9);
        System.out.println("Data separada: " + d10);
        System.out.println("Data-hora separada: " + d11);
    }
}
