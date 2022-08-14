package August_13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Emp {
	String ename;
	int esalary;

	public Emp(String ename, int esalary) {
		// TODO Auto-generated constructor stub
		this.ename = ename;
		this.esalary = esalary;

	}
}

class SalaryCompare implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		if (o1.esalary > o2.esalary) {
			return 1;
		} else if (o1.esalary == o2.esalary) {
			return 0;

		} else if (o1.esalary < o2.esalary) {
			return -1;
		}

		return 0;
	}

}

public class ComparatorEx {

	public static void main(String[] args) {
		Emp e1 = new Emp("Gaurang", 700000);
		Emp e2 = new Emp("Suresh", 30000);
		Emp e3 = new Emp("Ramesh", 40000);
		Emp e4 = new Emp("Atul", 50000);

		ArrayList<Emp> array = new ArrayList<>();
		array.add(e1);
		array.add(e2);
		array.add(e3);
		array.add(e4);

		Collections.sort(array, new SalaryCompare());

		for (Emp emp : array) {
			System.out.println(emp.ename + " " + emp.esalary);

		}
	}
}
