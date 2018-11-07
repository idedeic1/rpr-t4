package ba.etf.unsa;

public class Predmet {
  private String naziv;
  private double brojETCS;
  private int semestar;
  private int[100] spisakUpisanih;
  private boolean jeLiIzborni;

  public String dajNaziv(){};
  public double dajETCS(){};
  public int dajSemestar() {};
  public Predmet(){};
  public Predmet(String naziv, double brojETCS, int semestar){};
  void dodajStudenta(int brojIndeksa){};
}
