/*
 * RedboxBean.java
 * October 18 2012
 * (c) 2012, Nick Olano and Jeff Stern
 */
package edu.elon.redbox;

import java.util.Locale;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 * Redbox Bean class used to interact with the log-in and authentication process.
 * 
 * @author jeffreyStern
 * @author nickOlano
 *
 */
public class RedboxBean {

	private String fname;
	private String lname;
	private String email;
	private String password;
	private String passwordConfirm;
	private String zip;
	
	

	/**
	 * Runs when the command button is pressed if validation is successful
	 * 
	 * @return String representing the new page to go to,
	 *         mapped in face-config
	 */
	public String submit(){
		return "valid";
	}
	
	/**
	 * Custom validator to make sure that confirm password is equal to password 
	 * 
	 * @param context
	 * @param componentToValidate The input field calling the validator
	 * @param value The value passed through to validate
	 * @throws ValidatorException If it doesn't validate, throws an error msg
	 */
	public void pwcValidate(FacesContext context, UIComponent
			componentToValidate, Object value) throws ValidatorException {
		if(!getPassword().equals((String)value)){
			Locale lang =
				FacesContext.getCurrentInstance().getViewRoot().getLocale();
			String error =
				"The confirmation password does not match or is invalid";
			if(lang.getLanguage().equals("es")){
			   error="La contraseña de confirmación no coincide o no es válido";			
			}
			throw new ValidatorException(new FacesMessage(error));
		}
	}

	// Public getters and setters for all input fields
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
		
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
}