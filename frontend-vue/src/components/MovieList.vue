<template>
  <div>
    <body>
      <!--this -should- use moviedisplay with a v-for each movie json object-->
        <h1 >Browse Movies</h1>
              <img class = "walle" src = "https://i.imgur.com/ssZGent.png">
      <movie-display class = "moviedisplay" v-for="singlemovie in this.$store.state.currentMovieList.results" v-bind:key="singlemovie.id"
                     v-bind:movie = "singlemovie"/>
    </body>
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
body {
  overflow-x:scroll;
  overflow-x:visible;
  background-color: #231b52;
  flex-wrap: wrap;
}
div {
  color: white;
}
.moviedisplay {
 scale: 70%;
 font-size: 30px;
 display: table-cell;
 word-wrap: break-word;
 margin-top:-100px;
 
}

</style>