<template>
  <div>
    <body>

<img class = "bannerimage" src = "https://i.imgur.com/ZX8xxy2.jpg">
      <fav-movie-display
        class="favmoviedisplay"
        v-for="singleMovie in this.$store.state.favMovieList.results"
        v-bind:key="singleMovie.id" 
        v-bind:favmovie="singlemovie"
      />
    </body>
  </div>
</template>

<script>
import FavMovieDisplay from "../components/FavMovieDisplay.vue";

export default {
  name: "fav-movie-list",
  components: {
    FavMovieDisplay,
  },
};
</script>

<style>
</style>
