
public class Student {
    static String school_name="ABC";
    String name;
    int roll_no;
    //constuctor
    Student(String n,int r){
        name=n;
        roll_no=r;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("roll no:"+roll_no);
    }
    public static void main(String[] args){
       System.out.println("roll_no:"+Student.school_name);
       Student s1=new Student("rohan:",12);
       Student s2=new Student("mohan:",13);
       s1.display();
       s2.display();
       
} 
}   
