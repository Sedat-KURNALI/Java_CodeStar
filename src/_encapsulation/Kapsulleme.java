package _encapsulation;

public class Kapsulleme {
    //private ile elemanlarimi tanimladim.  $3dA+Kurnal1  E:\PostgreSQL\dvdrental.tar
    private String arac_marka;
    private String model;
    private int arac_yas;
    private boolean varMi;
    //get ve set metodlari ile erisimleri sagladik.


    public boolean isVarMi() {
        return varMi;
    }

    public void setVarMi(boolean varMi) {
        this.varMi = varMi;
    }

    public String getArac_marka() {
        return arac_marka;
    }

    public void setArac_marka(String arac_marka) {
        this.arac_marka = arac_marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getArac_yas() {
        return arac_yas;
    }

    public void setArac_yas(int arac_yas) {
        this.arac_yas = arac_yas;
    }
}
