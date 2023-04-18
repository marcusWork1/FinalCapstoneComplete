<template>
<div>
<p> please work </p>
  <form v-on:submit.prevent="submitMovie">
    <div>
      <label for="title">Title:</label>
      <input id="title" type="text" v-model="newMovie.title" />
    </div>
    <div>
      <label for="release_date">Release Date:</label>
      <input id="release_date" type="date" v-model="newMovie.release_date" />
    </div>
    <div>
      <label for="overview">Overview:</label>
      <input id="overview" type="text" v-model="newMovie.overview" />
    </div>
    <div>
      <label for="genre">Genre:</label>
      <input id="genre" type="text" v-model="newMovie.genre" />
    </div>
    <div>
      Pr0n?
      <input
        id="yes plz"
        type="radio"
        value="true"
        v-model="newMovie.adult_only"
      />
      <label for="yes plz">yes plz</label>

      <input
        id="no thnx"
        type="radio"
        value="false"
        v-model="newMovie.adult_only"
      />
      <label for="no thnx">no thnx</label>
    </div>
    <div>
      <label for="popularity">Popularity:</label>
      <input
        id="popularity"
        type="number"
        v-model.number="newMovie.popularity"
      />
    </div>
    <button >Submit</button>
   <!-- <button v-on:click="cancel">Cancel</button>-->
  </form>
  </div>
</template>

<script>
import DatabaseService from "../services/DatabaseService";
import moment from "moment";

export default {
  name: "movie-form",
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
      newMovie: {
        title: "",
        release_date: null,
        overview: "",
        genre: "",
        adult_only: false,
        popularity: "",
      }
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
      };
      if(this.movieId === 0) {
          DatabaseService.postToLocalHost9000(newMovie).then(response => {if (response.status === 201) {this.$router.push(`/movie/${newMovie.movieId}`)}})
      }
    },


  }, //end of methods
}; //end of export data
</script>

<style></style>
