<template>
 <div id="login">
   <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Chewy">
   <div class = "background">
      <form class = "signinform" @submit.prevent="login">
        <header>
          <a href="http://localhost:8080/"><img class = "imgicon" src="../assets/webicon.png" alt="webicon"/> </a>
          <a href="http://localhost:8080/description"><img class = "descicon" src="https://i.imgur.com/ZfFZoTz.jpg" alt="descicon"/> </a>
          <a href="#"><img class = "contacticon" src="../assets/contacticon.jpg" alt="contacticon"/> </a>
          <a href="http://localhost:8080/addmovie"><img class = "movieicon" src="https://i.imgur.com/6tEu04Z.jpg" alt="movieicon"/> </a>
          <a href="http://localhost:8080/login"><img class = "logicon" src="../assets/loginicon.png" alt="logicon"> </a>
        </header>
            <h1 >Please Sign In</h1>
              <img class = "walle" src = "https://i.imgur.com/fPA6ZJC.jpg">
                    <div role="alert" v-if="invalidCredentials">
                          Invalid username and password!
                    </div>
                    <div role="alert" v-if="this.$route.query.registration">
                          Thank you for registering, please sign in.
                    </div>
              <div class="form-input-group"><br>
                    <label for="username">Username</label><br>
                    <input type="text" id="username" v-model="user.username" required autofocus />
              </div><br>
              <div class="form-input-group">
                    <label for="password">Password</label><br>
                    <input type="password" id="password" v-model="user.password" required />
              </div>
              <div class = "buttons">
                    <button type="submit">Sign in</button>
                    <p class = "textcolor"><br>
                    <p><b><a class = "signuplink" href="http://localhost:8080/register">Need an Account? Sign up here.</a></b></p> 
              </div><br><br><br><br><br><br><br><br><br><br><br><br><br>
               
                <footer>
                    <p>® DateFlix and Chill<br>
                    <a href="http://localhost:8080/description">More about our company here :)</a></p>
                </footer>
      </form>
      
          </div>
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
footer {
  font-family: "Chewy";
  padding-left: 15px;
  padding-bottom: 15px;
  color: #AC8AD3;
}
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
header {
  background-color: #231b52;
}
.walle {
  height: 90px;
  display: block;
  max-height: 100%;
  max-width: 100%;
  margin-right: auto;
  margin-left: auto;
  padding-top: 10px;
}
.signinform {
  background-color: #231b52;
  font-family: "Chewy";
  color: white;
  display:block;
  padding: 0px;
}
.body {
  background-color: #231b52;
}
.form-input-group {
  margin-bottom: 1rem;
  background-color: #231b52;
  margin: 0;
}
label {
  margin-right: 0.5rem;
    background-color: #231b52;
}
.div {
  background-color: #140180;
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
.imgicon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
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
.logicon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
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
.descicon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
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
.contacticon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
.movieicon {
  width: auto;
  height: 85px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-bottom: 10px;
  margin-left: 20px;
  margin-top: 10px;
}
.movieicon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>