import Vue from "vue";
import Router from "vue-router";
import Home from "../views/Home.vue";
import Login from "../views/Login.vue";
import Logout from "../views/Logout.vue";
import Register from "../views/Register.vue";
import AddMovie from "../views/AddMovie";
import Description from "../views/Description.vue";
import store from "../store/index";
import Profile from "../views/Profile.vue";
import ContactUs from "../views/ContactUs.vue";
import BrowseMoviesList from "../views/BrowseMoviesList.vue";
import FavoriteMovies from "../views/FavoriteMovies.vue";

Vue.use(Router);

/**
 * The Vue Router is used to "direct" the browser to render a specific view component
 * inside of App.vue depending on the URL.
 *
 * It also is used to detect whether or not a route requires the user to have first authenticated.
 * If the user has not yet authenticated (and needs to) they are redirected to /login
 * If they have (or don't need to) they're allowed to go about their way.
 */

const router = new Router({
  mode: "history",
  base: process.env.BASE_URL,
  routes: [
    {
      path: "/",
      name: "home",
      component: Home,
      meta: {
        requiresAuth: false,
      },
    },
    {
      path: "/login",
      name: "login",
      component: Login,
      meta: {
        requiresAuth: false,
      },
    },
    {
      path: "/logout",
      name: "logout",
      component: Logout,
      meta: {
        requiresAuth: false,
      },
    },
    {
      path: "/register",
      name: "register",
      component: Register,
      meta: {
        requiresAuth: false,
      },
    },
    {
      path: "/addmovie",
      name: "addmovie",
      component: AddMovie,
      meta: {
        requiresAuth: true,
      },
    },
    {
      path: "/description",
      name: "description",
      component: Description,
      meta: {
        requiresAuth: false,
      },
    },
    {
      path: "/profile",
      name: "profile",
      component: Profile,
      meta: {
        requiresAuth: false,
      },
    },
    {
      path: "/contactus",
      name: "contactus",
      component: ContactUs,
      meta: {
        requiresAuth: false,
      },
    },
    {
      path: "/browse",
      name: "browse",
      component: BrowseMoviesList,
      meta: {
        requiresAuth: false,
      },
    },
    {
      path: "/favoritemovies",
      name: "favoritemovies",
      component: FavoriteMovies,
      meta: {
        requiresAuth: false,
      },
    },
  ],
});

router.beforeEach((to, from, next) => {
  // Determine if the route requires Authentication
  const requiresAuth = to.matched.some((x) => x.meta.requiresAuth);

  // If it does and they are not logged in, send the user to "/login"
  if (requiresAuth && store.state.token === "") {
    next("/login");
  } else {
    // Else let them go to their next destination
    next();
  }
});

export default router;
