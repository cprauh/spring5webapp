package com.simplexsys.springguru.model;

import javax.persistence.*;


@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String street;
	private String city;	
	private String state;	
	private String zipcode;
	
	public Publisher() {
		
	}
	
	public Publisher(Long id, String name, String street, String city, String state, String zipcode) {
		this.id = id;
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public String getStreet() {return street;}
	public void setStreet(String street) {this.street = street;}

	public String getCity() {return city;}
	public void setCity(String city) {this.city = city;}

	public String getState() {return state;}
	public void setState(String state) {this.state = state;}

	public String getZipcode() {return zipcode;}
	public void setZipcode(String zipcode) {this.zipcode = zipcode;}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Publisher{id='" + id + 
				"',name='" + name + 
				"',street='" + street + 
				"',city='" + city + 
				"',state='"	+ state + 
				"',zipcode='" + zipcode + 
				"'}";
	}	
	

	
	
	
}
