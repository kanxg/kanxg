package kxg.searchaf.url.job;

public class Company {
	String name;
	String type;
	String guimo;
	String location;
	String desc;

	@Override
	public String toString() {
		return "Company [name=" + name + ", type=" + type + ", guimo=" + guimo
				+ ", location=" + location + ", desc=" + desc + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((guimo == null) ? 0 : guimo.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Company other = (Company) obj;
		if (guimo == null) {
			if (other.guimo != null)
				return false;
		} else if (!guimo.equals(other.guimo))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
