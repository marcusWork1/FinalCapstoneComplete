  import axios from 'axios';

  const httpLocalHost = axios.create({
    baseURL: "http://localhost:9000",
  });

  export default {
  postToLocalHost9000 (movieObject) {
    //http://localhost:9000/movie
      return httpLocalHost.post('/movie', movieObject);
  },
}