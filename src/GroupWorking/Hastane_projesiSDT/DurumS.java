package GroupWorking.Hastane_projesiSDT;

public class DurumS {

    private String aktuelDurum;
    private boolean aciliyet;

    public DurumS() {
    }

    public String getAktuelDurum() {
        return aktuelDurum;
    }

    public void setAktuelDurum(String aktuelDurum) {
        this.aktuelDurum = aktuelDurum;
    }

    public boolean isAciliyet() {
        return aciliyet;
    }

    public void setAciliyet(boolean aciliyet) {
        this.aciliyet = aciliyet;
    }

    public DurumS(String aktuelDurum, boolean aciliyet) {
        this.aktuelDurum = aktuelDurum;
        this.aciliyet = aciliyet;
    }
}
