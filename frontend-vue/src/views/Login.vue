<template>
  <div class = "bodyimage">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Yanone+Kaffeesatz&display=swap" rel="stylesheet">
    <div class="background">
      <form class="signinform" @submit.prevent="login">
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
        <router-link v-bind:to="{ name: 'browse' }"
        ><img class="browseicon" src="https://i.imgur.com/NFVyR0z.png" /></router-link>
        <router-link v-bind:to="{ name: 'contactus' }"><img class="contacticon" src="https://i.imgur.com/ORWfoJL.png" /></router-link
        >&nbsp;
      <router-link v-bind:to="{ name: 'favoritemovies'}"
        ><img class="favoriteicon" src="https://i.imgur.com/W6WfGod.png" /></router-link>
      </header>
        <h1>Please Sign In</h1>
        
        <div role="alert" v-if="invalidCredentials">
          Invalid username and password!
        </div>
        <div role="alert" v-if="this.$route.query.registration">
          Thank you for registering, please sign in.
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
        <div class="buttons">
          <button type="submit">Sign in</button>
          <p class="textcolor"><br /></p>
          <p>
            <b
              ><a class="signuplink" href="http://localhost:8080/register"
                >Need an Account? Sign up here.</a
              ></b
            >
          </p>
        </div>
        <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />

        <footer>
          <p>
            ® Flick Finder<br />
            <a href="http://localhost:8080/description"
              >More about our company here :)</a
            >
          </p>
        </footer>
      </form>
    </div>
  </div>
</template>

<script>
import authService from "../services/AuthService";
import DatabaseService from "../services/DatabaseService";
export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: "",
      },
      userId: 0,
      invalidCredentials: false,
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then((response) => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.userId = response.data.user.id;
            //this.$router.push("/");
          }
         console.log(this.userId);
          DatabaseService.getAccount(this.$store.state.user.id)
                          .then((response) => {
                                              this.$store.commit("SET_ACCOUNT", response.data);
                                              //console.log(this.$store.state.user.id)
                                              //if (this.$store.state.account === "undefined") {
                                              if (this.$store.state.account === "") {
                                                                                    this.$router.push("/profile");
                                              }
        })
        .catch((error) => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }

}) 
this.$router.push("/browse");
        });
// see if have account
// if dont, go to profile page



    },


  },
};
</script>

<style>


</style>
