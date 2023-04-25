<template>
  <div class="contactus">
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css?family=Chewy"
    />
    <header>
      <router-link v-bind:to="{ name: 'home' }">Back Home</router-link>&nbsp;
      <router-link v-bind:to="{ name: 'description' }">Description</router-link
      >&nbsp;
      <router-link v-bind:to="{ name: 'addmovie' }">Add Movie</router-link
      >&nbsp;
      <router-link v-bind:to="{ name: 'login' }">Login</router-link>&nbsp;|
      <router-link v-bind:to="{ name: 'profile' }">Profile</router-link>&nbsp;
      <router-link v-bind:to="{ name: 'browse' }">Browse</router-link>&nbsp;
      <router-link v-bind:to="{ name: 'contactus' }">Contact Us</router-link
      >&nbsp;
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
        <li><strong>Email:</strong> customerservice@dfchill.com</li>
        <li><strong>Phone:</strong> 1-800-123-4567</li>
      </ul>
    </div>
    <div class="suggestions-section">
      <h2>Suggestions or Ideas</h2>
      <p>
        Want to see something added or think our app can be improved in a
        particular area?
      </p>
      <ul>
        <li><strong>Email:</strong> suggestions@dfchill.com</li>
      </ul>
    </div>
    <div class="bug fix-section">
      <h2>Report App Issues or Bugs</h2>
      <p>
        Experiencing technical difficulties or breaks within the app? Submit a
        report to our technology team, screenshots and screen recordings
        encouraged.
      </p>
      <ul>
        <li><strong>Email:</strong> technology@dfchill.com</li>
      </ul>
    </div>
    <div class="ad-part-section">
      <h2>Advertisements/Partnerships</h2>
      <p>Want to partner with us or advertise on our site?</p>
      <ul>
        <li><strong>Email:</strong> marketing@dfchill.com</li>
        <li><strong>Phone:</strong> 1-800-234-5678</li>
      </ul>
    </div>
    <footer>
      <p>
        ® DateFlix and Chill<br />
        <a href="http://localhost:8080/description"
          >More about our company here :)</a
        >
      </p>
    </footer>
  </div>
</template>

<script>
export default {
  name: "ContactUs",
};
</script>

<style scoped>
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
.profileicon {
  width: 87px;
  height: 85px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-bottom: 10px;
  margin-left: 20px;
  margin-top: 10px;
}
.profileicon:active {
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
header {
  background-color: #231b52;
}
footer {
  font-family: "Chewy";
  padding-left: 15px;
  padding-bottom: 15px;
  color: #ac8ad3;
}
</style>
