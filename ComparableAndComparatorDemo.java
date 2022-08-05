package com.topics.coreJava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
/** 
 * A class 'Movie' that implements Comparable
 * which has compareTo method.
 * @author mahavirsinh parmar
 * @version 1.8
*/
class Movie implements Comparable < Movie > {
	
    private double rating;
    private String name;
    private int year;

    // Used to sort movies by year
    public int compareTo(Movie movie) {
        return this.year - movie.year;
    }

    // Constructor
    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Getter methods for accessing private data
    public double getRating() {
        return rating;
    }
    
    public String getName() {
        return name;
    }
    
    public int getYear() {
        return year;
    }
    
}

/** 
 * A Class to compare Movies by ratings
 * which has compare method.
 * @author mahavirsinh parmar
 * @version 1.8
*/
class RatingCompare implements Comparator < Movie > {
	
    public int compare(Movie movie1, Movie movie2) {
        if (movie1.getRating() < movie2.getRating()) {
        	return -1;
        } if (movie1.getRating() > movie2.getRating()) {
        	return 1;
        } else {
        	return 0;
        }
    }
    
}

/** 
 * A Class to compare Movies by name
 * which has compare method.
 * @author mahavirsinh parmar
 * @version 1.8
*/
class NameCompare implements Comparator < Movie > {
	
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getName().compareTo(movie2.getName());
    }
    
}

/** 
 * Driver class
 * @author mahavirsinh parmar
 * @version 1.8
*/
public class ComparableAndComparatorDemo {

    public static void main(String[] args) {
        ArrayList < Movie > list = new ArrayList < Movie > ();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        // Sort by rating : Create an object of ratingCompare, Call Collections.sort, Print Sorted list
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie movie : list) {
        	System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
        }

        // Call overloaded sort method with RatingCompare
        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie : list) {
        	System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
        }

        // Uses Comparable to sort by year
        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (Movie movie : list) {
        	  System.out.println(movie.getYear() + " " + movie.getRating() + " " + movie.getName() + " ");
        }   
    }

}