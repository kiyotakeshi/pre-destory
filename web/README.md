# Run

## Build

```shell
export JAVA_HOME=~/Library/Java/JavaVirtualMachines/adopt-openjdk-11.0.8/Contents/Home

./mvnw clean package

ls target/sample.war
```

## Deploy tomcat server

- [use tomcat docker container](https://github.com/kiyotakeshi/tomcat-java)

```shell
cp target/sample.war webapps
```
