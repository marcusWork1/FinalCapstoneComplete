<template>
  <div class = "bodyimage">
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css?family=Chewy"
    />
    <div class="background">
      <form class="signinform" @submit.prevent="login">
        <header>
          <router-link v-bind:to="{ name: 'home' }"
            ><img class="imgicon" src="https://i.imgur.com/LajHZNM.png" /></router-link
          >&nbsp;
          <router-link v-bind:to="{ name: 'description' }"
            ><img class="descicon" src="../assets/descicon.jpg" /></router-link
          >&nbsp;
          <router-link v-bind:to="{ name: 'addmovie' }"
            ><img
              class="movieicon"
              src="../assets/movieicon.jpg" /></router-link
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
        </header>
        <h1>Please Sign In</h1>
        <img class="walle" src="https://i.imgur.com/ssZGent.png" />
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

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: "",
      },
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
            this.$router.push("/");
          }
        })
        .catch((error) => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    },
  },
};
</script>

<style>
.signuplink {
  color: rgb(222, 184, 243);
  font-size: 25px;
}
.buttons {
  padding-top: 10px;
  text-align: center;
}
h1 {
  text-align: center;
}
.form-input-group {
  text-align: center;
  padding-top: 10px;
  font-size: 25px;
}

.walle {
  height: 200px;
  display: block;
  max-height: 100%;
  max-width: 100%;
  margin-right: auto;
  margin-left: auto;
  padding-top: 10px;
}
.signinform {

  color: white;
  display: block;
  padding: 0px;
}
.body {

}
.form-input-group {
  margin-bottom: 1rem;
  margin: 0;
}
label {
  margin-right: 0.5rem;
}

</style>
