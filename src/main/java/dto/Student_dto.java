package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "Details2")
public class Student_dto {
	@Id
	private int sid;
	private String sname;
	private double ssal;
	private String gen;
	private String date;
	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSsal() {
		return ssal;
	}

	public void setSsal(double ssal) {
		this.ssal = ssal;
	}
}
