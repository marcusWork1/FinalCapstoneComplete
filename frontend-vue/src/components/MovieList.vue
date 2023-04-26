<template>
  <div >
    <body>
      <!--this -should- use moviedisplay with a v-for each movie json object-->
      <movie-display
        class="moviedisplay"
        v-for="singlemovie in this.$store.state.currentMovieList.results"
        v-bind:key="singlemovie.id"
        v-bind:movie="singlemovie"
      />
    </body>
  </div>
</template>

<script>
import MovieDisplay from "../components/MovieDisplay.vue";

export default {
  name: "movie-list",
  components: {
    MovieDisplay,
  },
};
</script>

<style>
.moviedisplay {
  display: table-cell;
  display: inline-block;
}
</style>
