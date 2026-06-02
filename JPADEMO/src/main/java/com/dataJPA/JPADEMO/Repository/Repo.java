package com.dataJPA.JPADEMO.Repository;

import com.dataJPA.JPADEMO.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Repo extends JpaRepository<Student,Integer> {

      List<Student> findByTech( String tech);

      List<Student> findByRnoAndTech(int rno , String tech);

      @Query(nativeQuery = true,
      value= "SELECT * FROM student where name=:name And tech=:tech")
      List<Student> findByNameAndTech(@Param("name") String name, @Param("tech") String tech);

      //jpl
      @Query("SELECT ss from Student ss WHERE ss.name='Abi'")
      List<Student>findbyName(String name);


}
