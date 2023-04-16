package br.com.danilo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.danilo.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{

}
