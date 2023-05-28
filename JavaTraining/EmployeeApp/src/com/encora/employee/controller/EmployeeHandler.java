package com.encora.employee.controller;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.encora.employee.dto.EmployeeDTO;
import com.encora.employee.service.EmployeeService;
import com.encora.employee.service.impl.EmployeeServiceImpl;
import com.encora.employee.view.EmployeeFrame;

public class EmployeeHandler implements ActionListener {
	EmployeeFrame ef;
	EmployeeService employeeService;

	public EmployeeHandler(EmployeeFrame employeeFrame) {
		ef = employeeFrame;
		employeeService = new EmployeeServiceImpl();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand().toLowerCase();
		EmployeeDTO dto = getEmployeeDataDto(ef);
		switch (action) {
		case "save":
			employeeService.saveEmployee(dto);
			System.out.println("Save button Press");
			break;

		case "search":
			EmployeeDTO result= employeeService.searchEmployee(dto);
			ef.getEmployeeNameTextField().setText(result.getEmployeeName());
			ef.getEmployeeAddressTextArea().setText(result.getAddress());
			ef.getEmployeeSalaryTextField().setText(result.getSalary());
			ef.getLocationChoice().setName(result.getOfficeLocation());
			ef.getNpscheckBox().setState(result.isNps());
			ef.getPfCheckbox().setState(result.isPf());
			ef.getGradutiyCheckBox().setState(result.isGradutiy());
			ef.getMealCardCheckBox().setState(result.isMealCard());
			ef.getMediClaimCheckBox().setState(result.isMediClaim());
			String gender=result.getSelect();
			
			if(gender!=null) 
			{
			if (gender.equalsIgnoreCase("Male")) {
				ef.getMaleRadiobtn().setState(true);					
			}else if (gender.equalsIgnoreCase("Female")) {
				ef.getFemaleRadiobtn().setState(true);
			}else if (gender.equalsIgnoreCase("Other")) {
				ef.getOtherRadiobtn().setState(true);
			}
			}
			System.out.println("Search button Press" + result);
			break;

		case "update":
			employeeService.updateEmployee(dto);
			System.out.println("Update button Press");
			break;

		case "delete":
			employeeService.deleteEmployee(dto);
			System.out.println("Delete button Press");
			break;

		case "first":
			System.out.println("First button Press");
			break;

		case "last":
			System.out.println("Last button Press");
			break;

		case "next":
			System.out.println("Next button Press");
			break;

		case "previous":
			System.out.println("Previous button Press");
			break;
		default:
			break;

		}

	}

	public void getEmployeeData(EmployeeFrame ef) {
		String employeeId = ef.getEmployeeIdTextField().getText();
		String employeeName = ef.getEmployeeNameTextField().getText();
		Checkbox selectedGender = ef.getGenderCheckboxGroup().getSelectedCheckbox();
		String select = selectedGender.getLabel();
		boolean pf = ef.getPfCheckbox().getState();
		boolean nps = ef.getNpscheckBox().getState();
		boolean gradutiy = ef.getGradutiyCheckBox().getState();
		boolean mealCard = ef.getMealCardCheckBox().getState();
		boolean mediClaim = ef.getMediClaimCheckBox().getState();

		String officeLocation = ef.getLocationChoice().getSelectedItem();
		String address = ef.getEmployeeAddressTextArea().getText();
		String salary = ef.getEmployeeSalaryTextField().getText();
		System.out.println(employeeId + "," + employeeName + ", Gender:" + select + ", PF:" + pf + ", NPS: " + nps
				+ ", Gradutiy :" + gradutiy + ", MealCard: " + mealCard + ", MediClaim :" + mediClaim
				+ ", Office Location : " + officeLocation + ", Address :" + address);

	}

	public EmployeeDTO getEmployeeDataDto(EmployeeFrame ef) {

		EmployeeDTO empDTO = new EmployeeDTO();
		empDTO.setEmployeeId(ef.getEmployeeIdTextField().getText());
		empDTO.setEmployeeName(ef.getEmployeeNameTextField().getText());
		empDTO.setSelect(ef.getGenderCheckboxGroup().getSelectedCheckbox().getLabel());
		empDTO.setPf(ef.getPfCheckbox().getState());
		empDTO.setNps(ef.getPfCheckbox().getState());
		empDTO.setGradutiy(ef.getGradutiyCheckBox().getState());
		empDTO.setMealCard(ef.getMealCardCheckBox().getState());
		empDTO.setMediClaim(ef.getMediClaimCheckBox().getState());
		empDTO.setOfficeLocation(ef.getLocationChoice().getSelectedItem());
		empDTO.setAddress(ef.getEmployeeAddressTextArea().getText());
		empDTO.setSalary(ef.getEmployeeSalaryTextField().getText());
		System.out.println(empDTO);
		return empDTO;

	}

}
