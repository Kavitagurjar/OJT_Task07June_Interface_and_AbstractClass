import java.util.Scanner;

interface Client {
    void input(); // public abstract by default
    void output();
}

class Kavita implements Client {
    String name;
    double sal;

    public void input() {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter Username:");
        name = k.nextLine();
        System.out.println("Enter Salary:");
        sal = k.nextDouble();
        k.close(); // Closing the scanner after use
    }

    public void output() {
        System.out.println("Client name is " + name + " and Salary: " + sal);
    }

    public static void main(String[] args) {
        Client obj = new Kavita();
        obj.input();
        obj.output();
    }
}
