<template>
<div>
<<<<<<< HEAD
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Chewy">
<p>  </p>
  <form class = "movieform" v-on:submit.prevent="submitMovie">
    <br>
    <p> Add Movie :) </p>
    <div>
      <label for="title">Title:</label>
=======
<p>This works now!</p>
  <form v-on:submit.prevent="submitMovie">
    <div class="form-group">
      <label for="title">Title: </label>
>>>>>>> 82f5ea25a1b1dccbe0cc3323d3fdf648f1d24c89
      <input id="title" type="text" v-model="newMovie.title" />
    </div>
    <div class="form-group">
      <label for="release_date">Release Date: </label>
      <input id="release_date" type="date" v-model="newMovie.release_date" />
    </div>
    <div class="form-group">
      <label for="overview">Overview: </label>
      <input id="overview" type="text" v-model="newMovie.overview" />
    </div>
    <div class="form-group">
      <label for="genre">Genre: </label>
      <input id="genre" type="text" v-model="newMovie.genre" />
    </div>
    <div class="form-group">
      Pr0n?
      <input
        id="yes plz"
        type="radio"
        value="true"
        v-model="newMovie.adult_only"
      />
      <label for="yes plz">Yes Plz</label>

      <input
        id="no thnx"
        type="radio"
        value="false"
        v-model="newMovie.adult_only"
      />
      <label for="no thnx">No Thnx</label>
    </div>
    <div class="form-group">
      <label for="popularity">Popularity: </label>
      <input
        id="popularity"
        type="number"
        v-model.number="newMovie.popularity"
      />
    </div>
<<<<<<< HEAD
    <br>
    <button class = "button" >Submit</button>
    <br>
   <!-- <button v-on:click="cancel">Cancel</button>-->
=======
    <button v-on:click="submitMovie">Submit</button>
   <button v-on:click="cancelForm">Cancel</button>
>>>>>>> 82f5ea25a1b1dccbe0cc3323d3fdf648f1d24c89
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
    cancelForm () {
      this.newMovie = {}; //sets the newMovie array to empty
      this.$router.push('/'); //sends user back to the homepage
    },


  }, //end of methods
}; //end of export data
</script>

<<<<<<< HEAD
<style>
.movieform {
  background-color: #BB9CDF;
  font-family: 'Chewy',typeface;
  padding-left: 25px;
}
.button {
  display: inline-block;
  padding: 10px 20px;
  margin-bottom: 30px;
  font-size: 18px;
  cursor: pointer;
  text-align: center;
  font-family: "Chewy";
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #a049a3;
  border: none;
  border-radius: 15px;
  box-shadow: 0 7px rgb(59, 59, 59);
}

.button:hover {background-color: #5b1b6e}

.button:active {
  background-color: #8e3e8a;
  box-shadow: 0 5px rgb(61, 61, 61);
  transform: translateY(4px);
}

=======
<style scoped>
.form-group {
  margin-top: 10px;
  margin-bottom: 10px;
}

div {
  background-color: rgb(114, 48, 190);
  color: white;

}
>>>>>>> 82f5ea25a1b1dccbe0cc3323d3fdf648f1d24c89
</style>
