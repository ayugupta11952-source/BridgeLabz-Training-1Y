class Entry extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Entry Monitoring: " + getState());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}

class Paper extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
        System.out.println("Question Paper Distributed: " + getState());
    }
}

class Attendance extends Thread {
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {}
        System.out.println("Attendance Marked: " + getState());
    }
}

class Collection extends Thread {
    public void run() {
        try {
            Thread.sleep(15000);
        } catch (Exception e) {}
        System.out.println("Sheets Collected: " + getState());
    }
}

public class ExamHall {
    public static void main(String[] args) {
        Entry e = new Entry();
        Paper p = new Paper();
        Attendance a = new Attendance();
        Collection c = new Collection();

        p.setPriority(10);
        a.setPriority(8);
        e.setPriority(5);
        c.setPriority(7);

        e.start();
        p.start();
        a.start();
        c.start();
    }
}