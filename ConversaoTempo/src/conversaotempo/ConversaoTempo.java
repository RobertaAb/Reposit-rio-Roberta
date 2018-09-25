package conversaotempo;

import java.time.Duration;
import java.util.*;

public class ConversaoTempo {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        teclado.useLocale(Locale.ENGLISH);

        //entrada
        System.out.println("Tempo total");
        long Tempo = Long.parseLong(teclado.next());
        teclado.close();

        //saida
        Duration time = Duration.ofSeconds(Tempo);
        long horas = time.toHours();
        long minutos = time.minusHours(horas).toMinutes();
        long segundos = time.minusHours(horas).minusMinutes(minutos).getSeconds();
        System.out.printf("Este tempo %d será %d horas"
                + ",%d minutos e"
                +" %d segundos", Tempo, horas, minutos, segundos);
    }
}