<template>
    <div>
        <header>
            <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Chewy">
            <a href="http://localhost:8080/"><img class = "imgicon" src="../assets/webicon.png" alt="webicon"/> </a>
            <a href="http://localhost:8080/description"><img class = "descicon" src="https://i.imgur.com/ZfFZoTz.jpg" alt="descicon"/> </a>
            <a href="#"><img class = "contacticon" src="../assets/contacticon.jpg" alt="contacticon"/> </a>
            <a href="http://localhost:8080/addmovie"><img class = "movieicon" src="https://i.imgur.com/6tEu04Z.jpg" alt="movieicon"/> </a>
            <a href="http://localhost:8080/login"><img class = "logicon" src="../assets/loginicon.png" alt="logicon"> </a>
        </header>
        <div>
                <img class = "walle" src = "https://i.imgur.com/fPA6ZJC.jpg">
      
        <movie-form />
          </div>
    </div>
</template>

<script>
import MovieForm from "../components/MovieForm.vue";

export default {
    components : {
        MovieForm
    }
};
</script>

<style scoped>
.walle {
  height: 90px;
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