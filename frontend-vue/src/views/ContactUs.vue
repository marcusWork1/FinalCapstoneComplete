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
        <!-- <router-link v-bind:to="{ name: 'addmovie' }"
          ><img class="movieicon" src="https://i.imgur.com/MixOVcC.png" /></router-link
        >&nbsp; -->
        <router-link v-bind:to="{ name: 'logout' }"
          ><img class="logouticon" src="https://i.imgur.com/IVGcyIo.jpg" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'login' }"
          ><img class="logicon" src="https://i.imgur.com/LCzEoo0.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'profile' }"
          ><img class="profileicon" src="https://i.imgur.com/lfIq5sT.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'browse' }"
        ><img class="browseicon" src="https://i.imgur.com/NFVyR0z.png" /></router-link>
        <router-link v-bind:to="{ name: 'contactus' }"><img class="contacticon" src="https://i.imgur.com/ORWfoJL.png" /></router-link
        >&nbsp;
      <router-link v-bind:to="{ name: 'favoritemovies'}"
        ><img class="favoriteicon" src="https://i.imgur.com/W6WfGod.png" /></router-link>
      </header>
    <img class = "bannerimage" src= "https://i.imgur.com/PLWqNpf.jpg">
    <p id = "description">
      Have any specific questions or concerns? Contact us or email us and we
      promise to get back to you as quick as possible.
    </p><br><br>
    <div id = "description">
      <h2>Customer Service</h2>
      <p>
        For any general inquiries or concerns, please contact our customer
        service team:
      </p>
      <ul>
        <li><strong>Email:</strong> hello@flickfinder.com</li>
        <li><strong>Phone:</strong> 1-800-123-4567</li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: "ContactUs",
};
</script>

<style scoped>
#description {
  margin-left: 455px;
  margin-right: 455px;
}
ul {
  list-style-type: none;
}
</style>
