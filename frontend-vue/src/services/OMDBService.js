import axios from "axios";

const APIServer = axios.create({
  baseURL: "http://www.omdbapi.com",
  //apiKEY: "apikey=ea9877be",
});

export default {
  getMovies() {//right now it's just searching movie titles and showing the first page.
    return APIServer.get("/?s=knucklehead&page=1&apikey=ea9877be").then((response) => {
      return response.data.cards;
    });
  },

  getMovieByMovieId(movieId) {
    return APIServer.get("/?i=${movieId}&apikey=ea9877be");
  },
}; //end of export
