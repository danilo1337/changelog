package br.com.danilo.dto;

import java.util.List;

import br.com.danilo.entity.Project;

public class ProjectDTO {
	private List<Project> projects;

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
}
