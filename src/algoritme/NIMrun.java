package algoritme;

import java.util.Scanner;

public class NIMrun {
    public void NIMRun() {
    }

    public static void main(String[] var0) {
        String var1 = "";
        Scanner var2 = new Scanner(System.in);
        System.out.print("Masukkan NIM anda : ");
        var1 = var2.next();
        NIM var3 = new NIM(var1);
        System.out.println("NIM : " + var1);
        System.out.println("Jenjang Pendidikan : " + var3.jenjangPendidikan());
        System.out.println("Angkatan : " + var3.angkatan());
        System.out.println("Fakultas : " + var3.fakultas());
        System.out.println("Prodi : " + var3.prodi());
        System.out.println("Jenis Kelamin : " + var3.jenisKelamin());
        System.out.println("No Unik : " + var3.noUnik());
    }
}


