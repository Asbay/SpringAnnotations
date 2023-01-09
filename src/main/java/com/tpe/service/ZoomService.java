package com.tpe.service;

import com.tpe.domain.Course;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //bu siniftan bean üretsin spring diyoruz
public class ZoomService implements CourseService{
/*
    @Autowired //field injection,

    @Qualifier("cloudRepository")
    private Repository repository;

*/
    /*
@Autowired // setter injektion/*
@Qualifier("cloudRepository")
    private Repository repository;
*/

    //constructor injektion  DAHA COK KULLANILIR KOD OKUNMASI ICIN DAHA COK TERCIH EDILIR
    private Repository repository;

    public ZoomService(@Qualifier("cloudRepository") Repository repository){
        this.repository = repository;
    }



    public void setRepository(Repository repository){
        this.repository = repository;
    }

    @Override
    public void teachCourse(Course course) {
        System.out.println(course.getName()+ " dersi zoom ile anlatiliyor");
    }

    @Override
    public void saveCourse(Course course) {
        repository.save(course);

    }
}
