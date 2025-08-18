<template>

  <header class="head">

    <div class="menu">
      <button class="menu-cover"></button>
      <img src="/menu-logo.png" alt="" class="menu-button"></img>
    </div>


    <div class="left-links">
      <a href="" class="about">About</a>
      <a href="" class="schedules">Schedules</a>
    </div>

    <img src="/campus-logo.png" alt="" class="main-logo">

    <div class="right-links">
      <a href="" class="dashboard">Dashboard</a>
      <a href="" class="help">Help/Faq</a>
    </div>

    <div class="profile">
      <button class="profile-cover"></button>
      <img src="/profile-logo.png" alt="" class="profile-button"></img>
    </div>


  </header>

</template>


<script>

</script>

<style>
html,
body {
  background-color: #319AC4;
}

.head {
  display: flex;
  padding: 15px 30px;
  align-items: center;
  justify-content: space-between;
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 140px;
  background: linear-gradient(to bottom, black, transparent);
  z-index: 1000;
  box-sizing: border-box;
  gap: 50px;
  color: white;
}

.right-links {
  display: flex;
  gap: 80px;
}

.dashboard {
  text-decoration: none;
  color: white;
}

.help {
  text-decoration: none;
  color: white;
}

.left-links {
  display: flex;
  gap: 80px;
}

.about {
  text-decoration: none;
  color: white;
}

.schedules {
  text-decoration: none;
  color: white;
}

.menu {
  position: relative;
  display: inline-block;
}

.profile {
  position: relative;
  display: inline-block;
}

.menu-cover {
  width: 50px;
  height: 50px;
  border-radius: 50px;
  margin-left: 50px;
}

.profile-cover {
  width: 50px;
  height: 50px;
  border-radius: 50px;
  margin-right: 110px;
}

.main-logo {
  width: 400px;
  height: 90px;
}

.menu-button {
  position: absolute;
  width: 35px;
  height: 35px;
  margin-left: -42px;
  margin-top: 7px;
}

.profile-button {
  position: absolute;
  width: 35px;
  height: 35px;
  margin-top: 7px;
  margin-left: -152px;
}

.menu-cover:hover {
  width: 100px;
  transition: ease-in-out 0.4s;
  cursor: pointer;
}
</style>
