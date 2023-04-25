<template>
  <div class="desc">
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css?family=Chewy"
    />
    <header>
      <router-link v-bind:to="{ name: 'home' }"
        ><img class="imgicon" src="../assets/webicon.png" /></router-link
      >&nbsp;
      <router-link v-bind:to="{ name: 'description' }"
        ><img class="descicon" src="../assets/descicon.jpg" /></router-link
      >&nbsp;
      <router-link v-bind:to="{ name: 'addmovie' }"
        ><img class="movieicon" src="../assets/movieicon.jpg" /></router-link
      >&nbsp;
      <router-link v-bind:to="{ name: 'login' }"
        ><img class="logicon" src="../assets/loginicon.png" /></router-link
      >&nbsp;
      <router-link v-bind:to="{ name: 'profile' }"
        ><img
          class="profileicon"
          src="../assets/profileicon.png" /></router-link
      >&nbsp;
      <router-link v-bind:to="{ name: 'browse' }">Browse</router-link>&nbsp;
      <router-link v-bind:to="{ name: 'contactus' }"
        ><img
          class="contacticon"
          src="../assets/contacticon.jpg" /></router-link
      >&nbsp;
    </header>
    <h1></h1>
    <br />
    <!--shows a list of movies to browse by genre-->
    <body>
      <movie-list />
    </body>
  </div>
</template>

<script>
import MovieList from "../components/MovieList.vue";
import APIService from "../services/APIService.js";

export default {
  components: { MovieList },
  created() {
    //  APIService.getMovies().then(response => { this.$store.commit('SET_CURRENTMOVIELIST', response)} );
    APIService.getMoviesByGenre(this.$store.state.account.genre).then(
      (response) => {
        this.$store.commit("SET_CURRENTMOVIELIST", response);
      }
    );
    console.log("Hi Marcus");
  },
};
</script>

<style>
body {
  color: white;
}
</style>
