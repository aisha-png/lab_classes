package org.example.classes;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee (int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getFirstName(){
        return firstName;
        }

        public String getLastName(){
        return lastName;
        }

        public String getName(){
        return this.firstName + " " + this.lastName;
        }

        public int getSalary(){
        return salary;
        }

        public int getAnnualSalary(){
        return 12 * this.salary;
        }

}
