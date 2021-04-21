package algoritme;

public class NIM {
    private String nim;

    public NIM(String var1) {
        this.nim = var1;
    }

    public String jenjangPendidikan() {
        String var1 = this.nim.substring(0, 1);
        if (var1.equalsIgnoreCase("1")) {
            return "S1 (Sarjana)";
        } else if (var1.equalsIgnoreCase("2")) {
            return "S2 (Magister)";
        } else {
            return var1.equalsIgnoreCase("2") ? "S3 (Doktor)" : "NOT FOUND";
        }
    }

    public String angkatan() {
        if (this.nim.substring(1, 3).equalsIgnoreCase("18")) {
            return "2018";
        } else if (this.nim.substring(1, 3).equalsIgnoreCase("19")) {
            return "2019";
        } else {
            return this.nim.substring(1, 3).equalsIgnoreCase("20") ? "2020" : "NOT FOUND";
        }
    }

    public String fakultas() {
        String var1 = this.nim.substring(3, 4);
        if (var1.equalsIgnoreCase("5")) {
            return "Fakultas Teknik";
        } else if (var1.equalsIgnoreCase("1")) {
            return "Fakultas Ekonomi";
        } else if (var1.equalsIgnoreCase("2")) {
            return "Fakultas MIPA";
        } else {
            return var1.equalsIgnoreCase("3") ? "Fakultas Hukum" : "NOT FOUND";
        }
    }

    public String prodi() {
        if (this.nim.substring(4, 6).equalsIgnoreCase("01")) {
            return "Prodi Teknik Informatika";
        } else if (this.nim.equalsIgnoreCase("02")) {
            return "Prodi Teknik Industri";
        } else {
            return this.nim.equalsIgnoreCase("02") ? "Sistem Informasi" : "NOT FOUND";
        }
    }

    public String jenisKelamin() {
        if (this.nim.substring(6, 7).equalsIgnoreCase("1")) {
            return "Laki-Laki";
        } else {
            return this.nim.equalsIgnoreCase("2") ? "Perempuan" : "NOT FOUND";
        }
    }

    public String noUnik() {
        return this.nim.substring(7, 11);
    }
}
