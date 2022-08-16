package Hastane_projesi;

public class HastaneRunner {
    public static void main(String[] args) {

        String hastaDurumu = "";
        String unvan = "";
    }
    public static String doktorUnvan(String aktuelDurum){
        switch (aktuelDurum){
            case "Alerji" :return "Alerji Doktoru";
            case "Bas Agrisi" :return "Noroloji Doktoru";



            default: return  "Yanlis Unvan";
        }



    }

}
