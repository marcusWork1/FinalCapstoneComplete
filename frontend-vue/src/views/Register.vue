<template>
  <div id="register" class="bodyimage">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Yanone+Kaffeesatz&display=swap" rel="stylesheet">
    <div>

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

      <img class = "bannerimage" src ="https://i.imgur.com/hbWDFT3.jpg">
       <form @submit.prevent="register">

        
        <div role="alert" v-if="registrationErrors">
          {{ registrationErrorMsg }}
        </div>
        <div class="form-input-group">
          <br />
          <label for="username">Username</label><br />
          <input
            type="text"
            id="username"
            v-model="user.username"
            required
            autofocus
          />
        </div>
        <br />
        <div class="form-input-group">
          <label for="password">Password</label><br />
          <input
            type="password"
            id="password"
            v-model="user.password"
            required
          />
        </div>
        <div class="form-input-group">
          <br />
          <label for="confirmPassword">Confirm Password</label><br />
          <input
            type="password"
            id="confirmPassword"
            v-model="user.confirmPassword"
            required
          />
        </div>
        <button type="submit">Create Account</button><br /><br />
        <a class="buttonedit" href="http://localhost:8080/login"
          >Already have an account? Log in.</a
        ><br /><br /><br /><br /><br /><br />
      </form>
    </div>
  </div>
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "register",
  data() {
    return {
      user: {
        username: "",
        password: "",
        confirmPassword: "",
        role: "user",
      },
      registrationErrors: false,
      registrationErrorMsg: "There were problems registering this user.",
    };
  },
  methods: {
    register() {
      if (this.user.password != this.user.confirmPassword) {
        this.registrationErrors = true;
        this.registrationErrorMsg = "Password & Confirm Password do not match.";
      } else {
        authService
          .register(this.user)
          .then((response) => {
            if (response.status == 201) {
              this.$router.push({
                path: "/login",
                query: { registration: "success" },
              });
            }
          })
          .catch((error) => {
            const response = error.response;
            this.registrationErrors = true;
            if (response.status === 400) {
              this.registrationErrorMsg = "Bad Request: Validation Errors";
            }
          });
      }
    },

    clearErrors() {
      this.registrationErrors = false;
      this.registrationErrorMsg = "There were problems registering this user.";
    },
  },
};
</script>

<style>

</style>
