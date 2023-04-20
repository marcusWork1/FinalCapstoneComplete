<template>
<!--this should show ONE movie with the option of liking or disliking, have you watched it?-->
  <div>
      <!--trying to display the movie title and release date-->
            <h3 class="movie-title">{{ results.original_title }}</h3>
            <h3 class="movie-year">{{ results.release_date }}</h3>
       <!-- tries to display the poster image. it's always the v-bind:src and whatever is in the poster_path: from the json object -->
       <img
        v-if="results.poster_path"
        v-bind:src="
          'https://image.tmdb.org/t/p/original/' + imagepath
        "
      />
      <!--Trying to display overview/plot of the movie-->
    <p>{{ results.overview }}</p>
    <!--Liked/notliked buttons-->
    <div class="button-container" v-if="!enableAdd">
        <button
          class="mark-watched"
          v-on:click.prevent="setWatched(true)"
          v-if="!book.read"
        >
          Mark Liked
        </button>
        <button
          class="mark-notwatched"
          v-on:click.prevent="setWatched(false)"
          v-if="book.read"
        >
          Mark Disliked
        </button>
        <button
          class="mark-notwatched"
          v-on:click.prevent="setWatched(false)"
          v-if="book.read"
        >
          Mark Not Watched
        </button>
      </div>
      <button v-if="enableAdd" v-on:click.prevent="addMovieList(book)">
        Add to Watch List
      </button>
    </div>
</template>

<script>

export default {
    name: "movie-details",
    props: {
        movie: Object,
   enableAdd: {
      type: Boolean,
      default: false,
    },
    },
     methods: {
    setWatched(value) { //this method for set watched status doesn't exist yet
      this.$store.commit("SET_WATCHED_STATUS", { movie: this.movie, value: value });
    },
     },
}
</script>

<style>

</style>