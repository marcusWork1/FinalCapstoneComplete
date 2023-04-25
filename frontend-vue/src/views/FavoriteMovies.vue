<template>
  <div class="desc">
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css?family=Chewy"
    />
    <header>
      <router-link v-bind:to="{ name: 'home' }"
        ><img class="imgicon" src="../assets/webicon.png" /></router-link
      >&nbsp;
      <router-link v-bind:to="{ name: 'description' }"
        ><img class="descicon" src="../assets/descicon.jpg" /></router-link
      >&nbsp;
      <router-link v-bind:to="{ name: 'addmovie' }"
        ><img class="movieicon" src="../assets/movieicon.jpg" /></router-link
      >&nbsp;
      <router-link v-bind:to="{ name: 'login' }"
        ><img class="logicon" src="../assets/loginicon.png" /></router-link
      >&nbsp;
      <router-link v-bind:to="{ name: 'profile' }"
        ><img
          class="profileicon"
          src="../assets/profileicon.png" /></router-link
      >&nbsp;
      <router-link v-bind:to="{ name: 'browse' }">Browse</router-link>&nbsp;
      <router-link v-bind:to="{ name: 'contactus' }"
        ><img
          class="contacticon"
          src="../assets/contacticon.jpg" /></router-link
      >&nbsp;
    </header>
    <body>
      <fav-movie-list />
    </body>
  </div>
</template>

<script>
import FavMovieList from "../components/FavMovieList.vue";

export default {
  name: "fav-movie-list", // name must be the same as the tag above ^ so vue knows
  components: {
    FavMovieList,
  },
  // created() {
  //   APIService.getFavoriteMoviesById() // set up api call and retrieve list with path the array of ids from database
  //   .then((response) => {
  //     this.$store.commit("SET_FAVMOVIELIST", response); // set favorite movie list with response array
  //   });
  //   console.log
  // }
};
</script>

<style>
.walle {
  height: 90px;
}
.image {
  height: 100%;
}


.logicon {
  width: auto;
  height: 85px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-bottom: 10px;
  float: right;
  margin-right: 10px;
  margin-top: 10px;
}
.logicon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}

.descicon {
  width: auto;
  height: 85px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-bottom: 10px;
  margin-left: 20px;
  margin-top: 10px;
}
.descicon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}

.contacticon {
  width: auto;
  height: 85px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-bottom: 10px;
  margin-left: 20px;
  margin-top: 10px;
}
.contacticon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}

.movieicon {
  width: auto;
  height: 85px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-bottom: 10px;
  margin-left: 20px;
  margin-top: 10px;
}
.movieicon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>
