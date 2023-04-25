<template>
 
    <!--this should show ONE movie with the option of liking or disliking, have you watched it?-->
  <div class="display">
    <!--uses props to get the data from the API service -->
    <div>
      <!--trying to display the movie title and release date-->
            <h3 class="favmovie-title">{{ favmovie.original_title }}</h3>
            <h3 class="favmovie-year">{{ favmovie.release_date }}</h3>
            <h3 class="favmovie-year"> {{favmovie.id}}</h3>
       <!-- tries to display the poster image. it's always the v-bind:src and whatever is in the poster_path: from the json object -->
       <img v-bind:src="
          'https://image.tmdb.org/t/p/original/' + favmovie.poster_path
        " alt="favmovie.original_title"
      />
      <!--Trying to display overview/plot of the movie-->
    <p>{{ movie.overview }}</p>
    </div>
      <form class="favmovieform" v-on:submit.prevent="removeFavorite">
      <button class="button">Remove from Favorites</button> <!-- delete button -->
    
    </form> 
  </div>
</template>

<script>
import DatabaseService from '../services/DatabaseService';
export default {
    name: "fav-movie-display",
    props: ["favmovie"], // props for the fav movie api response, allowing us to use the data in the display/sending elsewhere
    data() {
      return {
        movies: "",
      };
    },
    created(){
      this.movies = this.$store.favMovieList // not completely sure what this does 

    },
methods: { // method for calling the favaorite movie GET in the services,  based on the account id in the store
    getFavoriteMovie() {
      
    DatabaseService.getAllFavorites(this.$route.params.$store.state.account.account_id)
    .then(response => {
      this.movies = response.data;
    })
    },


removeFavorite() { // method for removing a favorite as per trello board
  const deleteFav = {
    account_id: this.$store.state.account.account_id,
    movie_id: this.movie.id
  };
  DatabaseService.deleteFavorite(deleteFav)

},

},

}
     

</script>

<style></style>
