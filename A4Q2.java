class College   // base class
{   public void methodCollege()
   {
      System.out.println("method of Class Students");
   }
   
    public void methodCollege1()
   {
      System.out.println("method of Class Faculties");
   }
   
   public void methodCollege2()
   {
      System.out.println("method of Class Laboratories");
   }
}
class Students extends College							// sub class 1
{
   public void methodStudents()
   {
      System.out.println("method of Class Students");
   }
}
class Faculties extends College							// sub class 2
{
  public void methodFaculties()
  {
     System.out.println("method of Class Faculties");
  }
}
class Laboratories extends College						// sub class 3
{
  public void methodLaboratories()
  {
     System.out.println("method of Class Laboratories");
  }
}
class A4Q2
{	public static void main(String args[])
	{
     Students obj1 = new Students();
     Faculties obj2 = new Faculties();
     Laboratories obj3 = new Laboratories(); 	//All classes can access the method of class College
     obj1.methodCollege();
     obj2.methodCollege1();
     obj3.methodCollege2();
  }
}