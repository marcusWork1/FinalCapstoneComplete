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

.browsebody {
  background-image: url("https://i.imgur.com/Bm1I1fA.png");
  min-height: 100%;
  min-width: 1024px;
	background-repeat: no-repeat;
  background-size: cover;
  width: 100%;
  height: auto;
  top: 0;
  left: 0;
}
</style>

