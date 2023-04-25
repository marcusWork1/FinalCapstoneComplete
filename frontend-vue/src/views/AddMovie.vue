<template>
  <div>
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
    <div>
      <h1>Add a Movie</h1>
      <img class="walle" src="https://i.imgur.com/ssZGent.png" />

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

<style scoped>
.walle {
  height: 200px;
  display: block;
  max-height: 100%;
  max-width: 100%;
  margin-right: auto;
  margin-left: auto;
}
.image {
  height: 100%;
}
.imgicon {
  width: auto;
  height: 85px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-left: 10px;
  margin-top: 10px;
  margin-bottom: 10px;
}
.imgicon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
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
