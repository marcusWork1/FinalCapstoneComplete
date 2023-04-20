<template>
    <div>
           <header>
            <a href="http://localhost:8080/"><img class = "imgicon" src="https://i.imgur.com/8wIaQDQ.png" alt="webicon"/> </a>
            <a href="#"><img class = "contacticon" src="https://i.imgur.com/WtWooFI.jpg" alt="contacticon"/> </a> 
            <a href="http://localhost:8080/addmovie"><img class = "movieicon" src="https://i.imgur.com/6tEu04Z.jpg" alt="movieicon"/> </a>
            <a href="http://localhost:8080/login"><img class = "logicon" src="https://i.imgur.com/kSKskRm.png" alt="logicon"> </a>
        </header> 
    
    
    <div class= "description">

        <h1>Dateflix and Chill App Description</h1><br>
        <img class = "walle" src = "https://i.imgur.com/fPA6ZJC.jpg">
        <div class = "info">
                    <h2>About Dateflix and Chill</h2>
                        <p>Welcome to DateFlix, the app that helps you find the perfect movie match! With DateFlix, you can swipe 
                          through a variety of movies to discover new titles and find ones that fit your interests. 
                          Whether you're looking for something romantic, thrilling, funny, or thought-provoking, DateFlix has 
                          something for everyone.</p>

                        <p>Our app uses a smart algorithm that takes into account your preferences, viewing history, and 
                            ratings to match you with movies you're likely to enjoy. Just swipe right on movies you like, and swipe left on those you're 
                            not interested in. You can also save movies to your Watchlist to come back to later.</p>

                        <p>But DateFlix is more than just a movie recommendation app. It's a community of movie lovers who are passionate about finding great films and sharing them with others. 
                          Connect with like-minded users, see what movies they've enjoyed, and get inspired by their picks.
                          So why not give DateFlix a try and find your perfect movie match today? Swipe right to movies you'll love, 
                          and left to those you'll pass on. With DateFlix, every night can be a movie night!</p>
        </div><br><br>
    </div>
    </div>
</template>

<script>

export default {
    name: "description",
    components : {}
};
</script>

<style scoped>
.walle {
  height: 90px;
}
.info {
  display: block;
}
.description {
  background-color: #231b52;
  color: white;
  font-family: "Chewy";
  padding: 0px;
  text-align: center;
  float: left;
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

.contacticon {
  width: auto;
  height: 85px;
  border-radius: 25px;
  box-shadow: 0px 7px 8px black;
  margin-bottom: 10px;
  margin-left: 20px;
  margin-top: 10px;
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
</style>