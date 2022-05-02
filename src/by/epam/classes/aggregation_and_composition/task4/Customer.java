package by.epam.classes.aggregation_and_composition.task4;

import java.io.Serializable;
import java.util.*;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private String passportData;
	private List<BankAccount> accounts = new ArrayList<BankAccount>();
	
	public Customer() {
		super();
	}	
	
	public Customer(String surname, String name, String patronymic, String address, String passportData) {
		super();
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.passportData = passportData;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassportData() {
		return passportData;
	}

	public void setPassportData(String passportData) {
		this.passportData = passportData;
	}
	
	public void addAccount(BankAccount bankAccount) {
		accounts.add(bankAccount);
	}
	
	public List<BankAccount> getAccounts() {
		return accounts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((passportData == null) ? 0 : passportData.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Customer other = (Customer) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (passportData == null) {
			if (other.passportData != null)
				return false;
		} else if (!passportData.equals(other.passportData))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + ", address=" + address
				+ ", passportData=" + passportData + "]";
	}	
	
}