package latihan;

import java.util.Scanner;


public class Latihan1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Deklarasi Variabel
        float r;
        float jumlahKehadiran;
        float nilaiTugas;
        float nilaiUts;
        float nilaiUas;

        float presensi;
        float tugas;
        float uts;
        float uas;
        float total;

        //Statement 1
        System.out.println("Masukkan Jumlah Realisasi : ");
        r = input.nextFloat();

        System.out.println("Masukkan Jumlah Kehadiran : ");
        jumlahKehadiran = input.nextFloat();

        System.out.println("Masukkan Nilai tugas : ");
        nilaiTugas = input.nextFloat();

        System.out.println("Masukkan Nilai UTS : ");
        nilaiUts = input.nextFloat();

        System.out.println("Masukkan nilai UAS : ");
        nilaiUas = input.nextFloat();

        //Process
        presensi = jumlahKehadiran  / r * 10;
        tugas = nilaiTugas * 20 / 100;
        uts = nilaiUts * 30 / 100;
        uas = nilaiUas * 40 / 100;
        total = presensi + uts + uas + tugas ;

        //Statement 2
        System.out.println("Nilai Presensi : " + presensi);
        System.out.println("Nilai Tugas : " + tugas);
        System.out.println("Nilai UTS : " + uts);
        System.out.println("Nilai UAS : " + uas);
        System.out.print("Nilai Akhir Mahasiswa = " + total);
    }


}
