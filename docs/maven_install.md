# `Maven` 安装

## 1.下载

> 选择合适的版本即可

```http
https://maven.apache.org/download.cgi
```



## 2.配置

> 以 `Windows` 为例,基本和 `JAVA_HOME` 同理

```shell
# 1.假定 -> 下载后解压到 D:\software\maven
# |- D:\software\maven
# |- |- bin
# |- |- boot
# |- |- conf
# |- |- lib
# |- |- README.txt
# |- |- LICENSE
# |- |- NOTICE

# 2.配置 MAVEN_HOME
# 同 JAVA_HOME
# MAVEN_HOME=D:\software\maven
# + PATH -> %MAVEN_HOME%\bin

# 3.修改配置 settings.xml
# |- %MAVEN_HOME%/conf/settings.xml

# 4.新建一个 MAVEN 本地仓库,假定: D:\software\repo
# 4.1.修改: localRepository XML 节点
# |- 这样我们就把用户(C:\Users\photowey | C:\Users\admin | ...)目录下的 `.m2` 自定义到了 `D:\software\repo`
# |- |- 避免将依赖放入 C 盘,如果 C 盘空间足够可不考虑

# 5.验证
# $ mvn -v
# |- 看见如下类似信息即可配置完成
# ----------------------------------------------------------------
➜ mvn -v
Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937)
Maven home: D:\software\maven
Java version: 17.0.5, vendor: Oracle Corporation, runtime: D:\software\jdkws\jdk17
Default locale: zh_CN, platform encoding: GBK
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"
```

```xml
<?xml version="1.0" encoding="UTF-8"?>

<settings xmlns="http://maven.apache.org/SETTINGS/1.2.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.2.0 https://maven.apache.org/xsd/settings-1.2.0.xsd">

  <!-- ... -->
  <!-- Linux: 示例: /usr/local/maven/repo/repository -->
  <!-- MacOS: 同 Linux -->
  <localRepository>D:\software\repo\repository</localRepository>
  
  <!-- ... -->
</settings>

```

