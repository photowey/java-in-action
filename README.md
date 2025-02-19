# `java-in-action`

A beginner-friendly Java project that provides code examples covering fundamental concepts,
core features, and common use cases of the Java programming language.
This project helps beginners quickly grasp Java through hands-on examples and detailed annotations.

一个适合初学者的 `Java` 项目，提供涵盖 `Java` 编程语言的基本概念、核心功能和常见用例的代码示例。
该项目通过实际示例和详细注释帮助初学者快速掌握 `Java`。



## 1.`JDK`

[JDK 安装与环境搭建](./docs/java_install.md)

## 2.`Maven`

[Maven 安装与环境搭建](./docs/maven_install.md)

## 3.编辑器

> 首推 `IDEA`

### 3.1.下载

- 支持: 正版
- 推荐: 社区版
- 鼓励: 通过自己长期维护的开源项目去申请-正版 `License`

```http
https://www.jetbrains.com/idea/download/?section=windows
// 根据咱自己的电脑选择对应平台的安装包
```

![Intellij_IDEA](./docs/assets/Intellij_IDEA.png)

### 3.2.常用插件

- [Alibaba Java Coding Guidelines(XenoAmess TPM)](https://plugins.jetbrains.com/plugin/14109-alibaba-java-coding-guidelines-xenoamess-tpm-)
    - 编码规范
- [Atom Material Icons](https://plugins.jetbrains.com/plugin/10044-atom-material-icons)
    - `Icons`
        - 强烈推荐 - 可以通过肉眼直观的就能区分不同包
            - 比如:
                - `Controller`
                - `Service`
                - `Model`
                - …
- [CheckStyle-IDEA](https://plugins.jetbrains.com/plugin/1065-checkstyle-idea)
- [CamelCase](https://plugins.jetbrains.com/plugin/7160-camelcase)
    - 强烈推荐 - 驼峰转化
- [CMD Support](https://plugins.jetbrains.com/plugin/5834-cmd-support)
    - 可以直接运行脚本
- [CodeGlance Pro](https://plugins.jetbrains.com/plugin/18824-codeglance-pro)
    - 缩略图
- [GitToolBox](https://plugins.jetbrains.com/plugin/7499-gittoolbox)
    - `Git` 利器
- [GenerateAllSetter](https://plugins.jetbrains.com/plugin/9360-generateallsetter)
    - 自动生成 `Setter` 方法
- [GenerateSerialVersionUID](https://plugins.jetbrains.com/plugin/185-generateserialversionuid)
    - 生成序列化版本号
- [jclasslib](https://plugins.jetbrains.com/plugin/9248-jclasslib)
    - 查看字节码
- [Material Theme UI](https://plugins.jetbrains.com/plugin/8006-material-theme-ui)
    - 主题
- [Maven Dependency Helper](https://plugins.jetbrains.com/plugin/12041-maven-dependency-helper)
- [Maven Executor](https://plugins.jetbrains.com/plugin/11394-maven-executor)
    - …
    - Maven 相关的均可下载安装
- [Private Notes](https://plugins.jetbrains.com/plugin/17874-private-notes)
    - 源码注释利器
- [TONGYI Lingma](https://plugins.jetbrains.com/plugin/17809-tongyi-lingma--your-ai-coding-assistant-type-less-code-more-)
    - 任何一个 `AI` 助手均可
    - 代码提示: 强的 1 P



## 4.工程

### 4.1.`Maven` 工程

推荐: `Maven in action` 书籍

> 首推采用 `Spring` 提供的在线工具生成

```http
https://start.spring.io
```

![start_spring_io](./docs/assets/start_spring_io.png)

注意: 当没有 `JDK` 17+ 时, 工程下载下来并解压后,咱们可以修改一下 `pom.xml` 中  `parent` 节点的版本号

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <!-- 修改此处的 parent 版本号 -->
        <version>2.7.5</version>
    </parent>

    <groupId>io.github.photowey</groupId>
    <artifactId>java-in-action</artifactId>
    <version>1.0.0-SNAPSHOT</version>

    <!-- @formatter:off -->
    <properties>
        <java.version>1.8</java.version>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>

        <maven-compiler-plugin.version>3.8.1</maven-compiler-plugin.version>
        
        <!-- ... -->
    </properties>
    <!-- @formatter:on -->

    <!-- ... -->

</project>

```

#### 4.1.1.`Maven` 工程大致结构

```shell
java-in-action # 工程名
|- src
	|- main
		|- java
			|- 自定义包名
			|- io.github.photowey.java.in.action
				|- App.java
			|- ...
		|- resources
			|- 资源文件
	|- test
		|- java
			|- 自定义包名
			|- |- 测试相关类
		|- resources
			|- 测试相关资源文件
|- pom.xml
```

### 4.2.`Gradle` 工程

推荐: `Gradle in action` 书籍

> TODO 咱先把 `Maven` 搞懂吧
