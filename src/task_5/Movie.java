package task_5;

import java.util.Scanner;

public class Movie {
    private String title;
    private double rating;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }


    public static Movie[] moviesArray(int movieCount) {
        int i = 0;
        Movie[] movies = new Movie[ movieCount];
        Scanner scanner = new Scanner(System.in);
        while (i <  movieCount) {

            System.out.println("Input movie title: ");
            String title = scanner.next();
            System.out.println("Input movie rating: ");
            double rating = scanner.nextInt();

            movies[i] = new Movie(title, rating);


            i++;
        }
        return movies;
    }

    public static void maxRating(Movie[] movies) {
        double max = movies[0].rating;

            for (int i = 0; i < movies.length; i++) {
                if (movies[i].rating > max) {
                    max = movies[i].rating;
                    System.out.println("Title: " + movies[i].title + "\nRating: " + max);
                }


        }

    }

}
