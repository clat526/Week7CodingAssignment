package projects.service;

import java.util.List;
import java.util.NoSuchElementException;

import projects.dao.ProjectDao;
import projects.entity.Project;
import projects.exception.DbException;

public class ProjectService {
private ProjectDao projectdao = new ProjectDao();

	public Project addProject(Project project) {
		// TODO Auto-generated method stub
		return projectdao.insertProject(project);
	}

	public List<Project> fetchAllProjects() {
      return projectdao.fetchAllProjects();
	}

	public Project fetchProjectById(Integer projectId) {
	  return projectdao.fetchProjectById(projectId).orElseThrow(
		  () -> new NoSuchElementException(
		  "Project with project ID=" + projectId
		      + "does not exist."));
	}

	public void modifyProjectDetails(Project project) {
	  if(!projectdao.modifyProjectDetails(project)) {
		throw new DbException("Project with ID="
			+ project.getProjectId() + " does not exist.");
	  }
		
	}

	public void deleteProject(Integer projectId) {
	  if(!projectdao.deleteProject(projectId)) {
		throw new DbException("Project with ID=" + projectId + "does not exist.");
	  }
		
	}

}
