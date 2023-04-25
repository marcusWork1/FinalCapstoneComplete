<template>
  <div>
      <!--this -should- use moviedisplay with a v-for each movie json object-->
        <h1 >Browse Movies</h1>
              <img class = "walle" src = "https://i.imgur.com/ssZGent.png">
      <movie-display v-for="singlemovie in this.$store.state.currentMovieList.results" v-bind:key="singlemovie.id"
                     v-bind:movie = "singlemovie"/>
  </div>
</template>

<script>
import MovieDisplay from '../components/MovieDisplay.vue';

export default {
  name: "movie-list",
  components: {
   MovieDisplay
  },
}
</script>

<style>
div {
  display: inline-block;
  background-color: #231b52;
}

</style>