<template>
  <div >
    <body class = "browsebody">
      <!--this -should- use moviedisplay with a v-for each movie json object-->
      <movie-display
        class="table"
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
