package studentPractice01.sinavOturum;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DosyaOkuma {
    public static Map<String,String> dersveKodlariniOkuma() throws IOException {
        Map<String,String> dersveKodlari=new HashMap<>();
        BufferedReader reader =new BufferedReader(new FileReader("studentPractice01/sinavOturum/courses.csv"));
        String line="";
        while((line= reader.readLine())!=null ){

        }


        return dersveKodlari;
    }

}
