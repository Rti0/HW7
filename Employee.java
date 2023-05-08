
    public class Employee {
        private String id;
        private String name;
        private int salary;

        public Employee(String number, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public String getID() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }

        public int getAnnualSalary() {
            return salary * 24;
        }

        public int raisedSalary(int percent) {
            int raiseAmount = (salary * percent) / 100;
            salary += raiseAmount;
            return salary;
        }

        public String toString() {
            return "Employee[id=" + id + ",name=" + name + ",salary=" + salary + "]";
        }
    }

