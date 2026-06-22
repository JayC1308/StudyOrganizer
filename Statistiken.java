import java.util.ArrayList;
public class Statistiken {
  private static int benoetigtePunkte = 180;
  private static int erreichtePunkte = 0;
  private static int[] berechnen = new int[2];
  
  public static int[] berechnen(ArrayList kurse){
    for (int i = 0; i < kurse.size() ; i++ ) {
      Kurs kurs = kurse.get(i);
      erreichtePunkte += kurs.getEcts();
    } // end of for
    berechnen[0] = erreichtePunkte;
    berechnen[1] = (erreichtePunkte / benoetigtePunkte) * 100;
    return berechnen;
  }
  
  public static void setBenoetigtePunkte(int punkte){
    erreichtePunkte = punkte; 
  }
  
  public static int getBenoetigtePunkte(){
    return benoetigtePunkte;
  }

}