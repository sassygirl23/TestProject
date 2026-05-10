package records;

// Record with custom constructor
record Employee(String name, double salary) {

    
    Employee(String name, double salary) {

        // Validation
        if (salary < 0) {
            throw new IllegalArgumentException(
                    "Salary cannot be negative");
        }

        this.name = name;
        this.salary = salary;
    }
}

public class Constructor {

    public static void main(String[] args) {

        Employee emp =
                new Employee("Ana", 50000);

        System.out.println(emp);
    }
}