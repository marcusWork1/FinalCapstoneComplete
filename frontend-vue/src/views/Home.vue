<template>
  <div class="home">
            <header>
            <img class = "imgicon" src="https://i.imgur.com/8wIaQDQ.png" alt="webicon">
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
  </div>
</template>

<script>
//import { component } from 'vue/types/umd';
import Navigate from '../components/Navigate.vue';

export default {
  name: "home",
  components: {
    Navigate
  }
};
</script>

<style scoped>
.home {
  background-color: #140180;
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
  border: 16px solid;
  border-color:#140180;
  padding-top: 3px;
  border-bottom-width: 10px;
}
</style>