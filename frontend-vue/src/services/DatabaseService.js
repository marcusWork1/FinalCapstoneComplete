import axios from "axios";

const httpLocalHost = axios.create({
  baseURL: "http://localhost:9000",
});

export default {
  postToLocalHost9000(movieObject) {
    //http://localhost:9000/movie
    //this posts a new movie to our database
    return httpLocalHost.post("/movie", movieObject);
  },
  addProfile(profileObject) {
    return httpLocalHost.post("/account", profileObject);
  },
  updateProfile(profileObject2) {
    return httpLocalHost.put(
      `/account/${profileObject2.user_id}`,
      profileObject2
    );
  },
  postFavorite(favoriteObject) {
    return httpLocalHost.post(`/favorite_list`, favoriteObject);
  },
  // getAccount(accountObject) {
  //   return httpLocalHost.get(`account/${accountObject.user_id}`, accountObject)
  // }
  getAllFavorites(profileObject3){
        return httpLocalHost.get(`/favorite_list/${profileObject3.account.account_id}`); // sending account object.account_id in order to get all movie_id related to that account
  },
  deleteFavorite(favoriteObject) {
    return httpLocalHost.delete(`/favorite_list/${favoriteObject}`) // sending back a whole favorite object becuase need to send back a movie_id and account_id to delete a movie_id
  },
  getAccount(profileObject2) {
    return httpLocalHost.get(`/account/user/${profileObject2}`) 
  }

}
