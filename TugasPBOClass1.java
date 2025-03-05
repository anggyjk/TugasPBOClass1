import java.util.Scanner;

 class TugasPBOClass1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) {
            loginAdmin(scanner);
        } else if (pilihan == 2) {
            loginMahasiswa(scanner);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }

    private static void loginAdmin(Scanner scanner) {
        String adminUsername = "309";
        String adminPassword = "anggyjk";

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            System.out.println("Login Admin berhasil!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    private static void loginMahasiswa(Scanner scanner) {
        String namaMahasiswa = "Anggy Jogo Kurniawan";
        String nimMahasiswa = "202410370311389";

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        if (nama.equals(namaMahasiswa) && nim.equals(nimMahasiswa)) {
            System.out.println("Login Mahasiswa berhasil!");
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }
}
