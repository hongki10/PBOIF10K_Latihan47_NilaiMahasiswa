/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Nilai Mahasiswa
 */
public class PBOIF10k10119915Latihan47 {

    public static void main(String[] args) {
        nilai nilai = new nilai();
        nilai.setQUIS(60.0f);
        nilai.setUTS(80.0f);
        nilai.setUAS(75.0f);
        

        System.out.println("QUIZ = " + nilai.getQUIS());
        System.out.println("UTS  = " + nilai.getUTS());
        System.out.println("UAS  = " + nilai.getUAS());
        System.out.println("");
        nilai.NA();
        System.out.println("");
        nilai.IndexdanKeterangan();
    }
}