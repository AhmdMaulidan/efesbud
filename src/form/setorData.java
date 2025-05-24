/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author User
 */
public class setorData {
    public static ArrayList<String> tanggal = new ArrayList();
    public static ArrayList<String> namaEvent = new ArrayList();
    public static ArrayList<String> tempatDaerah = new ArrayList();
    public static ArrayList<String> nomorPonsel = new ArrayList();
    
   
        
    static void setData(String x, String y, String z){
        tanggal.add(x);
        namaEvent.add(y);
        tempatDaerah.add(z);
        nomorPonsel.add(nomorIndo());
    }
    
    static public String nomorIndo(){
        Random random = new Random();
        String countryCode = "62";
        String firstDigit = "8";
        StringBuilder nomorPonsel = new StringBuilder();
        nomorPonsel.append(countryCode).append(firstDigit);
        
        for (int i = 0; i < 10; i++) {
            int digit = random.nextInt(10);
            nomorPonsel.append(digit);
        }
        return nomorPonsel.toString();   
    } 
}
