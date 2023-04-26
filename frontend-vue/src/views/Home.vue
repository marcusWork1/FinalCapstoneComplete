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
    font-size: 40px;
}
.mainimage {
  margin-top: 40px;
  display: block;
  margin-left: auto;
  margin-right: auto;
  height: 60%;
  width: 50%;
  box-shadow: 1px 1px 15px 15px rgb(41, 79, 122);
}
.bodyimage {
  background-image: url("https://i.imgur.com/Bm1I1fA.png");
  min-height: 100%;
  min-width: 1024px;
  position:absolute;
	background-repeat: no-repeat;
  background-size: cover;
  width: 100%;
  height: auto;
  top: 0;
  left: 0;
  font-family: 'Yanone Kaffeesatz', sans-serif;
  overflow: scroll;
}
* {
  margin: 0;
  padding: 0;
}
footer {
  font-family: 'Yanone Kaffeesatz', sans-serif;
  padding-left: 15px;
  padding-bottom: 15px;
  color:  rgb(13, 26, 49);
}
.cantdecide {
  font-family: 'Yanone Kaffeesatz', sans-serif;
  color: rgb(65, 107, 186);
  text-shadow: 1px 1px #19181a;
  font-size: 40px;
}
a:visited {
  color: rgb(149, 162, 235);
}
#description {
  color: rgb(227, 235, 242);
  background-color: rgb(34, 56, 97);
  padding: 12px;
  margin: 10px;
  font-family: 'Yanone Kaffeesatz', sans-serif;
  border-radius: 10px;
  text-align: center;
  margin-left: 240px;
  margin-right: 240px;
  font-size: 30px;
  box-shadow: rgb(38, 57, 77) 0px 20px 30px -10px;
}
.hover {
  padding-top: 10pt;
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
  width: 150px;
  height: 120px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-left: 10px;
  margin-top: 25px;
  margin-bottom: 10px;
}
.imgicon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
.logicon {
  width: 120px;
  height: 120px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-bottom: 10px;
  float: right;
  margin-right: 10px;
  margin-top: 25px;
}
.logicon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
.descicon {
  width: 120px;
  height: 120px;
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
  width: 120px;
  height: 120px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-bottom: 10px;
  margin-top: 25px;
  float: right;
  margin-right: 30px;
}
.contacticon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
.movieicon {
  width: 120px;
  height: 120px;;
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
  width: 120px;
  height: 120px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-bottom: 10px;
  margin-left: 15px;
  margin-top: 10px;
}
.profileicon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>
