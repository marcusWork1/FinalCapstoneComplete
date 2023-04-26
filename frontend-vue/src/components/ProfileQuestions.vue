<template>
  <div>
    <form class="profile-questions" v-on:submit.prevent="submitForm">
      <br><br><h1>Create your profile!</h1><br>
      <h2>This helps personalize your Flick Finder experience</h2><br>
      <div class="form-group">
        <label for="email_address">Please input your email address: </label><br><br>
        <input
          id="email_address"
          type="text"
          v-model="newProfile.email_address"/>
      </div><br>
      <div class="form-group">
        <label for="genre"> Please select your favorite Genre: </label><br><br>
        <select v-model="newProfile.genre">
          <option value="">--- Select a Genre ---</option>
          <option value="29">Action</option>
          <option value="35">Comedy</option>
          <option value="18">Drama</option>
          <option value="27">Horror</option>
          <option value="10749">Romance</option>
        </select>
        <!-- <input id="genre" type="text" v-model="newProfile.genre" />-->
      </div><br>
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
        <br><label for="popularity">Minimum rating preference? 1-100: </label><br><br>
        <input id="popularity" type="number" v-model="newProfile.popularity" />
      </div>
      <button class="button">Submit</button>
      <button class="button" v-on:click="cancelForm">Cancel</button><br>
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
        user_id: this.$store.state.user.id,
        username: this.newProfile.username,
        email_address: this.newProfile.email_address,
        genre: this.newProfile.genre,
        adult_only: this.newProfile.adult_only,
        popularity: this.newProfile.popularity,
      };

DatabaseService.getAccount(this.$store.state.user.id)
.then((response) => {
  this.$store.commit("SET_ACCOUNT", response.data);
})
if (this.$store.state.account == "") {
      // console.log(DatabaseService.getAccount(this.$store.state.user.id));
      // if (DatabaseService.getAccount(this.newProfile.user_id) === "") {
        //add
        console.log("hit");
        DatabaseService.addProfile(newForm)
          .then((response) => {
            if (response.status === 201) {
              //grab account id in datastore
              //call mutation
              this.$store.commit("SET_ACCOUNT", response.data); //controller creates an account and sends back an object. no name for object created, so we just collect data.
              // this.$store.commit("SET_USER_GENRE", response.data)

              this.resetForm();
            }
          })
          .catch((error) => {
            this.handleErrorResponse(error, "adding");
          });
      } 
      else{
        //<<<<<might have to comment this out to check .addprofile
        //     // update
        // need a 
        DatabaseService.updateProfile(newForm)
          .then((response) => {
            if (
              response.status === 200 ||
              response.status === 201 ||
              response.status === 202
            ) {  
              this.$store.commit("SET_ACCOUNT", response.data);
              this.resetForm();
            }
          })
          .catch((error) => {
            this.handleErrorResponse(error, "adding");
          });
      }
this.$router.push('/browse');

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

<style>

</style>
