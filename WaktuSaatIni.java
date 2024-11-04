
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class WaktuSaatIni {
    public static void main(String[] args) {
        // Create Date object for current date/time
        Date currentDate = new Date();
        
        // Create formatter for the date
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        
        // Set timezone to your location (change "Asia/Jakarta" as needed)
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Jakarta"));
        
        // Format and display the date
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Hari ini adalah hari : " + formattedDate);
    }
}
