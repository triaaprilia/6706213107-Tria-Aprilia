import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<Pegawai> linkedlist = new SinglyLinkedList<>();
        Scanner input = new Scanner(System.in);
        String subJawaban;
        String jawaban;

        for (int i = 0; i <= 4; i++) {
            System.out.println("1. Input Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cetak List Pegawai");
            System.out.println("4. Keluar");
            int angka = input.nextInt();

            if (angka == 1) {
                System.out.println("Masukkan Data");
                System.out.println("Masukkan NIP, Nama, dan Divisi");
                String NIP = input.next();
                String Nama = input.next();
                String Divisi = input.next();

                System.out.println("Tambahkan data di awal list (y/n)");
                jawaban = input.next();

                Pegawai listPegawai = new Pegawai(NIP, Nama, Divisi);

                if (input.next().equalsIgnoreCase("y")) {
                    linkedlist.insertAtFront(listPegawai);
                } else if (input.next().equalsIgnoreCase("n")){
                    linkedlist.insertAtBack(listPegawai);
                }
            } else if (angka == 2) {
                System.out.println("Hapus data di awal list (y/n)");
                subJawaban = input.next();

                if (input.next().equalsIgnoreCase("y")) {
                    linkedlist.removeFromFront();
                } else if (input.next().equalsIgnoreCase("n")) {
                    linkedlist.removeFromBack();
                }
            } else if (angka == 3) {
                linkedlist.print();
            } else if (angka == 4) {
                break;
            }
        }
    }
}
