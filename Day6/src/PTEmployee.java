public class PTEmployee {
	public EmployeeInfo EmpInfo;
	public EmployeePay EmpPay;
	int term;
	int lastdate;

	public PTEmployee() {
		EmpPay = new EmployeePay();
		EmpInfo = new EmployeeInfo();
		term = 0;
		lastdate = 0;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public void setLastdate(int lastdate) {
		this.lastdate = lastdate;
	}

	public int getTerm() {
		return this.term;
	}

	public int getLastdate() {
		return this.lastdate;
	}
}
