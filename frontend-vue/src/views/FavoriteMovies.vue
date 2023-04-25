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
    <body>
      <fav-movie-list />
    </body>
  </div>
</template>

<script>
import FavMovieList from "../components/FavMovieList.vue";

export default {
  name: "fav-movie-list", // name must be the same as the tag above ^ so vue knows
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
.walle {
  height: 90px;
}
</style>
