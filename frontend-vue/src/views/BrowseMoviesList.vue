<template>
    <div class = "desc">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Chewy">
        <header>
          <router-link v-bind:to="{ name: 'home' }">Back Home</router-link>&nbsp;
          <router-link v-bind:to="{ name: 'description' }">Description</router-link>&nbsp;
          <router-link v-bind:to="{ name: 'addmovie' }">Add Movie</router-link>&nbsp;
          <router-link v-bind:to="{ name: 'login' }">Login</router-link>&nbsp;|
          <router-link v-bind:to="{ name: 'profile' }">Profile</router-link>&nbsp;
          <router-link v-bind:to="{ name: 'browse' }">Browse</router-link>&nbsp;
          <router-link v-bind:to="{ name: 'contactus' }">Contact Us</router-link>&nbsp;

        </header>
          <h1>Browse Movies</h1><br>
    <!--shows a list of movies to browse by genre-->
    <movie-list />
  </div>
</template>

<script>
import MovieList from "../components/MovieList.vue";
import APIService from "../services/APIService.js";

export default {
  components: { MovieList },
  created() { 
  //  APIService.getMovies().then(response => { this.$store.commit('SET_CURRENTMOVIELIST', response)} );
  APIService.getMoviesByGenre(this.$store.state.account.genre).then(response => { this.$store.commit('SET_CURRENTMOVIELIST', response)} );
   console.log("Hi Marcus")
   }

};
</script>

<style>


</style>
