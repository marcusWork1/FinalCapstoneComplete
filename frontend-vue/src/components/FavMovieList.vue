<template>
  <div>
    <body>
      <h1>Browse Favorite Movies</h1>

      <fav-movie-display
        class="favmoviedisplay"
        v-for="singlemovie in this.$store.state.favMovieList"
        v-bind:key="singlemovie.id" 
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
