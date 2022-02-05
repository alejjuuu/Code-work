package Final_project_ccm;

public class Student {

   private int id; // Hold Student ID
   private String Fullname; // Hold Student full name
   private String Firstname; // Hold First name
   private String Lastname; // Hold last name
   private String Address; // hold address
   private String Major; // hold major

   // constructor method

   public Student(int id, String Firstname, String Lastname, String Fullname, String Address, String Major) {
      this.id = id;
      this.Firstname = Firstname;
      this.Fullname = Fullname;
      this.Lastname = Lastname;
      this.Address = Address;
      this.Major = Major;
   }

   // ID
   public double getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   // first name
   public String getfirstname() {
      return Firstname;
   }

   public void setfirstname(String Firstname) {
      this.Firstname = Firstname;
   }

   // last name
   public String getlastname() {
      return Lastname;
   }

   public void setlastname(String Lastname) {
      this.Lastname = Lastname;
   }

   // major
   public String getaddress() {
      return Address;
   }

   public void setaddress(String Address) {
      this.Address = Address;
   }

   // major
   public String getmajor() {
      return Major;
   }

   public void setmajor(String Major) {
      this.Major = Major;
   }

   // to print (all data)
   public String toString() {
      return "ID: " + id + "  Firstname: " + Firstname + "  Lastname: " + Lastname + "  Address = " + Address
            + "  Major =" + Major;
   }
}
