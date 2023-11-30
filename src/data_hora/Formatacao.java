package src.data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatacao {
    public static void main(String[] args) {

        //Instaciação
        LocalDate d4 = LocalDate.parse("2023-11-12");
        LocalDateTime d5 = LocalDateTime.parse("2023-11-12T09:43:20");
        Instant d6 = Instant.parse("2023-11-12T09:43:20Z"); //Instant - não possui método format

        //Formatação -> Customizando a data-hora
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        //DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; //Mesma coisa do ofPattern mas nçao tem fuso horario
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        //Data global para data local, considerando o fuso horário do computador
        LocalDate r1 = LocalDate.ofInstant(d6, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d6, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d6, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d6, ZoneId.of("Portugal"));

        System.out.println("Data customizada: " + d4.format(fmt1)); //Ou, fmt1.format(d4) - ou d4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Data customizada: " + d5.format(fmt2));
        System.out.println("Data-hora global customizada com fuso horário: " + fmt3.format(d6));
        System.out.println("Data-hora com INSTANT: " + fmt5.format(d6));

        System.out.println("Data global para data local, considerando o fuso horário do computador: " + r1);
        System.out.println("Data global para data local, considerando o fuso horário de portugal: " + r2);
        System.out.println("Data-hora global para data local, considerando o fuso horário do computador: " + r3);
        System.out.println("Data-hora global para data local, considerando o fuso horário de portugal: " + r4);

        System.out.println("Dia: " + d4.getDayOfMonth());
        System.out.println("Mês: " + d4.getMonthValue());
        System.out.println("Ano: " + d4.getYear());

        System.out.println("Hora: " + d5.getHour());
        System.out.println("Minutos: " + d5.getMinute());
    }
}
