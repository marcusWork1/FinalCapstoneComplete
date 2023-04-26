<template>
  <div class="bodyimage">
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
        <router-link v-bind:to="{ name: 'login' }"
          ><img class="logicon" src="https://i.imgur.com/LCzEoo0.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'profile' }"
          ><img class="profileicon" src="https://i.imgur.com/lfIq5sT.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'browse' }">Browse</router-link>&nbsp;
        <router-link v-bind:to="{ name: 'contactus' }"><img class="contacticon" src="https://i.imgur.com/ORWfoJL.png" /></router-link
        >&nbsp;
      <router-link v-bind:to="{ name: 'favoritemovies'}">Favorite Movies</router-link>
      </header>
    <br />
    <img class="bannerimage" src="https://i.imgur.com/7He2qAV.jpg" />

    <div id="description">
      <div class = "border">
        <h1>About Flick Finder</h1><br>
        <p>
          Welcome to Flick Finder, the app that helps you find the perfect movie
          match! With Flick Finder, you can swipe through a variety of movies to
          discover new titles and find ones that fit your interests. Whether
          you're looking for something romantic, thrilling, funny, or
          thought-provoking, Flick Finder has something for everyone.
        </p><br>

        <p>
          Our app uses a smart algorithm that takes into account your
          genre preferences to match you with movies
          you're likely to enjoy. You can also save movies to
          your Favorites to come back to later. <br /><br />
          Flick Finder is more than just a movie recommendation app. It's a
          community of movie lovers who are passionate about finding great films
          and sharing them with others. So why not
          give Flick Finder a try and find your perfect movie match today? Slide
          right to movies you'll love. With
          Flick Finder, every night can be a movie night!
        </p>
      </div>
    </div>
    <footer>
      <p>
        ® Flick Finder<br />
      </p>
    </footer>
  </div>
</template>

<script>
export default {
  name: "description",
  components: {},
};
</script>

<style>
.bannerimage {
  height: 165px;
  box-shadow: rgb(19, 31, 44) 30px 30px 30px -15px;
  border-radius: 10px;
  display: block;
  margin-right: auto;
  margin-left: auto;
  margin-bottom: 70px;
}
.border {
  padding: 60px;
}
</style>
