public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Mac
        Mac mac = new Mac("Apple", 3, 16, "M1", "Li-ion", "Face ID");
        System.out.println("Data Mac:");
        mac.tampilMac();
        System.out.println();

        // Membuat objek dari kelas Pc
        Pc pc = new Pc("HP", 4, 32, "Intel i7", 24);
        System.out.println("Data Pc:");
        pc.tampilPc();
        System.out.println();

        // Membuat objek dari kelas Windows
        Windows windows = new Windows("Dell", 3, 16, "Intel i5", 5, "Cortana");
        System.out.println("Data Windows:");
        windows.tampilWindows();
    }
}