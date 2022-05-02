package by.epam.classes.aggregation_and_composition.task4;

import java.io.Serializable;

public class BankAccount implements Serializable {

	private static final long serialVersionUID = 1L;
	private static int ID = 0;
	private int id = 0;
	private boolean blocked;
	private int sum = 0;
	
	public BankAccount() {
		super();
		id = ++ID;
	}	
	
	public BankAccount(boolean blocked, int sum) {
		super();
		this.id = ++ID;
		this.blocked = blocked;
		this.sum = sum;
	}
	
	public int getId() {
		return id;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void blocked() {
		this.blocked = true;
	}
	
	public void unBlocked() {
		this.blocked = false;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (blocked ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + sum;
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
		BankAccount other = (BankAccount) obj;
		if (blocked != other.blocked)
			return false;
		if (id != other.id)
			return false;
		if (sum != other.sum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + id + ", blocked=" + blocked + ", sum=" + sum + "]";
	}
	
}