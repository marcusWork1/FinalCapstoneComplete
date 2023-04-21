<template>
  <div>
    <form class="profile-questions" v-on:submit.prevent="submitForm">
      <h1>Create your profile!</h1>
      <p>This helps personalize your DateFlix and Chill experience</p>
      <div class="form-group">
        <label for="email_address">Please input your email address: </label>
        <input
          id="email_address"
          type="text"
          v-model="newProfile.email_address"
        />
      </div>
      <div class="form-group">
        <label for="genre">What is your favorite movie genre?: </label>
        <input id="genre" type="text" v-model="newProfile.genre" />
      </div>
      <div class="form-group">
        Adult Movie?
        <input
          id="Yes"
          type="radio"
          value="true"
          v-model="newProfile.adult_only"
        />
        <label for="Yes">Yes</label>

        <input
          id="No"
          type="radio"
          value="false"
          v-model="newProfile.adult_only"
        />
        <label for="No">No</label>
      </div>
      <div class="form-group">
        <label for="popularity">Minimum rating preference?: </label>
        <input id="popularity" type="number" v-model="newProfile.popularity" />
      </div>
      <button class="button">Submit</button>
      <button class="button" v-on:click="cancelForm">Cancel</button>
    </form>
  </div>
</template>

<script>
import DatabaseService from "../services/DatabaseService";

export default {
  name: "profile-questions", //account-form initialization
  data() {
    return {
      newProfile: {
        account_id: "",
        user_id: this.$store.state.user.id,
        username: this.$store.state.user.username,
        email_address: "",
        genre: "",
        adult_only: false,
        popularity: "",
      },
    };
  },
  methods: {
    submitForm() {
      const newForm = {
        user_id: this.newProfile.user_id,
        username: this.newProfile.username,
        email_address: this.newProfile.email_address,
        genre: this.newProfile.genre,
        adult_only: this.newProfile.adult_only,
        popularity: this.newProfile.popularity,
      };

      if (this.$store.state.account === "") {
        //add
        DatabaseService.addProfile(newForm)
          .then((response) => {
            if (response.status === 201) {
              //grab account id in datastore
              //call mutation
              this.$store.commit("SET_ACCOUNT", response.data); //controller creates an account and sends back an object. no name for object created, so we just collect data.
              this.resetForm();
            }
          })
          .catch((error) => {
            this.handleErrorResponse(error, "adding");
          });
      } else {
        //<<<<<might have to comment this out to check .addprofile
        //     // update
        DatabaseService.updateProfile(newForm)
          .then((response) => {
            if (
              response.status === 200 ||
              response.status === 201 ||
              response.status === 202
            ) {
              this.resetForm();
            }
          })
          .catch((error) => {
            this.handleErrorResponse(error, "adding");
          });
      }
    },
    resetForm() {
      this.newProfile = {
        account_id: 0,
        user_id: this.$store.state.user.id,
        username: this.$store.state.user.username,
        email_address: "",
        genre: "",
        adult_only: false,
        popularity: "",
      };
    },
    cancelForm() {
      this.newProfile = {}; //sets the newProfile array to empty
      this.$router.push("/"); //sends user back to the homepage
    },
    handleErrorResponse(error, verb) {
      if (error.response) {
        this.errorMsg =
          "Error " +
          verb +
          " profile. Response received was '" +
          error.response.statusText +
          "'.";
      } else if (error.request) {
        this.errorMsg =
          "Error " + verb + " profile. Server could not be reached.";
      } else {
        this.errorMsg =
          "Error " + verb + " profile. Request could not be created.";
      }
    },
  },
};
</script>

<style scoped>
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
.profile-questions {
  background-color: #bb9cdf;
  font-family: "Chewy", typeface;
  padding-left: 25px;
}
.button {
  display: inline-block;
  padding: 10px 20px;
  margin-bottom: 30px;
  font-size: 18px;
  cursor: pointer;
  text-align: center;
  font-family: "Chewy";
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #a049a3;
  border: none;
  border-radius: 15px;
  box-shadow: 0 7px rgb(59, 59, 59);
}

.button:hover {
  background-color: #5b1b6e;
}

.button:active {
  background-color: #8e3e8a;
  box-shadow: 0 5px rgb(61, 61, 61);
  transform: translateY(4px);
}
.cancel {
  display: inline-block;
  padding: 10px 20px;
  margin-bottom: 30px;
  font-size: 18px;
  cursor: pointer;
  text-align: center;
  font-family: "Chewy";
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #a398a3;
  border: none;
  border-radius: 15px;
  box-shadow: 0 7px rgb(59, 59, 59);
  margin-left: 15px;
  margin-top: 10px;
}

.cancel:hover {
  background-color: #362f38;
}

.cancel:active {
  background-color: #8e3e8a;
  box-shadow: 0 5px rgb(61, 61, 61);
  transform: translateY(4px);
}

.info {
  color: rgb(17, 17, 17);
  background-color: #ac8ad3;
  border: 9px solid rgb(231, 223, 240);
  padding: 80px;
  margin: 20px;
  font-family: "Chewy";
  border-radius: 10px;
  text-align: center;
  display: block;
  margin-left: 220px;
  margin-right: 220px;
  font-size: 20px;
}

.form-group {
  margin-top: 10px;
  margin-bottom: 10px;
}
</style>
