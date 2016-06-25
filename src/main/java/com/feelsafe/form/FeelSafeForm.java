/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.feelsafe.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 03-01-2008
 * 
 * XDoclet definition:
 * @struts.form name="feelSafeForm"
 */
public class FeelSafeForm extends ActionForm {
	/*
	 * Generated fields
	 */

	
	private String equipmentname;
	private String equipmentfees;
	
	private String qualification;
	private String consultinghours;

	private String patientdate1;
	private String patientname;
	private String patientage;
	private String patientsex;
	private String patienthealthproblem;
	private String patientdate;
	private String patienttime;

	private String doctorname;
	private String specialist;

	private String symptoms;
	private String diseasename;
	private String medication;

	
	private String cancel1;
	private String firstname;
	private String lastname;
	private String userid;
//	private String password;
	private String permanentaddress;
	private String phonenumber;
	private String sex;
	private String nationality;
	private String textverification;
	private String type;
	
	private String errorMessage="";
	
	
	
	
	
	
	
	
	
	/** password property */
	private String password;

	/** username property */
	private String username;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the password.
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/** 
	 * Set the password.
	 * @param password The password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/** 
	 * Returns the username.
	 * @return String
	 */
	public String getUsername() {
		return username;
	}

	/** 
	 * Set the username.
	 * @param username The username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPermanentaddress() {
		return permanentaddress;
	}

	public void setPermanentaddress(String permanentaddress) {
		this.permanentaddress = permanentaddress;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTextverification() {
		return textverification;
	}

	public void setTextverification(String textverification) {
		this.textverification = textverification;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getCancel1() {
		return cancel1;
	}

	public void setCancel1(String cancel1) {
		this.cancel1 = cancel1;
	}

	public String getDiseasename() {
		return diseasename;
	}

	public void setDiseasename(String diseasename) {
		this.diseasename = diseasename;
	}

	public String getMedication() {
		return medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public String getPatientage() {
		return patientage;
	}

	public void setPatientage(String patientage) {
		this.patientage = patientage;
	}

	public String getPatienthealthproblem() {
		return patienthealthproblem;
	}

	public void setPatienthealthproblem(String patienthealthproblem) {
		this.patienthealthproblem = patienthealthproblem;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getPatientsex() {
		return patientsex;
	}

	public void setPatientsex(String patientsex) {
		this.patientsex = patientsex;
	}

	public String getPatientdate() {
		return patientdate;
	}

	public void setPatientdate(String patientdate) {
		this.patientdate = patientdate;
	}

	public String getPatienttime() {
		return patienttime;
	}

	public void setPatienttime(String patienttime) {
		this.patienttime = patienttime;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getConsultinghours() {
		return consultinghours;
	}

	public void setConsultinghours(String consultinghours) {
		this.consultinghours = consultinghours;
	}

	public String getPatientdate1() {
		return patientdate1;
	}

	public void setPatientdate1(String patientdate1) {
		this.patientdate1 = patientdate1;
	}

	public String getErrorMessage() {
		return "<center><font color='red'><b>"+errorMessage+"</b></font></center>";
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEquipmentfees() {
		return equipmentfees;
	}

	public void setEquipmentfees(String equipmentfees) {
		this.equipmentfees = equipmentfees;
	}

	public String getEquipmentname() {
		return equipmentname;
	}

	public void setEquipmentname(String equipmentname) {
		this.equipmentname = equipmentname;
	}


}