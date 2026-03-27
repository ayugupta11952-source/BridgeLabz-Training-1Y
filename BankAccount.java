class BankAccount implements Runnable {
    String name;
    int priority;

    BankAccount(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " checking balance | Priority: " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        Thread premium = new Thread(new BankAccount("Premium User", 10));
        Thread regular = new Thread(new BankAccount("Regular User", 5));
        Thread basic = new Thread(new BankAccount("Basic User", 1));

        premium.setPriority(10);
        regular.setPriority(5);
        basic.setPriority(1);

        premium.start();
        regular.start();
        basic.start();
    }
}