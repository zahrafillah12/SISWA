//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat objek
        //namaClass namaObjek = new Constructor();
        Siswa Bella = new Siswa(5,  "Bella", 90);
        Siswa Zahra = new Siswa(35, "Zahra", 95);
        Siswa Nasya = new Siswa(26, "Nasya", 93);
        Siswa Lia = new Siswa(6, "Lia", 92);
        Siswa Sativa = new Siswa(31, "Sativa", 95);

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