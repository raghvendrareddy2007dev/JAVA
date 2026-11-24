public class SmartCardApp {
    public static void main(String[] args) {
        StudentCard card = new StudentCard("S101", 500);

        Canteen.buy(card, 120);
        Canteen.buy(card, 1000);

        Gate.check(card, "LIBRARY");
        Gate.check(card, "STAFF ROOM");

        card.markPresent();
        System.out.println("Attendance: " + card.getAttendance());
    }
}