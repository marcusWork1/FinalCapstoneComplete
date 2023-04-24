<template>
<!--this should show ONE movie with the option of liking or disliking, have you watched it?-->
  <div class="display">
    <!--uses props to get the data from the API service -->
    <div v-for="movie in movies" :key="movie.id">
      <!--trying to display the movie title and release date-->
            <h3 class="movie-title">{{ movie.original_title }}</h3>
            <h3 class="movie-year">{{ movie.release_date }}</h3>
       <!-- tries to display the poster image. it's always the v-bind:src and whatever is in the poster_path: from the json object -->
       <img v-bind:src="
          'https://image.tmdb.org/t/p/original/' + movie.poster_path
        " alt="movie.original_title"
      />
      <!--Trying to display overview/plot of the movie-->
    <p>{{ movie.overview }}</p>
    </div>
    <!--Liked/notliked buttons-->
    <!-- <div class="button-container" v-if="!enableAdd">
        <button
          class="mark-like"
          v-on:click.prevent="setLiked(true)"
          v-if="!movie.liked"
        > movie.liked might need to be changed because of the way we're storing it in our tables -->
          <!-- Mark Liked
        </button> -->
        <!-- <button
          class="mark-dislike"
          v-on:click.prevent="setLiked(false)"
          v-if="movie.liked"
        >
          Mark Disliked
        </button> -->
        <!-- <button
          class="mark-notwatched"
          v-on:click.prevent="setWatched(false)"
          v-if="movie.watched"
        >
          Mark Not Watched
        </button> -->
      <!-- </div>
      <button v-if="enableAdd" v-on:click.prevent="addMovieList(book)">
        Add to Watch List
      </button> -->
    </div> 
</template>

<script>

export default {
    name: "movie-details",
    props: ['movies'],
     enableAdd: {
      type: Boolean,
      default: false,
      },
    
    methods: {


      // setWatched(value) { //this method for set watched status doesn't exist yet
      //   this.$store.commit("SET_WATCHED_STATUS", { movie: this.movie, value: value });
      // },
  
      // addToLikedList(WEONLYWANTMOVIEIDRIGHT) {
      //    this.$OURDATABASE.COMMIT("SAVEDISBOOKTOSOMETABLE", WEONLYWANTMOVIEIDRIGHT)
      // },
      
    },
}
</script>

<style>
.display {
color: black;
font-family: 'Courier New', Courier, monospace;

}
</style>