<template>
  <div class = "bodyimage">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Yanone+Kaffeesatz&display=swap" rel="stylesheet">
      <header>
        <router-link v-bind:to="{ name: 'home' }"
          ><img class="imgicon" src="https://i.imgur.com/LajHZNM.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'description' }"
          ><img class="descicon" src="https://i.imgur.com/SEaHA1C.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'addmovie' }"
          ><img class="movieicon" src="https://i.imgur.com/MixOVcC.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'logout' }"
          ><img class="logouticon" src="https://i.imgur.com/IVGcyIo.jpg" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'login' }"
          ><img class="logicon" src="https://i.imgur.com/LCzEoo0.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'profile' }"
          ><img class="profileicon" src="https://i.imgur.com/lfIq5sT.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'browse' }"
        ><img class="browseicon" src="https://i.imgur.com/NFVyR0z.png" /></router-link>
        <router-link v-bind:to="{ name: 'contactus' }"><img class="contacticon" src="https://i.imgur.com/ORWfoJL.png" /></router-link
        >&nbsp;
      <router-link v-bind:to="{ name: 'favoritemovies'}"
        ><img class="favoriteicon" src="https://i.imgur.com/W6WfGod.png" /></router-link>
      </header>
    <div><br>
      <img class="bannerimage" src="https://i.imgur.com/mrPUqvW.jpg" />
      <movie-form />
    </div>
  </div>
</template>

<script>
import MovieForm from "../components/MovieForm.vue";

export default {
  components: {
    MovieForm,
  },
};
</script>

<style>
</style>
