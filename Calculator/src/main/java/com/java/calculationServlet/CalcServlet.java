package com.java.calculationServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.calculation.Operations;

public class CalcServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Integer result = 0;
		Operations calculation = new Operations();
		String s1 = req.getParameter("firstnumber");
		String s2 = req.getParameter("secondnumber");
		String s3 = req.getParameter("chooseoption");
		if (s3.equals("addition")) {
			result = calculation.addition(Integer.parseInt(s1), Integer.parseInt(s2));
		} else if (s3.equals("subtraction")) {
			result = calculation.subtraction(Integer.parseInt(s1), Integer.parseInt(s2));
		} else if (s3.equals("multiplication")) {
			result = calculation.multiplication(Integer.parseInt(s1), Integer.parseInt(s2));
		} else if (s3.equals("division")) {
			result = calculation.division(Integer.parseInt(s1), Integer.parseInt(s2));
		}
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println(result);
		out.println("</body></html>");
	}
}
