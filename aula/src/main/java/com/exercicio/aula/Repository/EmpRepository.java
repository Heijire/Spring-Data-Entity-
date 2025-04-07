package com.exercicio.aula.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exercicio.aula.model.Emp;
public interface EmpRepository extends JpaRepository<Emp, Integer>{

}
