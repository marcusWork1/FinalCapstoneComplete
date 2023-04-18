import axios from "axios";

const APIServer = axios.create({
  baseURL: "http://www.omdbapi.com",
  //apiKEY: "apikey=ea9877be",
});

export default {
  getMovies() {//right now it's just get Godfather the movie
    //need to figure out how to do random movies or all movies??
    return APIServer.get("/?s=movie&page=1&apikey=ea9877be").then((response) => {
      return response.data.cards;
    });
  },

  getMovieByMovieId(movieId) {
    return APIServer.get("/?i=${movieId}&apikey=ea9877be");
  },
}; //end of export
