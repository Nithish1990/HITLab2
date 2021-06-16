package HIT_LAB_2;

class Employee {
	int EpId ;
	String EpName;
	Employee(int id, String name){
		this.EpName = name;
		this.EpId=id;
		}
	void info() {
		System.out.println("ID: "+EpId+" Name: "+EpName);
	}
	public static void main(String[] args) {
		Employee obj1 = new Employee(1001, "Nithish");
		Employee obj2 = new Employee(1002, "Kumar");
		obj1.info();
		obj2.info();
	}
	}
		