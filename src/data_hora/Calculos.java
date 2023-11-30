package src.data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos {
    public static void main(String[] args) {

        //Instanciação
        LocalDate d4 = LocalDate.parse("2023-11-12");
        LocalDateTime d5 = LocalDateTime.parse("2023-11-12T01:30:26");
        Instant d6 = Instant.parse("2023-11-12T01:30:26Z");

        LocalDate pastWeekLocalDate = d4.minusDays(7); //1 Semana passada
        LocalDate nextWeekLocalDate = d4.plusDays(7); //Próxima semana
        System.out.println("pastWeekDate -> " + pastWeekLocalDate);
        System.out.println("nextWeekDate -> " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d5.minusDays(7); //1 Semana passada
        LocalDateTime nextWeekLocalDateTime = d5.plusDays(7); //Próxima semana
        System.out.println("pastWeekDateTime -> " + pastWeekLocalDateTime);
        System.out.println("nextWeekDateTime -> " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d6.minus(7, ChronoUnit.DAYS); //1 Semana passada
        Instant nextWeekInstant = d6.plus(7, ChronoUnit.DAYS); //Próxima semana
        System.out.println("pastWeekInstant -> " + pastWeekInstant);
        System.out.println("nextWeekInstant -> " + nextWeekInstant);

        // Duration
        Duration t1 = Duration.between(pastWeekLocalDateTime, d5);
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d4.atStartOfDay());
        Duration t3 = Duration.between(pastWeekInstant, d6);
        System.out.println("Horas entre as semanas: " + t1.toHours());
        System.out.println("Dias entre as semanas: " + t2.toDays());
        System.out.println("Dias entre as semanas com instant: " + t3.toDays());
    }
}
