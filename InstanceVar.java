public class InstanceVar
{   //Instance varaible are also know as non static varaibles
    int Id ;
    String name;
    String Course;                                              // Instance varaibles declared within the class outside the method
    static String College = " VR Siddharhta";                  // Static Varaible will be declared with static keyword
    
    public InstanceVar(int i, String n, String c){
        Id = i;                                                // Local Varaibles 
        name = n;                   
        Course = c;
    }
    public void display(){
        System.out.println("Details of Student ------> " + name);
        System.out.println("Student Id is : " + Id);                // Declaration Method and Printing the Details of Student
        System.out.println("Course Opted is: " + Course);
        System.out.println("From College " + College);
    }
    public static void main(String[] args) {
        //new InstanceVar(1 , "Varun", " Java").display();
        InstanceVar var = new InstanceVar( 2, "Varun kumar", " Java Full Stack");
        InstanceVar ob = new InstanceVar(5, "Pavan ", "Python");
        var.display();
        ob.display();
        System.out.println(InstanceVar.College);                    // Accessing the Static varaible using class name or object reference varaibles
}
} 