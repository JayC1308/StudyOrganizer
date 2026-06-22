public class main {
  public static void main(String [] args)  {
    Kurs hoehereMathematik = new Kurs("Höhere Mathematik", 30, 0, "Nils", "Nils@Steiner.Stein", 1, "Vorlesung", "49","altes","Dienstag", "19:00" );
    hoehereMathematik.ausgabe();
    Ansprechpartnerinnen ElCheffe = new Ansprechpartnerinnen("Herr Seibt", "Chef", "sei@agh-hbg.de", "01756769", "212");
    pruefungen erstePrüfung = new pruefungen(10, 204, "Herr Seibt", 26, 1, 2100, 25,1,2099, 10,10);
    erstePrüfung.Timer();
    
  }
}