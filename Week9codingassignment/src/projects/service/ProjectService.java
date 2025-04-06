package projects.service;

import projects.dao.DbException;
import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {
private ProjectDao projectdao = new ProjectDao();

	public Project addProject(Project project) throws DbException {
		// TODO Auto-generated method stub
		return projectdao.insertProject(project);
	}

}
