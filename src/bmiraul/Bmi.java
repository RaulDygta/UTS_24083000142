/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmiraul;

/**
 *
 * @author Morganz
 */
public class Bmi {
    double bmi;  
    
    void getBmi(double beratbadan, double tinggibadan){
        double tinggipermeter = tinggibadan / 100;
        bmi = beratbadan / (tinggipermeter * tinggipermeter);
        
        System.out.println("BMI Anda: " +bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurang berat badan");
        } else if (bmi < 24.9) {
            System.out.println("Kategori: Berat badan normal");
        } else if (bmi < 29.9) {
            System.out.println("Kategori: Kelebihan berat badan");
        } else {
            System.out.println("Kategori: Obesitas");
}
}
}
