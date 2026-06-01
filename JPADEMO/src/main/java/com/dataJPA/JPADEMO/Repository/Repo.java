package com.dataJPA.JPADEMO.Repository;

import com.dataJPA.JPADEMO.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Student,Integer> {

}
