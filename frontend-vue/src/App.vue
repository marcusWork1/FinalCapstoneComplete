<template>
  <div id="app">
    <div id="nav">
      <router-link v-bind:to="{ name: 'home' }"></router-link>&nbsp;&nbsp;
      <router-link v-bind:to="{ name: 'description' }"></router-link>&nbsp;&nbsp;
      <router-link v-bind:to="{ name: 'login' }"></router-link>&nbsp;&nbsp;
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
      <router-link v-bind:to="{ name: 'profile' }"></router-link>&nbsp;&nbsp;
    </div>
    <router-view />
  </div>
</template>

<style scoped>
.app {
  background-color: #140180;
}

.nav {
  background-color: #140180;
}
</style>
