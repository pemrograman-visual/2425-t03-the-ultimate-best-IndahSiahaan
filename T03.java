// 12S24052 - Indah Triyuni Siahaan
// 12S24007 - Dasmauli Sormin

import java.util.*;
import java.lang.Math;

public class  T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;
        String judul;
        String penulis;
        int tahunTerbit;
        String penerbit;
        String formatBukuElektronik;
        double hargaPembelian;
        double minimumMargin;
        int stok;
        double rating;
        String kategori;
        String kategoriDiskon;
        String kategoriBuku;

        do {
            iSBN = input.nextLine();
            if (!iSBN.equals("---")) {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunTerbit = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                formatBukuElektronik = input.nextLine();
                hargaPembelian = Double.parseDouble(input.nextLine());
                minimumMargin = Double.parseDouble(input.nextLine());
                if (minimumMargin > 0) {
                    kategoriDiskon = "---";
                } else {
                    if (minimumMargin <= -(hargaPembelian * 40 / 100)) {
                        kategoriDiskon = "Once in a lifetime";
                    } else {
                        if (minimumMargin <= -(hargaPembelian * 20 / 100)) {
                            kategoriDiskon = "Never come twice";
                        } else {
                            kategoriDiskon = "No regret";
                        }
                    }
                }
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (rating >= 4.7 && rating <= 5) {
                    kategori = "Best Pick";
                } else {
                    if (rating >= 4.5 && rating < 4.7) {
                        kategori = "Must Read";
                    } else {
                        if (rating >= 4.0 && rating < 4.5) {
                            kategori = "Recommended";
                        } else {
                            if (rating >= 3.0 && rating < 4.0) {
                                kategori = "Average";
                            } else {
                                kategori = "Low";
                            }
                        }
                    }
                }
                if (kategoriDiskon.equals("Once in a lifetime") && kategori.equals("Best Pick")) {
                    kategoriBuku = "The ultimate best";
                } else {
                    kategoriBuku = "---";
                }
                System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektronik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kategori + "|" + kategoriDiskon + "|" + kategoriBuku);
            }
        } while (!iSBN.equals("---"));
    }
}
