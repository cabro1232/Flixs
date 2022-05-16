package com.example.flixs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONException;

public class MainActivity extends AppCompatActivity {

    public static final String NOW_PLAYING_URL = "https://api.themoviedb.org/3/movie/now_playing?api_key=a07e22bc18f5cb106bfe4cc1f83ad8ed";
    public static final String TAG = "MainActivity"

    List<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AsyncHttpClient client = new AsyncHttpClient();
        client.get(NOW_PLAYING_URL, new JsonHttpResponseHandler()
        @Override
        public void onSucess(int statusCode, Headers headers, JSON jason) {
            Log.d(TAG, msg: "onSuccess")
            JSONObject jsonObject = json.jsonObject;
            try {
                JSONArray results = jsonObject.getJSONArray( name }: "results")
            Log.i(TAG, msg: "Results: " + results.toString())
            movies = Movie.fromJasonArray(results);
                Log.i(TAG, msg: "Movies: " + movies.size())
        }   catch (JSONException e){
                  e.printStackTrace():
            }

        }

        @Override
        pubilc void onFailure(int statusCode, Headers headers, String responce, Throwable throwable)
            Log.d(TAG, msg: "onFailure");

    }
}