# mybatis-plus-native
参考：
> https://github.com/baomidou/mybatis-plus/issues/5527
> https://github.com/baomidou/mybatis-plus/pull/5594

## 打包
```bash
mvn clean package -P native
```

## 注意点
- `pom.xml` 里的 `<buildArg>-H:+AddAllCharsets</buildArg>` 是为了解决
- 使用 @autowired，不要使用 @resource
- config 下的 AotUtils、GraalReflectionAotHints 和 LambdaRegistrationFeature，是为了解决 lamdba 表达式的注入， pom.xml 里同时要加入 `--features=com.gyjian.test.config.LambdaRegistrationFeature`
