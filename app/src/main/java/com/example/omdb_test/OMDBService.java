//package com.example.omdb_test;
//
//import android.os.Parcelable;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class OMDBService {
//
//    private static OmdbApi sOmdbApi;
//
//    public static class ResultDetails {
//        private List<Detail> movieDetailList;
//        private String totalResults;
//        private String Response;
//
//        public ResultDetails(Result result) {
//            this.totalResults = result.totalResults;
//            this.Response = result.Response;
//            movieDetailList = new ArrayList<>();
//        }
//
//        public void addToList(Detail detail) {
//            movieDetailList.add(detail);
//        }
//
//        public List<Detail> getMovieDetailList() {
//            return movieDetailList;
//        }
//
//        public String getTotalResults() {
//            return totalResults;
//        }
//
//        public String getResponse() {
//            return Response;
//        }
//    }
//
//    public static class Result {
//        public List<Movie> Search;
//        public String totalResults;
//        public String Response;
//
//        @Override
//        public String toString() {
//            return "Result{" +
//                    "Search=" + Search +
//                    ", totalResults='" + totalResults + '\'' +
//                    ", Response='" + Response + '\'' +
//                    '}';
//        }
//    }
//
//    public static class Movie {
//        public String Title;
//        public String Year;
//        public String imdbID;
//        public String Type;
//        public String Poster;
//
//        @Override
//        public String toString() {
//            return "\nMovie{" +
//                    "Title='" + Title + '\'' +
//                    ", Year='" + Year + '\'' +
//                    ", imdbID='" + imdbID + '\'' +
//                    ", Type='" + Type + '\'' +
//                    ", Poster='" + Poster + '\'' +
//                    '}';
//        }
//    }
//
//    public static class Detail implements Parcelable {
//        public String Title;
//        public String Year;
//        public String Rated;
//        public String Released;
//        public String Runtime;
//        public String Genre;
//        public String Director;
//        public String Writer;
//        public String Actors;
//        public String Plot;
//        public String Language;
//        public String Country;
//        public String Awards;
//        public String Poster;
//        public String Metascore;
//        public String imdbRating;
//        public String imdbVotes;
//        public String imdbID;
//        public String Type;
//        public String Response;
//
//        @Override
//        public String toString() {
//            return "Detail{" +
//                    "Title='" + Title + '\'' +
//                    ", Year='" + Year + '\'' +
//                    ", Rated='" + Rated + '\'' +
//                    ", Released='" + Released + '\'' +
//                    ", Runtime='" + Runtime + '\'' +
//                    ", Genre='" + Genre + '\'' +
//                    ", Director='" + Director + '\'' +
//                    ", Writer='" + Writer + '\'' +
//                    ", Actors='" + Actors + '\'' +
//                    ", Plot='" + Plot + '\'' +
//                    ", Language='" + Language + '\'' +
//                    ", Country='" + Country + '\'' +
//                    ", Awards='" + Awards + '\'' +
//                    ", Poster='" + Poster + '\'' +
//                    ", Metascore='" + Metascore + '\'' +
//                    ", imdbRating='" + imdbRating + '\'' +
//                    ", imdbVotes='" + imdbVotes + '\'' +
//                    ", imdbID='" + imdbID + '\'' +
//                    ", Type='" + Type + '\'' +
//                    ", Response='" + Response + '\'' +
//                    '}';
//        }
//    }
//}
//
//
//
