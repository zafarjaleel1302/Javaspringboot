package com.encora.employee.view;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.encora.employee.controller.EmployeeHandler;

public class EmployeeFrame extends Frame{
	
	private Label employeeIdLabel,employeeNameLabel,employeeGenderLabel,employeeParkLabel,employeeLocationLabel,employeeAddressLabel,employeeSalaryLabel;
	private TextField employeeIdTextField,employeeNameTextField,employeeSalaryTextField;
	private Checkbox maleRadiobtn,femaleRadiobtn,otherRadiobtn,pfCheckbox,gradutiyCheckBox,mealCardCheckBox,NpscheckBox,mediClaimCheckBox;
	private CheckboxGroup genderCheckboxGroup;
	private Choice locationChoice;
	private TextArea employeeAddressTextArea;
	private Button saveButton,searchButton,updateButton,deleteButton,firstButton,lastButton,nextButton,previousButton ;
	public EmployeeFrame(){
		setVisible(true);
		setBounds(50, 50, 700, 450);
		setTitle("Employee Information form");
		setLayout(null);
		genderCheckboxGroup=new CheckboxGroup();
		
		employeeIdLabel=new Label("Employee ID");
		employeeIdLabel.setBounds(20, 50, 100, 20);
		add(employeeIdLabel);
		employeeIdTextField=new TextField();
		employeeIdTextField.setBounds(140,50,100,20);
		add(employeeIdTextField);
		
		employeeNameLabel=new Label("Employee Name");
		employeeNameLabel.setBounds(20, 90, 100, 20);
		add(employeeNameLabel);
		employeeNameTextField=new TextField();
		employeeNameTextField.setBounds(140,90,100,20);
		add(employeeNameTextField);
		
		employeeGenderLabel=new Label("Gender");
		employeeGenderLabel.setBounds(20,130,150,20);
		add(employeeGenderLabel);		
		maleRadiobtn=new Checkbox("Male",true,genderCheckboxGroup);
		maleRadiobtn.setBounds(190,130,80,20);
		add(maleRadiobtn);
		femaleRadiobtn=new Checkbox("Female",false,genderCheckboxGroup);
		femaleRadiobtn.setBounds(290,130,80,20);
		add(femaleRadiobtn);
		otherRadiobtn=new Checkbox("Other",false,genderCheckboxGroup);
		otherRadiobtn.setBounds(390,130,80,20);
		add(otherRadiobtn);
		
		employeeParkLabel=new Label("Employee Perks");
		employeeParkLabel.setBounds(20,170,100,20);
		add(employeeParkLabel);
		
		pfCheckbox=new Checkbox("PF");
		pfCheckbox.setBounds(140,170,60,20);
		add(pfCheckbox);
		gradutiyCheckBox=new Checkbox("Graduity");
		gradutiyCheckBox.setBounds(220,170,80,20);
		add(gradutiyCheckBox);
		mealCardCheckBox=new Checkbox("Meal Card");
		mealCardCheckBox.setBounds(320,170,80,20);
		add(mealCardCheckBox);
		NpscheckBox=new Checkbox("NPS");
		NpscheckBox.setBounds(420,170,80,20);
		add(NpscheckBox);
		
		mediClaimCheckBox=new Checkbox("Medi Claim");
		mediClaimCheckBox.setBounds(520,170,80,20);
		add(mediClaimCheckBox);
		
		employeeLocationLabel=new Label("Location");
		employeeLocationLabel.setBounds(20,210,100,20);
		add(employeeLocationLabel);
		
		locationChoice=new Choice();
		locationChoice.setBounds(140,210,100,20);
		locationChoice.add("Pune");
		locationChoice.add("Hyderabad");
		locationChoice.add("Banglore");
		locationChoice.add("Hubali");
		locationChoice.add("Chennai");
		add(locationChoice);
		
		employeeAddressLabel=new Label("Employee Address");
		employeeAddressLabel.setBounds(260, 210, 100, 20);
		add(employeeAddressLabel);
		
		employeeAddressTextArea=new TextArea();
		employeeAddressTextArea.setBounds(380, 210, 100, 100);
		add(employeeAddressTextArea);
		
		employeeSalaryLabel=new Label("Employee Salary");
		employeeSalaryLabel.setBounds(20, 260, 100, 20);
		add(employeeSalaryLabel);
		
		employeeSalaryTextField=new TextField();
		employeeSalaryTextField.setBounds(140, 260, 100, 20);
		add(employeeSalaryTextField);
		
		saveButton=new Button("Save");
		saveButton.setBounds(140, 320, 80, 20);
		add(saveButton);
		saveButton.addActionListener(new EmployeeHandler(this));
		
		searchButton=new Button("Search");
		searchButton.setBounds(240, 320, 80, 20);
		add(searchButton);
		searchButton.addActionListener(new EmployeeHandler(this));
		
		updateButton=new Button("Update");
		updateButton.setBounds(340, 320, 80, 20);
		add(updateButton);
		updateButton.addActionListener(new EmployeeHandler(this));
		
		deleteButton=new Button("Delete");
		deleteButton.setBounds(440, 320, 80, 20);
		add(deleteButton);
		deleteButton.addActionListener(new EmployeeHandler(this));
		
		firstButton=new Button("First");
		firstButton.setBounds(140, 360, 80, 20);
		add(firstButton);
		firstButton.addActionListener(new EmployeeHandler(this));
		
		lastButton=new Button("Last");
		lastButton.setBounds(240, 360, 80, 20);
		add(lastButton);
		lastButton.addActionListener(new EmployeeHandler(this));
		
		nextButton=new Button("Next");
		nextButton.setBounds(340, 360, 80, 20);
		add(nextButton);
		nextButton.addActionListener(new EmployeeHandler(this));
		
		previousButton=new Button("Previous");
		previousButton.setBounds(440, 360, 80, 20);
		add(previousButton);
		previousButton.addActionListener(new EmployeeHandler(this));
		
		this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {

			EmployeeFrame ef=(EmployeeFrame)e.getSource();
			ef.dispose();
		}
		});
		
	}
	public TextField getEmployeeIdTextField() {
		return employeeIdTextField;
	}
	public void setEmployeeIdTextField(TextField employeeIdTextField) {
		this.employeeIdTextField = employeeIdTextField;
	}
	public TextField getEmployeeNameTextField() {
		return employeeNameTextField;
	}
	public void setEmployeeNameTextField(TextField employeeNameTextField) {
		this.employeeNameTextField = employeeNameTextField;
	}
	public TextField getEmployeeSalaryTextField() {
		return employeeSalaryTextField;
	}
	public void setEmployeeSalaryTextField(TextField employeeSalaryTextField) {
		this.employeeSalaryTextField = employeeSalaryTextField;
	}
	public Checkbox getMaleRadiobtn() {
		return maleRadiobtn;
	}
	public void setMaleRadiobtn(Checkbox maleRadiobtn) {
		this.maleRadiobtn = maleRadiobtn;
	}
	public Checkbox getFemaleRadiobtn() {
		return femaleRadiobtn;
	}
	public void setFemaleRadiobtn(Checkbox femaleRadiobtn) {
		this.femaleRadiobtn = femaleRadiobtn;
	}
	public Checkbox getOtherRadiobtn() {
		return otherRadiobtn;
	}
	public void setOtherRadiobtn(Checkbox otherRadiobtn) {
		this.otherRadiobtn = otherRadiobtn;
	}
	public Checkbox getPfCheckbox() {
		return pfCheckbox;
	}
	public void setPfCheckbox(Checkbox pfCheckbox) {
		this.pfCheckbox = pfCheckbox;
	}
	public Checkbox getGradutiyCheckBox() {
		return gradutiyCheckBox;
	}
	public void setGradutiyCheckBox(Checkbox gradutiyCheckBox) {
		this.gradutiyCheckBox = gradutiyCheckBox;
	}
	public Checkbox getMealCardCheckBox() {
		return mealCardCheckBox;
	}
	public void setMealCardCheckBox(Checkbox mealCardCheckBox) {
		this.mealCardCheckBox = mealCardCheckBox;
	}
	public Checkbox getNpscheckBox() {
		return NpscheckBox;
	}
	public void setNpscheckBox(Checkbox npscheckBox) {
		NpscheckBox = npscheckBox;
	}
	public Checkbox getMediClaimCheckBox() {
		return mediClaimCheckBox;
	}
	public void setMediClaimCheckBox(Checkbox mediClaimCheckBox) {
		this.mediClaimCheckBox = mediClaimCheckBox;
	}
	public CheckboxGroup getGenderCheckboxGroup() {
		return genderCheckboxGroup;
	}
	public void setGenderCheckboxGroup(CheckboxGroup genderCheckboxGroup) {
		this.genderCheckboxGroup = genderCheckboxGroup;
	}
	public Choice getLocationChoice() {
		return locationChoice;
	}
	public void setLocationChoice(Choice locationChoice) {
		this.locationChoice = locationChoice;
	}
	public TextArea getEmployeeAddressTextArea() {
		return employeeAddressTextArea;
	}
	public void setEmployeeAddressTextArea(TextArea employeeAddressTextArea) {
		this.employeeAddressTextArea = employeeAddressTextArea;
	}

}
