# LambdaTest
jdk1.8的配置以及lambda表达式的基本使用，其他使用方法可以参考csdn文档
## jdk1.8配置 project的builde.gradle下添加
// lambda表达式
- classpath 'me.tatarka:gradle-retrolambda:3.2.5'
## app的build.gradle下配置
- apply plugin: 'me.tatarka.retrolambda'
## 配置jdk1.8
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
