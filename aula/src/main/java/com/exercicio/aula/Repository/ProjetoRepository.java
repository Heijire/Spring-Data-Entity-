package com.exercicio.aula.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exercicio.aula.model.Projeto;
public interface ProjetoRepository extends JpaRepository<Projeto, Integer>{

}
