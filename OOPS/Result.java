// Task: Create a class Student with fields name and marks (array of 3 subjects).
// Use a constructor to initialize the student's name and marks.
// Create a method calculateTotalMarks() to return the total marks.
// Create a method displayDetails() to display the name, marks, and total.

class Student{

    String name;
    int [] marks;

    Student(String n, int [] m){
     
     name=n;
     marks=m;
    }

    int calculateTotalMarks(){
        
        int total=0;
        for (int i=0;i<marks.length;i++){

            total+=marks[i];
        }
        return total;
    }

    void displayDetails(){
        
        int result=calculateTotalMarks();
        System.out.print("Name=" +name);
        for(int i=0;i<marks.length;i++){
          System.out.print("Marks=" +marks[i]);
        }
        System.out.print("Total=" +result);
    }
}

class Result{

    public static void main(String args[]){
        
        int [] marks={50,60,70};
        Student s=new Student("Rahul",marks);
        s.displayDetails();
    }
}