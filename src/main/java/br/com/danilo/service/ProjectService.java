package br.com.danilo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.danilo.entity.Project;
import br.com.danilo.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository rep;
	
	public Project save(Project project) {
		return rep.save(project);
	}

	public List<Project> listProjects() {
		return rep.findAll();
	}
}
