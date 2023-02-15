package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.Student_dao;
import dto.Student_dto;

public class MClass extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String s1 = req.getParameter("sid");
		int id = Integer.parseInt(s1);

		String s2 = req.getParameter("sname");

		String s3 = req.getParameter("ssal");
		double sal = Double.parseDouble(s3);

		String gender = req.getParameter("gen");

		String date = req.getParameter("date");
		
		String country=req.getParameter("country");

		Student_dto dto = new Student_dto();
		dto.setSid(id);
		dto.setSname(s2);
		dto.setSsal(sal);
		dto.setGen(gender);
		dto.setDate(date);
		dto.setCountry(country);

		Student_dao dao = new Student_dao();
		dao.insert(dto);
	}

}
