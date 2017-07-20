package jdk8.stream.stream_operation;

public class Transaction {
	private int id;
	private String type;
	private Double value;
	
	public Transaction(int id, String type, Double value) {
		this.id = id;
		this.type = type;
		this.value = value;
	}
	public int getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}
	
	public Double getValue() {
		return value;
	}
	
	public Boolean isGrocery(){
		return "GROCERY".equals(this.type);	
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		Transaction other = (Transaction) obj;
		if (id != other.id)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", type=" + type + ", value=" + value + "]";
	}
}
