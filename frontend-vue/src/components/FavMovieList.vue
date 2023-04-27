<template>
  <div>
    <body>

<img class = "browsebody"> 
      <fav-movie-display
        class="table"
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
.table {
  scale: 50%;
  min-height: 200px;
  display:inline;
  color: white;
  margin-top: -1300px;
  padding-top: 1200px;
}
.browsebody {
 display:block;
}
</style>
