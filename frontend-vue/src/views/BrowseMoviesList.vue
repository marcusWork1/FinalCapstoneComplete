<template>
    <div class = "desc">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Chewy">
        <header>
            <a href="http://localhost:8080/"><img class = "imgicon" src="../assets/webicon.png" alt="webicon"/> </a>
            <a href="http://localhost:8080/description"><img class = "descicon" src="https://i.imgur.com/ZfFZoTz.jpg" alt="descicon"/> </a>
            <a href="#"><img class = "contacticon" src="../assets/contacticon.jpg" alt="contacticon"/> </a>
            <a href="http://localhost:8080/addmovie"><img class = "movieicon" src="https://i.imgur.com/6tEu04Z.jpg" alt="movieicon"/> </a>
            <a href="http://localhost:8080/login"><img class = "logicon" src="../assets/loginicon.png" alt="logicon"> </a>
            <a href="http://localhost:8080/profile"> <img class = "profileicon" src="https://i.imgur.com/VP2RcSx.png" alt="profileicon"> </a>

        </header>
          <h1>Browse Movies</h1><br>
    <!--shows a list of movies to browse by genre-->
    <movie-list />
  </div>
</template>

<script>
import MovieList from "../components/MovieList.vue";
import APIService from "../services/APIService.js";

export default {
  components: { MovieList },
  created() { 
   APIService.getMovies().then(response => { this.$store.commit('SET_CURRENTMOVIELIST', response)} );
   console.log("Hi Marcus")
   }

};
</script>

<style></style>
