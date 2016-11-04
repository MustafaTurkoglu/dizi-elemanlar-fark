/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziler;

/**
 *
 * @author mustafa
 */
public class Diziler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fark;
        int en_kucuk_fark = 100;
        int[] dizi = new int[3];        
        dizi[0] = 3;
        dizi[1] = 6;
        dizi[2] = 1;
        
        System.out.println(ardısık_en_kucuk(dizi));        
        System.out.println(kombinasyonlu_en_kucuk_fark(dizi));
    }
    
    static int ardısık_en_kucuk(int[] dizi) {
        int fark;
        int en_kucuk_fark = 10000;
        
        
        for (int i = 0; i < dizi.length - 1; i++) {
            fark = dizi[i] - dizi[i + 1];
            if (Math.abs(fark) < en_kucuk_fark) {
                en_kucuk_fark = Math.abs(fark);
            }
            
        }
        
        return en_kucuk_fark;
    }

    static int kombinasyonlu_en_kucuk_fark(int[] dizi) {
        
        int fark;
        int en_kucuk_fark = 100;
        
        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                
                fark = dizi[i] - dizi[j];
                if (Math.abs(fark) < en_kucuk_fark) {
                    en_kucuk_fark = Math.abs(fark);
                }
            }
            
        }
        return en_kucuk_fark;
    }
    
}
