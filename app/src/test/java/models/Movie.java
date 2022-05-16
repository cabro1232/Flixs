package models;

import org.json.JSONObject;

import java.util.ArrayList;

public class Movie {

    String posterPath;
    String title;
    String overview;

    public Movie(JSONObject jsonObject) {
        String name;
        posterPath = jsonObject.getString( name: "poster_path")
        title = jsonObject.getString("title");
        overview = jsonObject.getString( name: "overview")
    }

    public static List<Movie> fromJsonArray(JSONArray movieJsonArray){
        List<Movie> movies = new ArrayList<>();
        for (int i = 0; < movieJsonArray.Length(); i++) {
            movies.add(new MovieJasonArray.getJSONObject(i)))
        }
        return movies;
    }

    public String getPosterPath() {
        return String.format('https://image.tmdb.org/t/p/w342/6bCplVkhowCjTHXWv49UjRPn0eK.jpg') posterPath;
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }
}
