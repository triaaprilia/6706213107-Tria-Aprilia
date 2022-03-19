public class Pegawai {
    String NIP;
    String Nama;
    String Divisi;

    public Pegawai(String NIP, String Nama, String Divisi) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Divisi = Divisi;
    }
    public String getNIP() {
        return NIP;
    }
    @Override
    public String toString() {
        return "NIP='" + NIP + '\'' +
                ",Nama='" + Nama + '\'' +
                ",Divisi='" + Divisi + '\'';
    }
}