# `java-in-action`

A beginner-friendly Java project that provides code examples covering fundamental concepts,
core features, and common use cases of the Java programming language.
This project helps beginners quickly grasp Java through hands-on examples and detailed annotations.

一个适合初学者的 Java 项目，提供涵盖 Java 编程语言的基本概念、核心功能和常见用例的代码示例。
该项目通过实际示例和详细注释帮助初学者快速掌握 Java。

## 1.`JDK` 环境搭建

### 1.下载

```http
https://www.oracle.com/java/technologies/downloads/
```



### 2.平台

> 由于在实际开发过程中可能回使用多版本的 `JDK` 。故对于安装路径，我们可以采用有规律的命名方式:
>
> - `windows`
>   - `D:\xxx\jdk\jdk8`
>   - `D:\xxx\jdk\jdk11`
>   - `D:\xxx\jdk\jdk17`
>   - …
> - `Linux`
>   - `/xxx/jdk/jdk8`
>   - `/xxx/jdk/jdk11`
>   - `/xxx/jdk/jdk17`
>   - …
> - `MacOS`
>   - ``

#### 2.1.`Windows`

```shell
# 1.配置环境变量
# JAVA_HOME=D:\xxx\jdk\jdk8
# |- $env.JAVA_HOME=D:\xxx\jdk\jdk8

# 早期版本
# ANT_HOME 不是必须的(仅仅是我本地有这个变量)
# CLASSPATH=.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;%ANT_HOME%\lib;

# 2.加入到 PATH
# %JAVA_HOME%\bin
```



#### 2.2.`Linux`

```shell

```



#### 2.3.`MacOS`



## 2.`Maven` 环境搭建

### 2.1.下载

> 选择合适的版本即可

```http
https://maven.apache.org/download.cgi
```

