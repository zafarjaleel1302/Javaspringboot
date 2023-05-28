package com.encora.employee.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.encora.employee.dto.EmployeeDTO;
import com.encora.employee.service.EmployeeService;
import com.mysql.jdbc.Driver;

public class EmployeeServiceImpl implements EmployeeService {
	Connection con;

	@Override
	public void saveEmployee(EmployeeDTO employeeDTO) {
		try {
			DriverManager.registerDriver(new Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3000/employee_db", "root", "root123");
			PreparedStatement ps = con.prepareStatement("INSERT INTO employee_db.employee_info\r\n"
					+ "(employee_Id, employee_name, gender, pf, graduity, meal_Card, nps, medi_claim, location, employee_address, employee_Salary)\r\n"
					+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);\r\n" 
					+ "");
			ps.setString(1, employeeDTO.getEmployeeId());
			ps.setString(2, employeeDTO.getEmployeeName());
			ps.setString(3, employeeDTO.getSelect());
			ps.setBoolean(4, employeeDTO.isPf());
			ps.setBoolean(5, employeeDTO.isGradutiy());
			ps.setBoolean(6, employeeDTO.isMealCard());
			ps.setBoolean(7, employeeDTO.isNps());
			ps.setBoolean(8, employeeDTO.isMediClaim());
			ps.setString(9, employeeDTO.getOfficeLocation());
			ps.setString(10, employeeDTO.getAddress());
			ps.setString(11, employeeDTO.getSalary());
			ps.execute();
			/*
			 * Statement stmt = con.createStatement();
			 * 
			 * String query = "INSERT INTO employee_db.employee_info\r\n" +
			 * "(employee_Id, employee_name, gender, pf, graduity, meal_Card, nps, medi_claim, location, employee_address, employee_Salary)\r\n"
			 * + "VALUES('" + employeeDTO.getEmployeeId() + "', '" +
			 * employeeDTO.getEmployeeName() + "', '" + employeeDTO.getSelect() + "', " +
			 * employeeDTO.isPf() + ", " + employeeDTO.isGradutiy() + ", " +
			 * employeeDTO.isMealCard() + ", " + employeeDTO.isNps() + ", " +
			 * employeeDTO.isMediClaim() + ", '" + employeeDTO.getOfficeLocation() + "', '"
			 * + employeeDTO.getAddress() + "', '" + employeeDTO.getSalary() + "');";
			 * stmt.execute(query);
			 */

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void updateEmployee(EmployeeDTO employeeDTO) {
		try {
			DriverManager.registerDriver(new Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3000/employee_db", "root", "root123");
			PreparedStatement ps =con.prepareStatement("UPDATE employee_db.employee_info\r\n"
					+ "SET employee_name=?, gender=?, pf=?, graduity=?, meal_Card=?, nps=?, medi_claim=?, location=?, employee_address=?, employee_Salary=?\r\n"
					+ "WHERE employee_Id=?;\r\n"
					+ "");
			ps.setString(1, employeeDTO.getEmployeeId());
			ps.setString(2, employeeDTO.getEmployeeName());
			ps.setString(3, employeeDTO.getSelect());
			ps.setBoolean(4, employeeDTO.isPf());
			ps.setBoolean(5, employeeDTO.isGradutiy());
			ps.setBoolean(6, employeeDTO.isMealCard());
			ps.setBoolean(7, employeeDTO.isNps());
			ps.setBoolean(8, employeeDTO.isMediClaim());
			ps.setString(9, employeeDTO.getOfficeLocation());
			ps.setString(10, employeeDTO.getAddress());
			ps.setString(11, employeeDTO.getSalary());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	@Override
	public EmployeeDTO searchEmployee(EmployeeDTO employeeDTO) {
		EmployeeDTO dto = new EmployeeDTO();
		try {
			DriverManager.registerDriver(new Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3000/employee_db", "root", "root123");
			PreparedStatement ps =con.prepareStatement("SELECT employee_Id, employee_name, gender, pf, graduity, meal_Card, nps, medi_claim, location, employee_address, employee_Salary\r\n"
					+ "FROM employee_db.employee_info where employee_id =?");
			ps.setString(1, employeeDTO.getEmployeeId());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				dto.setEmployeeId(rs.getString(0));
				dto.setEmployeeName(rs.getString(2));
				dto.setSelect(rs.getString(3));
				dto.setPf(rs.getBoolean(4));
				dto.setGradutiy(rs.getBoolean(5));
				dto.setMealCard(rs.getBoolean(6));
				dto.setNps(rs.getBoolean(7));
				dto.setMediClaim(rs.getBoolean(8));
				dto.setOfficeLocation(rs.getString(9));
				dto.setAddress(rs.getString(10));
				dto.setSalary(rs.getString(11));
				}
			return dto;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return dto;
	}

	@Override
	public void deleteEmployee(EmployeeDTO employeeDTO) {
		try {
			DriverManager.registerDriver(new Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3000/employee_db", "root", "root123");
			PreparedStatement ps =con.prepareStatement("DELETE FROM employee_db.employee_info WHERE employee_Id=?");
			ps.setString(1, employeeDTO.getEmployeeId());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
