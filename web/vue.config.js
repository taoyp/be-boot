const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    //配置http-proxy代理方式跨域
    proxy: {
      "/api": {
        // 往哪个服务器发送请求
        target: "http://localhost:8080",
        // ^代表字符串开头，实际发送请求时，会把请求开头的/demo删除
        // /demo并不是请求的一部分，只是个代理的标识
        pathRewrite: {
          "^/api": ""
        }
      }
    }
  }
})
