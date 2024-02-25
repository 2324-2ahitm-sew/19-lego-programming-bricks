package at.htl.lego.solution.oobasics.bsp003;

class Schueler {
    private String name;
    private int alter;
    private int schulstufe;
    private int iq;
    private int hunger;


    //region getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getSchulstufe() {
        return schulstufe;
    }

    public void setSchulstufe(int schulstufe) {
        this.schulstufe = schulstufe;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    //endregion

    //region "Business"-Methoden
    void chillen() {
        System.out.println("Jo Bro, ich chill hier!");
        setIq(getIq() - 1);
    }

    void essen() {
        System.out.println("Ich ess jetzt was!");
        setHunger(getHunger() - 1);
    }

    void lernen() {
        System.out.println("Ich lerne jetzt!");
        setIq(getIq() + 1);
    }
    //endregion

}
