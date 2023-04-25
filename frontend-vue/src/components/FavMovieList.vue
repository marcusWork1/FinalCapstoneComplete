<template>
  <div>
      <h1> Browse Favorite Movies</h1>

     <!-- <movie-display v-for="favoritedMovie in this.$store.state.currentMovieList.results" v-bind:key="singlemovie.id"
                     v-bind:movie = "favorited"/-->

  </div>
</template>

<script>
//import FavMovieDisplay from '../components/FavMovieDisplay.vue'; 



export default {
    name:"fav-movie-list",
    components:{
        //FavMovieDisplay
    },
}


</script>

<style>

</style>