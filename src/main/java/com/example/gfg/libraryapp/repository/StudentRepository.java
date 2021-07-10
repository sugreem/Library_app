package com.example.gfg.libraryapp.repository;

import com.example.gfg.libraryapp.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer > {

    //@Query("select s from Student s where s.age > ?1 and s.email = ?2")
    @Query("select s from Student s where s.age > :age_no")
    List<Student> getStudentsBySAgeJPQL(int age_no);

    @Query(value = "select * from student where age > :age", nativeQuery = true)
    List<Student> getStudentsBySAgeNative(int age);

    @Transactional
    @Modifying
    @Query("update Student s set s.email = ?1, s.name = ?2, s.age = ?3 where s.id = ?4")
    void update(String email, String name, int age, int id);

}
