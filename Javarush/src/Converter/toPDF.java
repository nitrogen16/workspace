package Converter;

import java.io.File;
import java.io.FileOutputStream;

import sun.misc.BASE64Decoder;
/**
 * Kax7ux
 *
 */
@SuppressWarnings("restriction")
public class toPDF 
{
    public static void main( String[] args )
    {     
        String encodedBytes = "yourStringBase64"; 
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] decodedBytes;
            FileOutputStream fop;
            decodedBytes = new BASE64Decoder().decodeBuffer(encodedBytes);
            File file = new File("C:\\Users\\Viachaslau_Amelin\\Desktop\\sample.pdf");
            fop = new FileOutputStream(file);

            fop.write(decodedBytes);

            fop.flush();
            fop.close();
            System.out.println("Created");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}