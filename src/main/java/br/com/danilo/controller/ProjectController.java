package br.com.danilo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.danilo.dto.ProjectDTO;
import br.com.danilo.entity.Project;
import br.com.danilo.service.ProjectService;

@RestController
@RequestMapping("projects")
public class ProjectController {
	
	@Autowired private ProjectService service;
	
	@PostMapping
	public ResponseEntity<?> postProject(@RequestBody Project project){
		return ResponseEntity.ok(service.save(project));
	}
	
	@CrossOrigin("*")
	@GetMapping
	public ResponseEntity<?> getProjects(){
		ProjectDTO projectDTO = new ProjectDTO();
		
		projectDTO.setProjects(service.listProjects());
		
		return ResponseEntity.ok(projectDTO);
	}
	
	
}
