<template>
  <!--this should show ONE movie with the option of liking or disliking, have you watched it?-->
  <div class="display">
    <!--uses props to get the data from the API service -->
    <div class = "movie">
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
      <p>{{ movie.overview }}</p>
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

<style>


</style>
