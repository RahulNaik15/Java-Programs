import java.io.*;

class fileRead{

    public static void main(String args[]){

        try{
            FileReader f=new FileReader("C:\\Users\\ADMIN\\Desktop\\Java-Programs\\File Handling\\Demo.txt");

            try{
                int i;
                while((i=f.read())!=-1){
                    System.out.print((char)i);
                }
            }

            finally{
                f.close();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

//other ways

//BufferedReader = instead of reading single character it reads the entire line 
// In this instead of read use readLine() method

// public static void main(String[] args) {
//         try {
//             BufferedReader reader = new BufferedReader(""); 
//             String line;
//             while ((line = reader.readLine()) != null) { // Read each line
//                 System.out.println(line);
//             }
//             reader.close(); // Close the reader
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }