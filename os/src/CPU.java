public class CPU extends Thread {
    int number;

    CPU(int number) {
        this.number = number;
        this.start();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("CPU is " + number);
    }
}
