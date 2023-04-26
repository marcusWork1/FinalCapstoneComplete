<template>
  <!--this should show ONE movie with the option of liking or disliking, have you watched it?-->
  <div class="browsebody">


    <!--uses props to get the data from the API service -->
    <div class = "table">
          <form class="movieform" v-on:submit.prevent="addFavorite">
      <button class="button">Add to Favorites</button>
    </form>
      <!--trying to display the movie title and release date-->
      <h4 class="movie-title">{{ movie.original_title }}</h4>
      <h5 class="movie-year">{{ movie.release_date }} | ID:{{ movie.id }}</h5>
      <!-- tries to display the poster image. it's always the v-bind:src and whatever is in the poster_path: from the json object -->
      <img
        v-bind:src="'https://image.tmdb.org/t/p/original/' + movie.poster_path"
        alt="movie.original_title"
      />
      <!--Trying to display overview/plot of the movie-->
      <div class = "transparent">
      <p>{{ movie.overview }}</p>
      </div>
    </div>
  </div>
</template>

<script>
import DatabaseService from "../services/DatabaseService";

export default {
  name: "movie-display",
  props: ["movie"],
  data() {
    return {
      movies: "",
      // favoritedMovie: {
      //   account_id: this.$store.state.account.account_id,
      //   movie_id: this.$store.currentMovieList.results.id,

      // },
    };
  },
  created() {
    this.movies = this.$store.currentMovieList;
  },
  methods: {
    addFavorite() {
      const newFavorite = {
        account_id: this.$store.state.account.account_id,
        movie_id: this.movie.id,
      };
      console.log(newFavorite);
      DatabaseService.postFavorite(newFavorite);
    },
  },
};
</script>

<style scoped>
h5 {
  font-size: 60px;
  text-shadow: 5px 5px #19181a;
  font-family: 'Yanone Kaffeesatz', sans-serif;
  background-color: rgba(34, 56, 97, .8);
  text-align: center;
  box-shadow: rgb(19, 31, 44) 30px 30px 30px -15px;
  padding: 10px;
}
h4 {
  font-size: 80px;
  text-shadow: 5px 5px #19181a;
  font-family: 'Yanone Kaffeesatz', sans-serif;
  width: 1400px;
  background-color: rgba(34, 56, 97, .8);
  text-align: center;
  margin-top: -850px;
  padding: 20px;
  
}
p {
  font-size: 80px;
  text-shadow: 5px 5px #19181a;
  font-family: 'Yanone Kaffeesatz', sans-serif;
  height: 800px;
  text-align: center;
  padding:40px;
  background-color: rgba(34, 56, 97, .8);
  box-shadow: rgb(19, 31, 44) 30px 30px 30px -15px;
  
}  
img {
  height:1100px;
  width: 800px;
  margin-top: 40px;
  margin-bottom: 40px;
  background-color: rgb(34, 56, 97);
  box-shadow: rgb(19, 31, 44) 30px 30px 30px -15px;
  display: block;
  margin-left: auto;
  margin-right: auto;
  
}
</style>
