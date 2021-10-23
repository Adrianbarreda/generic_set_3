package entities;

import java.util.Objects;

public class Courses {
	
	private Integer uniquecode;

	public Courses(int uniquecode) {		
		this.uniquecode = uniquecode;
	}

	public int getUniquecode() {
		return uniquecode;
	}

	public void setUniquecode(int uniquecode) {
		this.uniquecode = uniquecode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(uniquecode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Courses other = (Courses) obj;
		return uniquecode == other.uniquecode;
	}	
}
