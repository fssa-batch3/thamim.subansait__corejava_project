package day05.pratice;

public class Department {

	String deptName;
	int deptId;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public Department(String deptName, int deptId) {
		this.deptName = deptName;
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "deptName = " + deptName + ", deptId = " + deptId;
	}

}
