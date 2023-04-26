<template>
  <div>
    <body>

<img class = "bannerimage" src = "https://i.imgur.com/ZX8xxy2.jpg">
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

<style scoped>
.table {
  scale: 50%;
  min-height: 200px;
  display: inline;
  color: white;
}
.browsebody {
 display: table-cell;
}
</style>
