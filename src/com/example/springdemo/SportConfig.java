package com.example.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// This class works as the Spring IoC configuration and is an alternative to the XML approach.
@Configuration
// We can define beans ourselves inside this class. Alternatively, we can also enable component scan by this annotation and point
// it to a package to get bean info by itself.
@ComponentScan("com.example.springdemo")
public class SportConfig {

}
