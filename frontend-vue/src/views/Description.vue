<template>
  <div class="desc">
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css?family=Chewy"
    />
    <header>
      <router-link v-bind:to="{ name: 'home' }">Back Home</router-link>&nbsp;
      <router-link v-bind:to="{ name: 'description' }">Description</router-link
      >&nbsp;
      <router-link v-bind:to="{ name: 'addmovie' }">Add Movie</router-link
      >&nbsp;
      <router-link v-bind:to="{ name: 'login' }">Login</router-link>&nbsp;|
      <router-link v-bind:to="{ name: 'profile' }">Profile</router-link>&nbsp;
      <router-link v-bind:to="{ name: 'browse' }">Browse</router-link>&nbsp;
      <router-link v-bind:to="{ name: 'contactus' }">Contact Us</router-link
      >&nbsp;
    </header>

    <h1>Dateflix and Chill App Description</h1>
    <br />
    <img class="walle" src="https://i.imgur.com/ssZGent.png" />
    <div></div>
    <div class="description">
      <div class="info">
        <h2>About Dateflix and Chill</h2>
        <h3>
          Welcome to DateFlix, the app that helps you find the perfect movie
          match! With DateFlix, you can swipe through a variety of movies to
          discover new titles and find ones that fit your interests. Whether
          you're looking for something romantic, thrilling, funny, or
          thought-provoking, DateFlix has something for everyone.
        </h3>

        <p class="paragraph">
          Our app uses a smart algorithm that takes into account your
          preferences, viewing history, and ratings to match you with movies
          you're likely to enjoy. Just swipe right on movies you like, and swipe
          left on those you're not interested in. You can also save movies to
          your Watchlist to come back to later. <br /><br />
          But DateFlix is more than just a movie recommendation app. It's a
          community of movie lovers who are passionate about finding great films
          and sharing them with others. Connect with like-minded users, see what
          movies they've enjoyed, and get inspired by their picks. So why not
          give DateFlix a try and find your perfect movie match today? Swipe
          right to movies you'll love, and left to those you'll pass on. With
          DateFlix, every night can be a movie night!
        </p>
      </div>
      <br /><br />
    </div>
    <footer>
      <p>
        ® DateFlix and Chill<br />
        <a href="http://localhost:8080/description"
          >More about our company here :)</a
        >
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

<style scoped>
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
.desc {
  background-color: #231b52;
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
.profileicon {
  width: 87px;
  height: 85px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-bottom: 10px;
  margin-left: 20px;
  margin-top: 10px;
}
.profileicon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
header {
  background-color: #231b52;
}
</style>
