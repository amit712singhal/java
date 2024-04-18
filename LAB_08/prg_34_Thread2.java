//WAP & Create a class "salesperson" as a thread that will display a salesperson name. Create a class "days" as other thread that has array of 7 days. Call the instance of "salesperson" in "days" and start both the threads. Suspend the sales person on Sunday & resume on Wednesday. We can only use suspend and resume methods from the thread only.

package LAB_08;

class SalesPerson extends Thread {
    public String name;

    public SalesPerson(String n) {
        this.name = n;
    }

    public void run() {
        System.out.println("Sales_Person " + name + " reporting for duty.");
        System.out.println();
    }
}

class Days extends Thread {
    String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    SalesPerson salesPerson;

    public Days(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }

    public void run() {
        for (String day : days) {
            if (day.equals("Sunday")) {
                System.out.println("Sales_Person " + salesPerson.name + " suspended shop on : " + day);
                // salesPerson.suspend();
            } else if (day.equals("Monday") || day.equals("Tuesday")) {
                continue;
            } else if (day.equals("Wednesday")) {
                System.out.println("Sales_Person " + salesPerson.name + " resumed shop on : " + day);
            } else {
                System.out.println("Sales_Person " + salesPerson.name + " continued shop on : " + day);
            }
        }
    }
}

public class prg_34_Thread2 {
    public static void main(String args[]) throws Exception {
        System.out.println();
        SalesPerson SP = new SalesPerson("Amit");
        Days DP = new Days(SP);
        SP.start();
        DP.start();
        SP.join();
        DP.join();
        System.out.println();
    }
}
