class TicketBooking{

    int total_seat=10;
    synchronized public void book(int seat){

        if(total_seat>=seat){
            System.out.println("Seats Booked Successfully");
            total_seat=total_seat-seat;
            System.out.println("Total Seats=" +total_seat);
        }
        else{
           System.out.println("Seats Cannot booked"); 
           System.out.println("Total Seats=" +total_seat);
        }
    }
}

class synchronizedMethod extends Thread{

    static TicketBooking t;

    int seat;
    public void run(){
    t.book(seat);
    }


    public static void main(String args[])  {

        t=new TicketBooking();

        synchronizedMethod m1=new synchronizedMethod();
        m1.seat=7;
        m1.start();

        synchronizedMethod m2=new synchronizedMethod();
        m2.seat=6;
        m2.start();

        
    }
}