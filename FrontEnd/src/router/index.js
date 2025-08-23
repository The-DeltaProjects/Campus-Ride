import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Dashboard from '../views/Dashboard.vue'
import Profile from '../views/Profile.vue'
import Book from '../views/Book.vue'

const routes = [
  { path: '/', component: Home },
  { path: '/dashboard', component: Dashboard },
  { path: '/profile', component: Profile},
  { path: '/book', component: Book}
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router


