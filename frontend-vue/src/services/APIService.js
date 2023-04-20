import axios from "axios";

const APIServer = axios.create({
  baseURL: "https://api.themoviedb.org/3",
  //apiKEY: "5ca2c64fc6ec1bf4c74259e634823759",
});

export default {
  getMovies() {
    //shows 20 "random" movies/json objects sorted by popularity, no NSFW, US-english
    return APIServer.get(
      "/discover/movie?api_key=5ca2c64fc6ec1bf4c74259e634823759&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=1"
    );
  },

  // getMovieByMovieId(movie_id) { //returns a JSON object with specific movie details based on TMDB's movie ID
  //   return APIServer.get("/movie/{movie_id}?api_key=5ca2c64fc6ec1bf4c74259e634823759");
  // },
}; //end of export
