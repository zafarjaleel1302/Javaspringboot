package com.encora.employee.controller;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.encora.employee.dto.EmployeeDTO;
import com.encora.employee.view.EmployeeFrame;

public class EmployeeHandler implements ActionListener {
	EmployeeFrame ef;
	public EmployeeHandler(EmployeeFrame employeeFrame) {
       ef=employeeFrame;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action=e.getActionCommand().toLowerCase();
		//EmployeeDTO dto=getEmployeeDataDto(ef);
		switch(action) {
		case "save":
			//getEmployeeData(ef);
			//saveOrUpdate(dto);
			getEmployeeDataDto(ef);
			
			break;
			
		case "search":
			break;
			
		case "update":
			break;
			
		case "delete":
			break;
			
		case "first":
			break;
			
		case "last":
			break;
			
		case "next":
			break;
			
		case "previous":
			break;
		default:
			break;
		
		}

	}
	public void getEmployeeData(EmployeeFrame ef) {
		String employeeId=ef.getEmployeeIdTextField().getText();
		String employeeName=ef.getEmployeeNameTextField().getText();
		Checkbox selectedGender=ef.getGenderCheckboxGroup().getSelectedCheckbox();
		String select=selectedGender.getLabel();
		boolean pf=ef.getPfCheckbox().getState();
		boolean nps=ef.getNpscheckBox().getState();
		boolean gradutiy=ef.getGradutiyCheckBox().getState();
		boolean mealCard=ef.getMealCardCheckBox().getState();
		boolean mediClaim=ef.getMediClaimCheckBox().getState();
		
		String officeLocation=ef.getLocationChoice().getSelectedItem();
		String address=ef.getEmployeeAddressTextArea().getText();
		System.out.println(employeeId+","+employeeName+", Gender:"+select+", PF:"+pf+", NPS: "+nps+", Gradutiy :"+gradutiy+", MealCard: "+mealCard+", MediClaim :"+mediClaim+", Office Location : "+officeLocation+", Address :"+address);
		
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
		System.out.println(empDTO);
		return empDTO;	
		
	}

}
