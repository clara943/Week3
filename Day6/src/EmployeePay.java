public class EmployeePay {

	int base;
	int add;
	int deduct;
	double percent;
	double total;
	double tax;
	double sum;

	public EmployeePay() {
		this.base = 0;
		this.add = 0;
		this.deduct = 0;
		this.percent = 0;
		this.total = 0;
		this.tax = 0.154;
		this.sum = 0;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public void setDeduct(int deduct) {
		this.deduct = deduct;
	}

	public int getAdd() {
		return (int) ((double) this.base * this.percent);
	}

	public int getBase() {
		return this.base;
	}

	public double getTax() {
		return this.tax;
	}

	public double getSum() {
		this.sum = this.base + this.getAdd() - this.deduct;

		return this.sum;
	}

	public double getTotal() {
		return (this.sum - (this.sum * this.tax));
	}

}
