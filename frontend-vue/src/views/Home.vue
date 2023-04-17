<template>
  <div class="home">
    <h1>Dateflix and Chill</h1>
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

    <h2><router-link to =/login> Login or Sign Up Here! </router-link></h2>
  </div>
</template>

<script>

export default {
  name: "home"
};
</script>
