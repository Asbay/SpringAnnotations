package com.tpe;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //beanler tanimlanicagini springe söylüyoruz bildiriyoruz
@ComponentScan("com.tpe") // icine yazdigimiz package in altinda olusturdugumuz bütün classlari tara ve bean olusturcagimiz yeri hazir et
public class AppConfiguration {


}
