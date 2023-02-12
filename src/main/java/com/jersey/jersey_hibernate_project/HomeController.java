package com.jersey.jersey_hibernate_project;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Path("/home")
public class HomeController {
	
	@Path("/{studentID}") @GET
	@Produces(MediaType.APPLICATION_JSON)
	public Student sayHello(@PathParam("studentID") int id) {
		Student finalStudent = new Student();
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory buildSessionFactory = conf.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		Student student = session.load(Student.class, id);
		finalStudent.setId(student.getId());
		finalStudent.setName(student.getName());
		finalStudent.setDate(student.getDate());
		System.out.println("Student name is " + student.getName());
		session.close();
		buildSessionFactory.close();
		return finalStudent;
	}
}
