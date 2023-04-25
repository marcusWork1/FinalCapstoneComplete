<template>
  <div></div>
</template>

<script>
import DatabaseService from '../services/DatabaseService';
export default {



methods: {
    getFavoriteMovie() {
      const favMovie = {
         account_id: this.$store.state.account.account_id,
          movie_id: this.movie.id,
          title: this.movie.original_title,
      };
    DatabaseService.getFavorite(favMovie)
    }

},
}
     

</script>

<style>
</style>