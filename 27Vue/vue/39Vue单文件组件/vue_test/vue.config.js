module.exports = {
    devServer:{
        port: 8082,
    },
    pages: {
        index: {
            // entry for the page
            //entry: '02src--render、ref/main.js',
            //entry: '03src--props接收组件参数/main.js',
            //entry: '04src--mixin混合/main.js'
            //entry: '05src--plugins插件/main.js'
            //entry: '06src--scoped样式/main.js'
            //entry: '07src--TodoList案例/main.js'
            //entry : '09src--自定义组件事件/main.js'
            //entry:'10src--TodoList自定义事件/main.js'
            //entry:'11src--全局事件总线/main.js'
            //entry:'12src--TodoList全局事件总线/main.js'
            //entry:'13src--消息得订阅与发布/main.js'
            entry:'14src--TodoList消息的订阅与发布/main.js'
        },
    },
    lintOnSave:false //关闭语法检查
}
