package com.tpe.app;

import com.tpe.AppConfiguration;
import com.tpe.domain.Course;
import com.tpe.service.CourseService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        // configuration classini görmesi icin bunu olusturuyoruz bean olusturucak ve context in icine alacak

        Course course = new Course();
        course.setName("SQL");


        //@compenent atadigimiz icin zoom service den bean kendi context icinde getirecek
        CourseService service=  context.getBean("zoomService", CourseService.class);
        service.teachCourse(course);
        service.saveCourse(course);
        //zoom servicei newlemedik rica ettik
        //zoom service de repoya ihtiyacimiz vardi ama newlemedik


    }
}
