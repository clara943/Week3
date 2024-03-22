
public class FTEmployee {
	EmployeeInfo EmpInfo;
	EmployeePay EmpPay;
	String grade;
	int labor;

	public FTEmployee() {
		EmpPay = new EmployeePay();
		EmpInfo = new EmployeeInfo();
		grade = "";
		labor = 0;
	}

	public void setGrade(String grade) {
		this.grade = grade;

		if (this.grade.equals("lv1")) {
			EmpPay.setPercent(0.1);
		} else if (this.grade.equals("lv2")) {
			EmpPay.setPercent(0.2);
		} else if (this.grade.equals("lv3")) {
			EmpPay.setPercent(0.25);
		} else if (this.grade.equals("lv4")) {
			EmpPay.setPercent(0.3);
		} else {
			EmpPay.setPercent(0);
		}
	}

	public void setLabor(int labor) {
		this.labor = labor;

		if (this.labor == 1) {
			EmpPay.setDeduct(50000);
		} else {
			EmpPay.setDeduct(0);
		}
	}

	public String getGrade() {
		return this.grade;
	}

	public int getLabor() {
		return this.labor;
	}
}
