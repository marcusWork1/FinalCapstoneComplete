<template>

 <div id="login">
    <form @submit.prevent="login">
                             <header>
            <a href="http://localhost:8080/"><img class = "imgicon" src="https://i.imgur.com/8wIaQDQ.png" alt="webicon"/> </a>
            <a href="http://localhost:8080/description"><img class = "descicon" src="https://i.imgur.com/ZfFZoTz.jpg" alt="descicon"/> </a> 
            <a href="#"><img class = "contacticon" src="https://i.imgur.com/WtWooFI.jpg" alt="contacticon"/> </a> 
            <a href="http://localhost:8080/login"><img class = "logicon" src="https://i.imgur.com/kSKskRm.png" alt="logicon"> </a>
        </header>
      <h1 >Please Sign In</h1>
      <div role="alert" v-if="invalidCredentials">
        Invalid username and password!
      </div>
      <div role="alert" v-if="this.$route.query.registration">
        Thank you for registering, please sign in.
      </div>
      <div class="form-input-group">
        <label for="username">Username</label>
        <input type="text" id="username" v-model="user.username" required autofocus />
      </div>
      <div class="form-input-group">
        <label for="password">Password</label>
        <input type="password" id="password" v-model="user.password" required />
      </div>
      <button type="submit">Sign in</button>
      <p>
      <router-link :to="{ name: 'register' }">Need an account? Sign up.</router-link></p>
    </form>
  </div>
  
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {
  },
  data() {
    return {
      user: {
        username: "",
        password: ""
      },
      invalidCredentials: false
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then(response => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/");
          }
        })
        .catch(error => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    }
  }
};
</script>

<style scoped>

.body {
  background-color: #140180;
}
.form-input-group {
  margin-bottom: 1rem;
}
label {
  margin-right: 0.5rem;
}

.div {
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
  height: 85px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-left: 10px;
  margin-top: 10px;
  margin-bottom: 10px;
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

.descicon {
  width: auto;
  height: 85px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-bottom: 10px;
  margin-left: 20px;
  margin-top: 10px;
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
</style>