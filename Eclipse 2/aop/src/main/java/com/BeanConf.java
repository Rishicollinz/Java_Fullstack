package com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="com")//for what this file is applicable
@EnableAspectJAutoProxy//for aop tags
public class BeanConf {

}