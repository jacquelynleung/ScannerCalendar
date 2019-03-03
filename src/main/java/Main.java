import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class Main {
    public static void main(String []args) {
        Tesseract tesseract = new Tesseract();
        try {
            tesseract.setDatapath("/Users/jleung00/Desktop/ScannerCalendar/tessdata");
            String text = tesseract.doOCR(new File("/Users/jleung00/Desktop/test2.png"));
            System.out.print(text);

        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }

//    public String[] sort(String category, String text){
//        String lines[] = text.split("\\r?\\n");
//
//        if(category == "class"){
//            return lines;
//        } else if(category == "assignments"){
//
//
//        } else if(category == "assessments"){
//
//        } else if(category == "date"){
//
//        }
//    }
}
