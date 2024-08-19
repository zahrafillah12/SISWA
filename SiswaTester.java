//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat objek
        //namaClass namaObjek = new Constructor();
        Siswa Bella = new Siswa();
        Siswa Zahra = new Siswa();
        Siswa Nasya = new Siswa();
        Siswa Lia = new Siswa();
        Siswa Sativa = new Siswa();

        Bella.id = 05;
        Bella.nama = "Bella";
        Bella.ipk = 92;
        Zahra.id = 35;
        Zahra.nama = "Zahra";
        Zahra.ipk = 95;
        Nasya.id = 26;
        Nasya.nama ="Nasya";
        Nasya.ipk = 93;
        Lia.id = 06;
        Lia.nama ="Lia";
        Lia.ipk = 92;
        Sativa.id = 31;
        Sativa.nama ="Sativa";
        Sativa.ipk = 95;
        
        Bella.print();
        Zahra.print();
        Nasya.print();
        Lia.print();
        Sativa.print();
    }
}