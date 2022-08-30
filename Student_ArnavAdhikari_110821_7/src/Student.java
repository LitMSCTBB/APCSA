
public class Student {
   private String name;
   private String email;
   private int id;
   
   public Student() {}
   
   public Student(int id) { this.id = id; }

   public Student(String name, String email, int id)
   {
      this.name = name; this.email = email; this.id = id;
   }

   public String toString()
   {
     return id + ": " + name + ", " + email;
   }
}
