package com.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.restservice.model.Student;

@Path("/student/data")
public class RestServer {
	
	@GET
	@Path("/get")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Student getStudentRecord()
	{
		
		Student student =new Student();
		student.setFirstName("ramu");
		student.setLastName("Pandu");
		student.setSchool("Standford");
		student.setStandard("ONE");
		student.setRollNumber(222);
		
		return student;
		
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postStudentRecord( Student student)
	{
		
		String result="Record Created "+ student;
		return Response.status(201).entity(result).build();
		
	}

}
