package com.example.omdb_test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Movie;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ShareActionProvider;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    TextView tvSearchMovie, tvURLTest;
    EditText etMovieName;
    Button btnSearch;
    String OMDBApi, apiKey, searchURL, MovieName;
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OMDBApi = "http://www.omdbapi.com/";
        apiKey = "&apikey=b8137dc6";

        tvSearchMovie = findViewById(R.id.tvSearchMovie);
        etMovieName = findViewById(R.id.etMovieName);
        btnSearch = findViewById(R.id.btnSearch);
        tvURLTest = findViewById(R.id.tvURLTest);

//        tvURLTest.setText(MovieName);
    }

    public static String getJSON(String url) {
        HttpURLConnection con = null;
        try {
            URL u = new URL(url);
            con = (HttpURLConnection) u.openConnection();
            con.connect();

            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }

            br.close();
            return sb.toString();

        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.disconnect();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        return null;
    }

    public void searchMovie(View view) {
        MovieName = etMovieName.getText().toString();
        searchURL = OMDBApi + "?t=" + MovieName + apiKey;
//        tvURLTest.setText(searchURL);
        Uri uri = Uri.parse(searchURL);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);

//        tvURLTest.setText(searchURL);

        tvURLTest.setText(getJSON(searchURL));
        System.out.println(getJSON(searchURL));
//        new JsonTask().execute(searchURL);
//        fetchData process = new fetchData();
//        process.execute();
//        startActivity(intent);
    }
}

//    private class JsonTask extends AsyncTask<String, String, String> {
//        protected void onPreExecute() {
//            super.onPreExecute();
//
//            pd = new ProgressDialog(MainActivity.this);
//            pd.setMessage("Please wait");
//            pd.setCancelable(false);
//            pd.show();
//        }
//
//        protected String doInBackground(String... params) {
//            HttpURLConnection connection = null;
//            BufferedReader reader = null;
//
//            try {
//                URL url = new URL(params[0]);
//                connection = (HttpURLConnection) url.openConnection();
//                connection.connect();
//
//                InputStream stream = connection.getInputStream();
//
//                reader = new BufferedReader(new InputStreamReader(stream));
//
//                StringBuffer buffer = new StringBuffer();
//                String line = "";
//
//                while ((line = reader.readLine()) != null) {
//                    buffer.append(line+"\n");
//                    Log.d("Response: ", "> " + line);   //here u ll get whole response...... :-)
//
//                }
//
//                return buffer.toString();
//        }
//
//            catch (MalformedURLException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                if (connection != null) {
//                    connection.disconnect();
//                }
//                try {
//                    if (reader != null) {
//                        reader.close();
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            return null;
//        }
//
//        @Override
//        protected void onPostExecute(String result) {
//            super.onPostExecute(result);
//            if (pd.isShowing()){
//                pd.dismiss();
//            }
//            tvURLTest.setText(result);
//        }
//    }
//}

//    public class fetchData extends AsyncTask<Void, Void, Void> {
//        public String data = "";
//        public String Title = "";
//
//        @Override
//        protected Void doInBackground(Void... voids) {
//            try {
//
//                URL url = new URL(searchURL);
//                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//                InputStream inputStream = httpURLConnection.getInputStream();
//                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//
//                String line = "";
//
//                while(line != null){
//
//                    line = bufferedReader.readLine();
//                    data = data + line;
//                }
//
//                JSONObject JA = new JSONObject(data);
//                JSONObject JO = JA.getJSONObject(String.valueOf(0));
//                Title = JO.getString("Title");
//
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//
//            return null;
//        }
//
//        @Override
//        protected void onPostExecute(Void aVoid) {
//            super.onPostExecute(aVoid);
//
//            tvURLTest.setText(this.Title);
//        }
//    }

//    public static JSONArray parseJsonFromUrl(String uri) throws IOException, JSONException {
//        JSONArray array = null;
//        try (Scanner sn = new Scanner(new URL(uri).openStream(), "UTF-8")) {
//            array = new JSONArray(sn.useDelimiter("\\A").next());
//        }
//        return array;
//    }
//
//    public static List<Movie> getAppList(JSONArray array) throws JSONException {
//        List<String> MovieList = new ArrayList<>();
//        for(int i = 0; i < array.length(); i++) {
//            JSONObject object = array.getJSONObject(i);
//        }
//    }



//    public void getMovieData(String movieName) {
////
////        return this.
////    }
