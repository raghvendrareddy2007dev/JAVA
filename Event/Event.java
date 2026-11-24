abstract class Event
{
    private String name;
    private  final int maxseats;
    private int seatsfilled;
    private int totalregistration;
    private final String  festname="kmit_fest";
    Event(String name ,int maxseats){
        this.name=name;
        this.maxseats=maxseats;
    }
    void register(String participant ,boolean iskmit){
        if(seatsfilled>=maxseats){
            System.out.println("Registration failed"+name);
        }else{
            seatsfilled++;
            totalregistration++;
            System.out.println("Registration succesfull");
        }
        double fee=calculatefee(iskmit);
    }
    void register(String participant){
        register(participant,false);
    }
    abstract double calculatefee(boolean iskmit);
    void showdetails(){
        System.out.println("Eventname :"+name+"seatsfilled :"+seatsfilled+"maxseats :"+maxseats);
    }
    String getname(){
        return name;
    }
    int gettotalregistrations(){
        return totalregistration;
    }
    int setseatsfilled(){
        return maxseats-seatsfilled;
    }
    abstract void issuecertificate(String participant);
    
}