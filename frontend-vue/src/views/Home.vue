<template>
  <div class="home">
    <body id = "body">
            <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Chewy">
            <header>
            <a href="http://localhost:8080/"><img class = "imgicon" src="../assets/webicon.png" alt="webicon"/> </a>
            <a href="http://localhost:8080/description"><img class = "descicon" src="https://i.imgur.com/ZfFZoTz.jpg" alt="descicon"/> </a>
            <a href="#"><img class = "contacticon" src="../assets/contacticon.jpg" alt="contacticon"/> </a>
            <a href="http://localhost:8080/addmovie"><img class = "movieicon" src="https://i.imgur.com/6tEu04Z.jpg" alt="movieicon"/> </a>
            <!-- <router-link to =/addmovie> Add a Movie! </router-link>  -->
            <a href="http://localhost:8080/login"><img class = "logicon" src="../assets/loginicon.png" alt="logicon"> </a>
            
        </header>
        <meta charset="UTF-8">
            <p class = "title" >Welcome to DateFlix and Chill &#128521;</p>
        <navigate />
          <div class = "hover">
                <a><img class = "cantdecide" src="https://i.imgur.com/Ej2G4i1.png" alt="cantdecide"> </a><br>
                <a href="http://localhost:8080/register"><h2 class = "signup" ><span> Sign Up Here</span> </h2></a> 
          </div><br>

 
    <div id="description">

    <h2>About Dateflix and Chill</h2><br>
    <p>In April 2023, six Tech Elevator Programmers were tired of 
      bad movie recommendations that did not align with their interest.
      Together they brainstromed and created an app that comes up with the best
      movie to watch based on your personal preference and mood when trying to find
      the perfect title to watch for date night. Our app follows a tinder-style 
      format of clicking right or left on a movie if you’ve seen it, and you rate how you felt about 
      it the app would suggest movies based off of your swipes. 
    </p>
 
   </div>
    <!-- <movie-form/> -->
    </body>
   <br>
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
  background-color: #231b52;
  margin: 0px;
  padding: 0px;
}
.title {
  font-family: "Chewy";
  font-size: 40px;
  color: white;
  text-align: center;
  padding-bottom: 20px;
  text-shadow: 4px 3px #19181a;
}
.cantdecide {
  display: block;
  margin-left: auto;
  margin-right: auto;
  height:35px;
  padding-top: 10px;
}
a:visited {
  color:thistle;
}

#description{
  color: rgb(17, 17, 17);
  background-color: #AC8AD3;
  border: 9px solid rgb(231, 223, 240);
  padding: 12px;
  margin: 10px;
  font-family: "Chewy";
  border-radius: 10px;
  text-align: center;
  display: block;
  margin-left: 80px;
  margin-right: 80px;
  font-size: 15px;
}
.bordercine {
  height: 25px;
  width: 2000px;
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
    border:4px solid #CCC;
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