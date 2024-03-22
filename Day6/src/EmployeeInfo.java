public class EmployeeInfo {
    
    String name;
	String address;
	String bank;
	
	int age;
	int birthinfo;
	int id;
	int phone;
	int account;

	public EmployeeInfo() {
		name = null;
		address = null;
		bank = null;

		age = 0;
		birthinfo = 0;
		id = 0;
		phone = 0;
		account = 0;
	}    

	public void setEmpName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setBirthinfo(int birthinfo) {
		this.birthinfo = birthinfo;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public void setAccount(int account) {
		this.account = account;
	}
		
	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public String getBank() {
		return this.bank;
	}

	public int getAge() {
		return this.age;
	}

	public int getBirthinfo() {
		return this.birthinfo;
	}
	
	public int getId() {
		return this.id;
	}

	public int getPhone() {
		return this.phone;
	}

	public int getAccount() {
		return this.account;
	}
}
