/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pbo;
/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * Kelas    : IF-1
 * NIM      : 10119036
 * Deskripsi Program :
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CustomerInvoice {

    static Date date = new Date();
    static Locale lokal = Locale.forLanguageTag("id");
    static SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", lokal);

    private static void tampilWaktu(){
        System.out.println("Date Transaction : " + formatter.format(date));
    }
 
    public static void main(String[] args) {
        tampilWaktu();
    }
}
