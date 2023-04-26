<template>
  <div>
    <form class="movieform" v-on:submit.prevent="submitMovie">
      <br /><br />
      <h1>Movie Form</h1><br>
      <div class="form-group">
        <label for="title">Title: </label>
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
        <input
          id="genre"
          type="text"
          placeholder="make dropdown"
          v-model="newMovie.genre"/>
      </div>
      <div class="form-group">
        Adult Movie?
        <input
          id="Yes"
          type="radio"
          value="true"
          v-model="newMovie.adult_only"/>
        <label for="Yes">Yes</label>

        <input
          id="No"
          type="radio"
          value="false"
          v-model="newMovie.adult_only"/>
        <label for="No">No</label>
      </div>
      <div class="form-group">
        <label for="popularity">Popularity: </label>
        <input
          id="popularity"
          type="number"
          v-model.number="newMovie.popularity"
        />
      </div>
      <button class="buttons">Submit</button>
      <button class="cancel" v-on:click="cancelForm">Cancel</button>
    </form>
  </div>
</template>

<script>
import DatabaseService from "../services/DatabaseService";
import moment from "moment";

export default {
  name: "movie-form",
  props: {
    movieId: {
      type: Number,
      default: 0,
    },
  },
  data() {
    return {
      newMovie: {
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
        title: this.newMovie.title,
        release_date: moment().format("YYYY-MM-Do"),
        overview: this.newMovie.overview,
        genre: this.newMovie.genre,
        adult_only: this.newMovie.adult_only,
        popularity: this.newMovie.popularity,
      };
      if (this.movieId === 0) {
        DatabaseService.postToLocalHost9000(newMovie)
          .then((response) => {
            if (response.status === 201) {
              this.resetForm();
            }
          })
          .catch((error) => {
            this.handleErrorResponse(error, "adding");
          });
      }
    },
    cancelForm() {
      this.newMovie = {}; //sets the newMovie array to empty
      this.$router.push("/"); //sends user back to the homepage
    },
    resetForm() {
      this.newMovie = {};
    },
    handleErrorResponse(error, verb) {
      if (error.response) {
        this.errorMsg =
          "Error " +
          verb +
          " movie. Response received was '" +
          error.response.statusText +
          "'.";
      } else if (error.request) {
        this.errorMsg =
          "Error " + verb + " movie. Server could not be reached.";
      } else {
        this.errorMsg =
          "Error " + verb + " movie. Request could not be created.";
      }
    },
  }, //end of methods
}; //end of export data
</script>

<style>
form {
  text-align: center;
  margin-left: 550px;
  margin-right: 550px;
  background-color: rgba(34, 56, 97, .8);
  border-radius: 15px;
  box-shadow: rgb(19, 31, 44) 30px 30px 30px -15px;
  font-size: 35px;
  padding-bottom: 75px;
  color:white;
}

button {
  display: inline-block;
  padding: 15px 55px 5px;
  font-size: 34px;
  margin-right: 30px;
  margin-top: 20px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #a3d8fc;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
  font-family: 'Yanone Kaffeesatz', sans-serif;
  color: black;
}

.button:hover {background-color: #365d83}

.button:active {
  background-color: #48979c;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}

input {
  width: 150px;
  height: 30px;
  text-align: center;
  margin-bottom: 20px;
}
h2 {
  text-align: center;
}
h1 {
  text-align: cemter;
}

select {
  width: 250px;
  height: 40px;
  text-align: center;
  margin-bottom: 20px;
  font-size: 22px;
}
</style>
