<template>
 <body class = "bodyimage">
  <div class="home">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Yanone+Kaffeesatz&display=swap" rel="stylesheet">
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
          ><img class="profileicon" src="../assets/profileicon.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'browse' }">Browse</router-link>&nbsp;
        <router-link v-bind:to="{ name: 'contactus' }"><img class="contacticon" src="../assets/contacticon.jpg" /></router-link
        >&nbsp;
      <router-link v-bind:to="{ name: 'favoritemovies'}">Favorite Movies</router-link>
      </header>
      <meta charset="UTF-8" /><br>
      <p class="title">Flick Finder &#128521;</p>

         <img class="mainimage" src="https://i.imgur.com/dZqOSDB.jpg" />

      <div class="hover"><br>
      <h1 class = "cantdecide"> Can't Decide? </h1>
      <a href="http://localhost:8080/register"><h2 class="signup"><span> Sign Up Here</span></h2></a>
      </div>

      <br />
      <div id="description">
        <h2 >About Flick Finder</h2><br>
        <p>
          In April 2023, six Tech Elevator Programmers were tired of bad movie
          recommendations that did not align with their interest. Together they
          brainstromed and created an app that comes up with the best movie to
          watch based on your personal preference and mood when trying to find
          the perfect title to watch for any night.
        </p>
    </div><br /><br /><br /><br />

    <footer>
      <p>
        ® Flick Finder<br />
        <a href="http://localhost:8080/description"
          >More about our company here :)</a>
      </p>
    </footer>
  </div>
</body>
</template>

<script>
export default {
  name: "home",
  components: {
     },
};
</script>

<style>
h2 {
    font-family: 'Yanone Kaffeesatz', sans-serif;
}
.mainimage {
  display: block;
  margin-left: auto;
  margin-right: auto;
  height: 60%;
  width: 50%;
}
.bodyimage {
  background-image: url("https://i.imgur.com/Bm1I1fA.png");
  min-height: 100%;
  min-width: 1024px;
	background-repeat: no-repeat;
  background-size: cover;
  /* Set up proportionate scaling */
  width: 100%;
  height: auto;
	
  /* Set up positioning */
  position: fixed;
  top: 0;
  left: 0;
  font-family: 'Yanone Kaffeesatz', sans-serif;
}
* {
  margin: 0;
  padding: 0;
}
footer {
  font-family: 'Yanone Kaffeesatz', sans-serif;
  padding-left: 15px;
  padding-bottom: 15px;
  color: #ac8ad3;
}
.title {
  font-family: 'Yanone Kaffeesatz', sans-serif;
  font-size: 60px;
  color: #f0f2f5;
  text-align: center;
  padding-bottom: 20px;
  text-shadow: 4px 3px #19181a;
  font-weight: bold;
  letter-spacing: 5px;
}
.cantdecide {
  font-family: 'Yanone Kaffeesatz', sans-serif;
  color: rgb(65, 107, 186);
  text-shadow: 1px 1px #19181a;
  font-size: 40px;
}
a:visited {
  color: thistle;
}
#description {
  color: rgb(227, 235, 242);
  background-color: rgb(65, 107, 186);
  border: 8px solid rgb(34, 56, 97);
  padding: 12px;
  margin: 10px;
  font-family: 'Yanone Kaffeesatz', sans-serif;
  border-radius: 10px;
  text-align: center;
  display: block;
  margin-left: 140px;
  margin-right: 140px;
  font-size: 30px;
}
.hover {
  padding-top: 10pt;
  display: block;
  margin-left: auto;
  margin-right: auto;
  text-align: center;
  font-family: 'Yanone Kaffeesatz', sans-serif;
}
.signup {
  font-family: 'Yanone Kaffeesatz', sans-serif;
  color: #000000;
  padding-top: 10px;
  font-size: 30px;
  text-decoration-style: bold;
}
.signup:hover {
  color: rgb(0, 95, 139);
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
</style>
