package org.sns.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;

import org.hibernate.Hibernate;
import org.sns.model.User;
import org.sns.service.UserService;

/**
 * @author bq
 * @version 1.0
 */
public class UserAction implements Action{
	private String username;
	private String password;
	private short sex;
	private String phone;
	private String qq;
	private String email;
	private File image;
	private String imageContentType;
	private String imageFileName;
	private UserService userService;
	
	@Override
	public String execute() throws Exception {
		User u=new User();
		u.setUsername(username);
		u.setPassword(password);
		u.setSex(sex);
		u.setQq(qq);
		u.setPhone(phone);
		u.setEmail(email);
		InputStream is= new FileInputStream(image);
		Blob blob=Hibernate.createBlob(is);
		u.setImage(blob);
		userService.addUser(u);
		return SUCCESS;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
	public short getSex() {
		return sex;
	}

	public void setSex(short sex) {
		this.sex = sex;
	}

	public String getImageContentType() {
		return imageContentType;
	}

	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
