import java.util.*;

interface Printer {
    void print(String data);
}

interface ScannerDevice {
    void scan(String document);
}

class MultiFunctionMachine implements Printer, ScannerDevice {

    public void print(String data) {
        System.out.println("Printing " + data);
    }

    public void scan(String document) {
        System.out.println("Scanning " + document);
    }

    void copy(String document) {
        System.out.println("Copying " + document);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();

        m.print("Report");
        m.scan("Contract");
        m.copy("Invoice");
    }
}