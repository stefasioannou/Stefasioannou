public class Employee
{
    Names name;
    int age;
    double salary;
    Locations location;

    Employee(Names name, double age, double salary, Locations location)
    {
        this.name = name;
        this.age = (int) age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary()

    {
        this.salary *= 1.2;
    }
}
