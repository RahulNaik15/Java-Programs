class NPE{

    public static void main(String args[]){

        String name=null;
        try{
            System.out.println(name.toUpperCase());
        }

        catch(Exception e){

            System.out.println("Cannot modify null value");
        }
    }
}