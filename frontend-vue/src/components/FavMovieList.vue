<template>
  <div>
    <body>
      <h1>Browse Favorite Movies</h1>

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
body {
  overflow-x: scroll;
  overflow-x: visible;
  background-color: #231b52;
  flex-wrap: wrap;
}
div {
  color: white;
}
.favmoviedisplay {
  scale: 70%;
  font-size: 30px;
  display: table-cell;
  word-wrap: break-word;
  margin-top: -100px;
}
</style>
