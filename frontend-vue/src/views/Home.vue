<template>
  <div class="home">
    <body id = "body">
            <header>
            <a href="http://localhost:8080/"><img class = "imgicon" src="../assets/webicon.png" alt="webicon"/> </a>
            <a href="#"><img class = "descicon" src="../assets/descicon.jpg" alt="descicon"/> </a> 
            <a href="#"><img class = "contacticon" src="../assets/contacticon.jpg" alt="contacticon"/> </a>
            <router-link to =/addmovie> Add a Movie! </router-link> 
            <a href="http://localhost:8080/login"><img class = "logicon" src="../assets/loginicon.png" alt="logicon"> </a>
        </header>
    <navigate />
 
    <div id="description">
    <p>Welcome to DateFlix and Chill ;)</p>
    <h2>About Dateflix and Chill</h2>
    <p>In April 2023, six Tech Elevator Programmers were tired of 
      bad movie recommendations that did not align with their interest.
      Together they brainstromed and created an app that comes up with the best
      movie to watch based on your personal preference and mood when trying to find
      the perfect title to watch for date night. Our app follows a tinder-style 
      format of clicking right or left on a movie if you’ve seen it, and you rate how you felt about 
      it the app would suggest movies based off of your swipes. 
    </p>
   </div>
    <h2><router-link to =/login> Login or Sign Up Here! </router-link></h2>
    <h2><router-link to =/addmovie> Add a Movie Here! </router-link></h2>
    <!-- <movie-form/> -->
    </body>
     
  </div>
  
</template>

<script>
import Navigate from '../components/Navigate.vue';
//import MovieForm from '../components/MovieForm.vue';

export default {
  name: "home",
  components: {
    Navigate,
   // MovieForm
  }
};
</script>

<style scoped>
* { margin:0; padding:0; }
.home {
  background-color: #140180;
  margin: 0px;
  padding: 0px;
}
.cantdecide {
  display: block;
  margin-left: auto;
  margin-right: auto;
  height:25px;
  padding-top: 10px;
}
a:visited {
  color:thistle;
}

#description{
  color: #ABD3FF;
}
.h1 {
  font-family: 'Brush Script MT', cursive;
}
.bordercine {
  height: 25px;
  width: 1400px;
  max-width: 100%;
  display: block;
  margin-right: auto;
  margin-left: auto;
  box-shadow: 0px 7px 8px black;
}

.hover {
  padding-top: 10pt;
  display: block;
  margin-left: auto;
  margin-right: auto;
  text-align: center;
  font-family: 'Chewy',typeface;
  text-shadow: 4px 3px #19181a;
  width: 200px;
}
.signup {
  color:#c0aed4;
}
.signup:hover {
  color:darkmagenta;
}
span {
  position:relative;
    display:inline-block;
    border:1px solid #CCC;
    padding-inline: 10px;
    padding-bottom: 5px;
    padding-top: 3px;
}
h1 {
  color:#c0aed4;
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

li {
  display: inline-block;
}

.navbar {
  list-style-type: none;
  padding-bottom: 0;
  margin: 0;
  display: inline-block;
}
</style>