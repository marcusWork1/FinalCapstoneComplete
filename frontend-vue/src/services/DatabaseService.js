  import axios from 'axios';

  const httpLocalHost = axios.create({
    baseURL: "http://localhost:9000",
  });

  export default {
  postToLocalHost9000 (movieObject) {
    //http://localhost:9000/movie
    //this posts a new movie to our database
      return httpLocalHost.post('/movie', movieObject);
  },
  addProfile(profileObject) {
    return httpLocalHost.post('/account', profileObject);
  },
  updateProfile(profileObject2) {
    return httpLocalHost.put(`/account/${profileObject2.user_id}`, profileObject2)
  },
  postFavorite(favoriteObject) {
    return httpLocalHost.post(`/favorite`, favoriteObject);
  }
  // getAccount(accountObject) {
  //   return httpLocalHost.get(`account/${accountObject.user_id}`, accountObject)
  // }
}