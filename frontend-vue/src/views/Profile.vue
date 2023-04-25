<template>
  <div class="bodyimage">
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css?family=Chewy"
    />
    <header>
      <router-link v-bind:to="{ name: 'home' }"
        ><img class="imgicon" src="https://i.imgur.com/LajHZNM.png" /></router-link
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
      <router-link v-bind:to="{ name: 'favoritemovies'}">Favorite Movies</router-link>
    </header>
    <h1>Flick Finder Profile Page</h1>
    <br />
    <img class="walle" src="https://i.imgur.com/ssZGent.png" />
    <profile-questions />
  </div>
</template>

<script>
import ProfileQuestions from "../components/ProfileQuestions";

export default {
  components: {
    ProfileQuestions,
  },
};
</script>

<style>

h1 {
  color: white;
  text-align: center;
}
.walle {
  height: 200px;
  display: block;
  max-height: 100%;
  max-width: 100%;
  margin-right: auto;
  margin-left: auto;
}
</style>
