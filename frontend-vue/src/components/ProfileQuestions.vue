<template>
 <!-- should there just be a profile icon next to login??--->
  <div>
        <header>
            <a href="http://localhost:8080/"><img class = "imgicon" src="https://i.imgur.com/8wIaQDQ.png" alt="webicon"/> </a>
        </header>
    <h2>Tell us your Movie style!</h2>
    <form @submit.prevent="submitForm">
      <div class="form-group">
      <label for="email">Please input your email address: </label>
      <input id="email" type="text" v-model="newForm.email" />
    </div>
    <div class="form-group">
      <label for="genre">What is your favorite movie genre?: </label>
      <input id="genre" type="dropdown" v-model="newForm.genre" />
    </div>
    <div class="form-group">
      <label for="adult">Adult Only?: </label>
      <input id="adult" type="radio" value= true v-model="newForm.adult" />
    </div>
    <div class="form-group">
      <label for="popularity"> Minimum rating preference?: </label>
      <input id="popularity" type="number" v-model="newForm.popularity" />
    </div>
      <button type="submit">Submit</button>
      <button type="button"> @click="cancelForm" Cancel Form</button>
    </form>
  </div>
</template>

<script>
import DatabaseService from "../services/DatabaseService";

export default {
    name: 'account-form',
  data() {
    return {
      profile: {
        email_address: '',
        genre: '',
        adult_only: false,
        popularity: '',
      },
    };
  },
  methods: {
    submitForm() {
        const newForm = {
            email_address: this.newForm.email_address,
            genre: this.newForm.genre,
            adult_only: this.newForm.adult_only,
            popularity: this.newForm.popularity
        };
        if (this.email_address === null) {
            //add
            DatabaseService
            .addProfile(newForm)
            .then(response => {
                if (response.status === 201) {this.resetForm()}
             } )
             .catch(error => {
                 this.handleErrorResponse(error, "adding");
             });
        } else {
            // update
        newForm.email_address = this.newForm.email_address;
        newForm.genre = this.newForm.genre;
        newForm.adult_only = this.newForm.adult_only;
        newForm.popularity = this.newForm.popularity;
        DatabaseService
        .updateProfile(newForm)
        .then(response => {
            if(response.status === 200) {this.resetForm()}
         })
         .catch(error => {
                 this.handleErrorResponse(error, "adding");
             });
        }
    },
    resetForm() {
        this.newForm = {};
    },
    cancelForm () {
      this.newForm = {}; //sets the newProfile array to empty
      this.$router.push('/'); //sends user back to the homepage
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


</style>