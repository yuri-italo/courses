package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
        var sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        var c1 = new Comment("Have a nice trip!");
        var c2 = new Comment("Wow that's awesome!");

        var p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        var c3 = new Comment("Good night");
        var c4 = new Comment("May the Force be with you");

        var p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
