<template>
  <form v-on:submit.prevent="submitMovie" class="WHATDISBUTTONLOOKLIKE">
    <div>
      <label for="title">Title:</label>
      <input id="" type="text" v-model="MOVIE.MODEL.TITLE" />
    </div>
    <div>
      <label for="release_date">Release Date:</label>
      <input id="" type="date" v-model="MOVIE.MODEL.RDATE" />
    </div>
    <div>
      <label for="overview">Overview:</label>
      <input id="" type="text" v-model="MOVIE.MODEL.OVERVIEW" />
    </div>
    <div>
      <label for="genre">Genre:</label>
      <input id="" type="text" v-model="MOVIE.MODEL.GENRE" />
    </div>
    <div>
      Pr0n?
      <input
        id="yes plz"
        type="radio"
        value="true"
        v-model="MOVIE.MODEL.PR0N"
      />
      <label for="yes plz">yes plz</label>

      <input
        id="no thnx"
        type="radio"
        value="false"
        v-model="MOVIE.MODEL.PR0N"
      />
      <label for="no thnx">no thnx</label>
    </div>
    <div>
      <label for="popularity">Popularity:</label>
      <input
        id="popularity"
        type="number"
        v-model.number="MOVIE.MODEL.POPULARITY"
      />
    </div>
    <button class="BUTTONDESIGN">Submit</button>
    <button class="BUTTONDESIGN" v-on:click="cancel">Cancel</button>
  </form>
</template>

<script>
import DatabaseService from "../services/DatabaseService";

export default {
  data() {
    return {
      movie: {
        title: "",
        release_date: null,
        overview: "",
        genre: "",
        adult_only: false,
        popularity: "",
      },
    };
  }, //end of data

  methods: {
    submitMovie() {
      const newMovie = {
        movieId: Number(this.$route.params.movieId),
        title: this.movie.title,
        release_date: moment().format("YYYY-MM-Do"),
        overview: this.movie.overview,
        genre: this.movie.genre,
        adult_only: this.movie.genre,
        popularity: this.movie.popularity,
      },
      if(there is no movie id) {
          DatabaseService.postToLocalHost9000(newMovie).then(response => {if (response.status === 201) {this.$router.push(`/movie/${newMovie.movieId`)}})
      }
    },


  }, //end of methods
}; //end of export data
</script>

<style></style>
