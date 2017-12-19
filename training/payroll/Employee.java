public class Employee
{
     public String name;
     public String address;
     public int SSN;
     public int number;
     public Employee(String name, String address, int SSN, int number)
     {
          System.out.println("Constructing an Employee");
          this.name = name;
          this.address = address;
          this.SSN = SSN;
          this.number = number;
     }
     public void mailCheck()
     {
          System.out.println("Mailing a check to " + this.name
                                  + " " + this.address);
     }
}
