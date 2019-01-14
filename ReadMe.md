# mybatis-demo
mybatis+通用Mapper demo


数据库配置在src/resources/application.properties中

在test中调用

## 建表语句
```mysql
create table user
(
  uid      int auto_increment comment '用户id'
    primary key,
  username varchar(20) not null,
  password varchar(32) not null
)
  comment '用户';
```