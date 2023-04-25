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
    <h1>Contact Us</h1>
    <p>
      Have any specific questions or concerns? Contact us or email us and we
      promise to get back to you as quick as possible.
    </p>
    <div class="customer-service-section">
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

<style>
h1 {
  color: rgb(12, 12, 12);
  font-family: "Chewy";
  text-align: center;
}
h2 {
  color: #231b52;
  font-size: 23px;
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
</style>
