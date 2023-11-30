package src.poo.enums_composicao.exercicio_3;

import src.poo.enums_composicao.exercicio_3.entities.Comment;
import src.poo.enums_composicao.exercicio_3.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("have a nice trip!");
        Comment c2 = new Comment("wow that's awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "traveling to new zealand", "i'm going to visit this wonderful country", 12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        sc.close();
    }
}
