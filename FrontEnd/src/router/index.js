import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Dashboard from '../views/Dashboard.vue'
import Profile from '../views/Profile.vue'
import Book from '../views/Book.vue'
import Login from '../views/Login.vue'
import signUp from '../views/signUp.vue'

const routes = [
  { 
    path: '/', 
    name: 'Home',
    component: Home,
    meta: { requiresAuth: true}
   },

  { 
    path: '/dashboard', 
    component: Dashboard 
  },

  { 
    path: '/profile', 
    component: Profile
  },

  { path: '/book', 
    component: Book
  },

  { path: '/login',
    name: 'login',
    component: Login
  },

  {
    path: '/signup',
    name: 'signup',
    component: signUp
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})


router.beforeEach((to,from,next) =>{
  const isAuthenticated = !!localStorage.getItem('user')

  if(to.meta.requiresAuth && !isAuthenticated){
    next('/login')
  }
  else if(to.path=== '/login' && isAuthenticated){
    next('/')
  }
  else {
    next()
  }
})

export default router


