import java.util.*;

class Ticket extends Thread {
    int id;
    String type;
    int priority;

    Ticket(int id, String type, int priority) {
        this.id = id;
        this.type = type;
        this.priority = priority;
    }

    public void run() {
        long start = System.currentTimeMillis();
        System.out.println("Ticket " + id + " Type: " + type + " Started by " + getName() + " Priority: " + priority);
        try {
            int t = new Random().nextInt(5) + 1;
            Thread.sleep(t * 1000);
        } catch (Exception e) {}
        long end = System.currentTimeMillis();
        System.out.println("Ticket " + id + " Completed by " + getName() + " Time: " + (end - start));
    }

    public static void main(String[] args) {
        Ticket[] tickets = {
            new Ticket(1, "Critical Bug", 10),
            new Ticket(2, "Feature Request", 4),
            new Ticket(3, "General Query", 2),
            new Ticket(4, "Feedback", 1),
            new Ticket(5, "Critical Bug", 10),
            new Ticket(6, "General Query", 2),
            new Ticket(7, "Feature Request", 4),
            new Ticket(8, "Feedback", 1),
            new Ticket(9, "Critical Bug", 10),
            new Ticket(10, "General Query", 2)
        };

        for (Ticket t : tickets) {
            t.setPriority(t.priority);
            t.start();
        }
    }
}