# vue_test笔记：

###一、安装
```
npm install
```

### 二、启动项目
```
npm run serve
```

### 三、打包
```
npm run build
```

### 四、语法检查
```
npm run lint
```

### 五、自定义配置
```
See [配置参考](https://cli.vuejs.org/config/).
```
### 六、ref属性
```
    1、被用来给元素或子组件注册引用信息（id得替代者）
    2、应用在html标签上获取的是真实DOM元素，应用在组件标签上是组件实例对象（vc）
    3、使用方式：
        （1）打标识：<h1 ref="xxx">......</h1> 或 <School ref="xxx"/>
        （2）获取：this.$refs.xxx
```
### 七、配置项props
```
    功能：让组件接收外部传过来的数据
        （1）传递数据：
            <School name="科城" :age="100" />     #age前加冒号是动态绑定让它识别数字

        （2）接收数据：
            第一种方式（只接收）：
                props:['name']

            第二种方式（限制类型）：
                props:{
                    name:String,
                    age:Number
                }

            第三种方式（限类型、限必要条件、指定默认值）
                props:{
                    name:{
                        type:String,
                        required:true,
                        default:'本科学校'
                    }
                    age:{
                        type:Number,
                        required:false
                    }
                }
    备注：props是只读的，Vue底层会监测你对props的修改，如果进行了修改，就会发出警告，
        若业务需求确实需要修改，那么请复制props的内容道data中一份，然后去修改data中的数据。
```

### 八、mixin(混入、混合)
```
    功能：可以把多个组件共用的配置提取成一个混入对象
    使用方式：
        第一步定义混合，例如：
            {
                data(){...},
                methods:{...}
            }
        第二部使用混合，例如：
          （1）全局混入：Vue.mixin(xxx)
          （2）局部混入：mixin:['xxx']
```
### 九、插件
```
    功能：用于增强Vue
    本质：包含install方法的一个对象，install的第一个参数是Vue，第二个参数是插件使用者传递的数据
    定义插件：
        export default {
            //1、添加全局过滤器
                Vue.filter(...)
            //2、添加全局指令
            Vue.directive(...)
            //3、配置全局混入
            Vue.mixin(...)
            //4、添加实例方法
            Vue.prototype.$myMethod = function(){...}
        }
    导入插件：import plugins from "./plugins";
    使用插件：Vue.use(plugins)
```


