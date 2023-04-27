<template>
  <!--this should show ONE movie with the option of liking or disliking, have you watched it?-->
  <div class="browsebody">
    <!--uses props to get the data from the API service -->
    <div class = "table">
       
      <!--trying to display the movie title and release date-->
      <h4 class="movie-title">{{ movie.original_title }}</h4>
      <h5 class="movie-year">{{ movie.release_date }} </h5>
      <!-- tries to display the poster image. it's always the v-bind:src and whatever is in the poster_path: from the json object -->
      <img
        v-bind:src="
          'https://image.tmdb.org/t/p/original/' + movie.poster_path"
        alt="movie.original_title"
      />
      <form class="movieform" v-on:submit.prevent="removeFavorite">
      <button class="button">Remove from Favorites</button>
      </form>
      <!--Trying to display overview/plot of the movie-->
      <div class = "transparent" >
      <br><br><p>{{ movie.overview }}</p>
    </div>
    </div>
      <!-- delete button -->
  </div>
</template>

<script>
import DatabaseService from "../services/DatabaseService";
import APIService from "../services/APIService";

export default {
  name: "fav-movie-display",
  props: ["favmovie"], // props for the fav movie api response, allowing us to use the data in the display/sending elsewhere
  data() {
    return {
      movie: "",
    };
  },
  created() { // call the API here to return a movie object that we can populate in this display
   
      // DatabaseService.getAllFavorites(
      //   this.$store.state.account.account_id
      // ).then((response) => {
       
      //   this.movies = response.data;
      // });
  
   APIService.getMovieByMovieId(this.favmovie.movie_id)
   .then((response) => {
            this.movie = response;
        
          })
    //this.movie = this.$store.favMovieList; // not completely sure what this does
  },
  methods: {
    
    // method for calling the favaorite movie GET in the services,  based on the account id in the store
    // getFavoriteMovie() {
    //   DatabaseService.getAllFavorites(
    //     this.$route.params.$store.state.account.account_id
    //   ).then((response) => {
    //     this.movies = response.data;
    //   });
    // },

    removeFavorite() {
      // method for removing a favorite as per trello board
      const deleteFav = {
        account_id: this.$store.state.account.account_id,
        movie_id: this.movie.id,
      };
      DatabaseService.deleteFavorite(deleteFav)
      .then((response) => {
         if (response.status === 200) {
           DatabaseService.getAllFavorites(this.$store.state.accountaccount_id)
           .then((response) => {
             this.$store.commit("SET_FAVMOVIELIST", response.data)
           });

         }

      })
     

      }
  
  },
};
</script>

<style scoped>

h5 {
  font-size: 60px;
  text-shadow: 5px 5px #19181a;
  font-family: 'Yanone Kaffeesatz', sans-serif;
  background-color: rgba(34, 56, 97, .8);
  text-align: center;
  box-shadow: rgb(19, 31, 44) 30px 30px 30px -15px;
  padding: 10px;
}
h4 {
  font-size: 80px;
  text-shadow: 5px 5px #19181a;
  font-family: 'Yanone Kaffeesatz', sans-serif;
  width: 1400px;
  background-color: rgba(34, 56, 97, .8);
  text-align: center;
  margin-top: -850px;
  padding: 20px;
  
}
p {
  font-size: 80px;
  text-shadow: 5px 5px #19181a;
  font-family: 'Yanone Kaffeesatz', sans-serif;
  height: 800px;
  text-align: center;
  padding:40px;
  background-color: rgba(34, 56, 97, .8);
  box-shadow: rgb(19, 31, 44) 30px 30px 30px -15px;
  
}  
img {
  height:1100px;
  width: 800px;
  margin-top: 40px;
  margin-bottom: 40px;
  background-color: rgb(34, 56, 97);
  box-shadow: rgb(19, 31, 44) 30px 30px 30px -15px;
  display: block;
  margin-left: auto;
  margin-right: auto;
  
}
button {
  margin-top: 45px;
  margin-left: 20px;
  margin-bottom: -25px;
}

</style>
