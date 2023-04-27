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

<style scoped>

body{
  margin-top: 715px;
  

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
