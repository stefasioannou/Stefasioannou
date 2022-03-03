public class Main
{
    public static void main(String[] args)
    {

       Employee lessPaidEmployee = new Employee(Names.Stefanos, 33, 1500, Locations.Limassol );
       Employee morePaidEmployee = new Employee(Names.Alexis, 38, 2000, Locations.Nicosia );

                System.out.println("Name: " + lessPaidEmployee.name);
                System.out.println("Age: " + lessPaidEmployee.age);
                System.out.println("Salary: " + lessPaidEmployee.salary);
                System.out.println("Lives in: " + lessPaidEmployee.location);

                System.out.println("Name: " + morePaidEmployee.name);
                System.out.println("Age: " + morePaidEmployee.age);
                System.out.println("Salary: " + morePaidEmployee.salary);
                System.out.println("Lives in: " + morePaidEmployee.location);

    }

}
