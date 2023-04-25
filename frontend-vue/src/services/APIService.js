import axios from "axios";

const APIServer = axios.create({
  baseURL: "https://api.themoviedb.org/3",
  //api_key: "5ca2c64fc6ec1bf4c74259e634823759",
});

export default {
  data() {
    return {
      movies: [],
    };
  },

  // getMovies() {
  //   //shows 20 "random" movies/json objects sorted by popularity, no NSFW, US-english
  //   return APIServer.get(
  //     "/discover/movie?api_key=5ca2c64fc6ec1bf4c74259e634823759&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=1"
  //   )
  //      .then((response) => {
  //     //   //assigns the json array to this.movie...
  //      return response.data
  //      })
  //     .catch((error) => {
  //       console.log(error);
  //     });
  // },

  getMoviesByGenre(genreID) {
    return APIServer.get(
      `/discover/movie?api_key=5ca2c64fc6ec1bf4c74259e634823759&with_genres=${genreID}`
    )
      .then((response) => {
        return response.data;
      })
      .catch((error) => {
        console.log(error);
      });
  },
  //!!UNCOMMENT THIS WHEN READY!!
  // getMovieByMovieId(movie_id) {
  //   //returns a single JSON object with specific movie details based on TMDB's movie ID
  //   return APIServer.get(
  //     "/movie/{movie_id}?api_key=5ca2c64fc6ec1bf4c74259e634823759"
  //   )
  //     .then((response) => {
  //       return response.data;
  //     })
  //     .catch((error) => {
  //       console.log(error);
  //     });
  // },
}; // end of export
