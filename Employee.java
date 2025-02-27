class Employee{
    
    String name;
    int year;
    float salary;
    String address;
    
    
    void Details(String name,int year,float salary,String address){
        this.name=name;
        this.year=year;
        this.salary=salary;
        this.address=address;

        System.out.println("Name=" +name);
        System.out.println("Year=" +year);
        System.out.println("Salary=" +salary);
        System.out.println("Address=" +address);
    }

    public static void main(String args[]){

        Employee e=new Employee();
        e.Details("Rahul",2025,50000.0f,"Pune");
        e.Details("abc",2025,40000.0f,"Pune");
        e.Details("def",2025,30000.0f,"mumbai");
    }
}