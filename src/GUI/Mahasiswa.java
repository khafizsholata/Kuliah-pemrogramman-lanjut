package GUI;
public class Mahasiswa {
    private String nama;
    private String nim;
    private String jenjangpendidikan;
    private String tahunmasuk;
    private String fakultas;
    private String jurusan;
    private String jeniskelamin;
    private String urutan;


    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.jenjangpendidikan = jenjangpendidikan;
        this.tahunmasuk = tahunmasuk;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
        this.jeniskelamin = jeniskelamin;
        this.urutan = urutan;
    }
    // Jenjang Pendidikan
    public String jenjangPendidikan() {
        String jenjang = this.nim.substring(0, 1);
        // Jenjang
        if (jenjang.equalsIgnoreCase("1")) {
            return "S1 (Sarjana)";
        }else if (jenjang.equalsIgnoreCase("2")) {
            return "S2 (Magister)";
        }else if (jenjang.equalsIgnoreCase("3")) {
            return "S3 (Doktor)";
        }
        return "unknow";
    }

    //Tahun Masuk
    public String tahunmasuk() {
        if (this.nim.substring(1,3).equalsIgnoreCase("18")) {
            return "2018";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("19")) {
            return "2019";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("20")) {
            return "2020";
        }else {
            return " unknow";
        }
    }

    // Nama Fakultas
    public String fakultas() {
        String fac =  this.nim.substring(3,4);
        if (fac.equalsIgnoreCase("1")) {
            return "FAKULTAS TARBIYAH dan KEGURUAAN";
        }else if (fac.equalsIgnoreCase("2")) {
            return "FAKULTAS  SYARI'AH dan HUKUM";
        }else if (fac.equalsIgnoreCase("3")) {
            return "FAKULTAS USHULUDIN";
        }else if (fac.equalsIgnoreCase("4")) {
            return "FAKULTAS DAKWAH dan KOMUNIKASI";
        }else if (fac.equalsIgnoreCase("5")) {
            return "FAKULTAS SAINS dan TEKNOLOGI";
        }else if (fac.equalsIgnoreCase("6")) {
            return "PSIKOLOGI";
        }else if (fac.equalsIgnoreCase("7")) {
            return "FAKULTAS EKONOMI dan ILMU SOSIAL";
        }else if (fac.equalsIgnoreCase("8")) {
            return "FAKULTAS PERTANIAN dan PERTENAKAN";
        }else {
            return "unknow";
        }
    }

    // Nama Jurusan
    public String  jurusan() {
        if (this.nim.substring(4, 6).equalsIgnoreCase("01")) {
            return "Teknik Informatika";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("02")) {
            return "Teknik Industri";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("03")) {
            return "Sistem Informasi";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("04")) {
            return "Matematika";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("05")) {
            return "Teknik Elektro";
        }
        return "unknow";
    }

    //Jenis kelamin
    public String jenisKelamin() {
        if (this.nim.substring(6, 7).equalsIgnoreCase("1")) {
            return "Laki-Laki";
        }else if (this.nim.substring(6, 7).equalsIgnoreCase("2")){
            return "Perempuan";
        }
        return "unknow";
    }

    public String urutan() {
        return this.nim.substring(7,11);
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjangpendidikan() {
        return jenjangpendidikan;
    }

    public void setJenjangpendidikan(String jenjangpendidikan) {
        this.jenjangpendidikan = jenjangpendidikan;
    }

    public String getTahunmasuk() {
        return tahunmasuk;
    }

    public void setTahunmasuk(String tahunmasuk) {
        this.tahunmasuk = tahunmasuk;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getUrutan() {
        return urutan;
    }

    public void setUrutan(String urutan) {
        this.urutan = urutan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                ", jenjangpendidikan='" + jenjangpendidikan + '\'' +
                ", tahunmasuk='" + tahunmasuk + '\'' +
                ", fakultas='" + fakultas + '\'' +
                ", jurusan='" + jurusan + '\'' +
                ", jeniskelamin='" + jeniskelamin + '\'' +
                ", urutan='" + urutan + '\'' +
                '}';
    }
}
