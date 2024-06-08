package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        List<Comment> comments = new ArrayList<>();

        System.out.println("Make your first post");
        System.out.println("Date (MM/YYYY)");
        Date moment = sdf.parse(sc.next());
        System.out.println("Title");
        String title = sc.next();
        System.out.println("Content");
        String content = sc.next();
        Integer likes = 12;

        Post post = new Post(moment, title, content, likes);

        for (Comment c : comments) {
            post.addComment(c);
        }

        sc.close();
    }
}
