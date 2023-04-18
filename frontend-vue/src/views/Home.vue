<template>
  <div class="home">
    <body id = "body">
            <header>
            <a href="http://localhost:8080/"><img class = "imgicon" src="https://i.imgur.com/8wIaQDQ.png" alt="webicon"/> </a>
            <a href="#"><img class = "descicon" src="https://i.imgur.com/ZfFZoTz.jpg" alt="descicon"/> </a> 
            <a href="#"><img class = "contacticon" src="https://i.imgur.com/WtWooFI.jpg" alt="contacticon"/> </a> 
            <a href="http://localhost:8080/login"><img class = "logicon" src="https://i.imgur.com/kSKskRm.png" alt="logicon"> </a>
        </header>
    <navigate />
 
    <div>
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
    <movie-form/>
    </body>
     
  </div>
  
</template>

<script>
//import { component } from 'vue/types/umd';
import Navigate from '../components/Navigate.vue';
import MovieForm from '../components/MovieForm.vue';

export default {
  name: "home",
  components: {
    Navigate,
    MovieForm
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

.h1 {
  font-family: 'Brush Script MT', cursive;
}

.image {
  height: 100%;
}
.imgicon {
  width: auto;
  height: 100px;
  /* border: 16px solid;
  border-color:#140180; */
/*   padding-left: 10px;
  padding-top: 10px;
  padding-bottom: 8px; */
 /* border-bottom-width: 10px; */
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-left: 10px;
  margin-top: 10px;
  margin-bottom: 10px;
}

.logicon {
  width: auto;
  height: 100px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-bottom: 10px;
  float: right;
  margin-right: 10px;
  margin-top: 10px;
}

.descicon {
  width: auto;
  height: 100px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-bottom: 10px;
  margin-left: 20px;
  margin-top: 10px;
}

.contacticon {
  width: auto;
  height: 100px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-bottom: 10px;
  margin-left: 20px;
  margin-top: 10px;
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