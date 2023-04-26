<template>
  <div class="desc">
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
    <body>
      <fav-movie-list />
    </body>
  </div>
</template>

<script>
import FavMovieList from "../components/FavMovieList.vue";

export default {
  name: "favorite-movies", // name must be the same as the tag above ^ so vue knows
  components: {
    FavMovieList,
  },
  // created() {
  //   APIService.getFavoriteMoviesById() // set up api call and retrieve list with path the array of ids from database
  //   .then((response) => {
  //     this.$store.commit("SET_FAVMOVIELIST", response); // set favorite movie list with response array
  //   });
  //   console.log
  // }
};
</script>

<style>

</style>
