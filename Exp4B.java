 public class Exp4B
{
    String name;
    int rollNo;
    String className;
    boolean isFromCity;
    
    Exp4B(String name, int rollNo)
    {
        this.name = name;
        this. rollNo = rollNo;
    }
    
    Exp4B(String name, int rollNo, String className, boolean isFromCity)
    {
        this.name = name;
        this. rollNo = rollNo;
        this.className = className;
        this.isFromCity = isFromCity;        
    }
    
    public void studentData()
    {
        System.out.println("Name of Student = " + name);
        System.out.println("Roll no = "+ rollNo);
        System.out.println("Class Name = "+ className);
        System.out.println("Is student belongs to city = "+ isFromCity);
    }
    
    public static void main (String arg[])
    {
       // Creating object and providing some values by using parameterized constructor
        
        Exp4B student1 = new Exp4B("Dikshant Buwa", 04, "CSE(DS)", true);
        student1.studentData();
        
        Exp4B student2 = new Exp4B("Abbasali Agharia", 01, "CSE(DS)", true);
        student2.studentData();
        
    }    
}

