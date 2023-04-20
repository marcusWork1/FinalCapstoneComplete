<template>
  <div>
      <!--this -should- use moviedisplay with a v-for each movie json object-->
      <movie-display v-for="singlemovie in movie" v-bind:key="singlemovie.id">
  </div>
</template>

<script>
import MovieDisplay from '../component/MovieDisplay.vue';

export default {
  name: "movie-list",
  components: {
   MovieDisplay
  },
}
</script>

<style>

</style>