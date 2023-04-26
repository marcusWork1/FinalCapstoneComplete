<template>
  <div >
        <body class="bodyimage">
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css?family=Chewy"
    />
      <header>
        <router-link v-bind:to="{ name: 'home' }"
          ><img class="imgicon" src="https://i.imgur.com/LajHZNM.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'description' }"
          ><img class="descicon" src="https://i.imgur.com/SEaHA1C.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'addmovie' }"
          ><img class="movieicon" src="https://i.imgur.com/MixOVcC.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'login' }"
          ><img class="logicon" src="https://i.imgur.com/LCzEoo0.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'profile' }"
          ><img class="profileicon" src="https://i.imgur.com/lfIq5sT.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'browse' }">Browse</router-link>&nbsp;
        <router-link v-bind:to="{ name: 'contactus' }"><img class="contacticon" src="https://i.imgur.com/ORWfoJL.png" /></router-link
        >&nbsp;
      <router-link v-bind:to="{ name: 'favoritemovies'}">Favorite Movies</router-link>
      </header>
    <h1></h1>
    <br />
    <!--shows a list of movies to browse by genre-->

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

</style>
