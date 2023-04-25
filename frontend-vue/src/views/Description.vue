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

    <h1>Flick Finder Description</h1>
    <br />
    <img class="walle" src="https://i.imgur.com/ssZGent.png" />
    <div></div>
    <div class="description">
      <div class="info">
        <h2>About Flick Finder</h2>
        <h3>
          Welcome to Flick Finder, the app that helps you find the perfect movie
          match! With Flick Finder, you can swipe through a variety of movies to
          discover new titles and find ones that fit your interests. Whether
          you're looking for something romantic, thrilling, funny, or
          thought-provoking, Flick Finder has something for everyone.
        </h3>

        <p class="paragraph">
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
      <br /><br />
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
footer {
  font-family: "Chewy";
  padding-left: 15px;
  padding-bottom: 15px;
  color: #ac8ad3;
}
h3 {
  color: #231b52;
  font-size: 23px;
}
.walle {
  height: 200px;
  display: block;
  max-height: 100%;
  max-width: 100%;
  margin-right: auto;
  margin-left: auto;
}
.info {
  margin: 25px;
  padding: 15px;
}
h1 {
  color: white;
  font-family: "Chewy";
  text-align: center;
}
.paragraph {
  font-size: 23px;
}
.description {
  background-color: #231b52;
  color: white;
  font-family: "Chewy";
  text-align: center;
  margin: 0px;
  padding: 0;
  height: 70%;
  width: 60%;
  margin-left: auto;
  margin-right: auto;
  font-size: 15px;
}

</style>
