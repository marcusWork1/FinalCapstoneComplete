<template>
  <div class = "bodyimage">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Yanone+Kaffeesatz&display=swap" rel="stylesheet">
    <div >
      <header>
        <router-link v-bind:to="{ name: 'home' }"
          ><img class="imgicon" src="https://i.imgur.com/LajHZNM.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'description' }"
          ><img class="descicon" src="https://i.imgur.com/SEaHA1C.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'logout' }"
          ><img class="logouticon" src="https://i.imgur.com/IVGcyIo.jpg" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'login' }"
          ><img class="logicon" src="https://i.imgur.com/LCzEoo0.png" /></router-link
        >&nbsp;
        <router-link v-bind:to="{ name: 'contactus' }"><img class="contacticon" src="https://i.imgur.com/ORWfoJL.png" /></router-link
        >&nbsp;
     
      </header>
            <img class="bannerimage" src="https://i.imgur.com/8QDiBww.jpg" />
      <form class="signinform" @submit.prevent="login">
        <div role="alert" v-if="invalidCredentials">
          Invalid username and password!
        </div><br>
        <div role="alert" v-if="this.$route.query.registration">
          Thank you for registering, please sign in.
        </div>
        <div class="form-input-group">
          <br /><br>
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
              ><br><a class="signuplink" href="http://localhost:8080/register"
                >Need an Account? Sign up here.</a
              ></b
            >
          </p>
        </div>

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
                                            
                                               if (this.$store.state.user.username === "admin") {
                                                this.$router.push("/addmovie");
                                              } else if (this.$store.state.account === "") {
                                                                                    this.$router.push("/profile");
                                              }
        })
        .catch((error) => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
}) 
this.$router.push("/");
        });
// see if have account
// if dont, go to profile page

    },
  },
};
</script>

<style scoped>


</style>
