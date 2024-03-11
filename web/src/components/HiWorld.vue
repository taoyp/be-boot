<template>
  <div class="hello">
    <h1>{{ hiMessage }}</h1>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data() {
    return {
      hiMessage: "hiMessage"
    }
  },
  created() {
    this.getHiMessage();
  },
  methods: {
    getHiMessage() {
      this.$http.get('/api/hi')
          .then(res => {
            console.log("response")
            console.log(res);
            this.hiMessage = res.data;
          })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
