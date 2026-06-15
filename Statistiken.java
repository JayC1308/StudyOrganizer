import java.util.ArrayList;
public class Statistiken {
  private static int benoetigtePunkte = 180;
  private static int erreichtePunkte = 0;
  
  public static int berechnen(ArrayList kurs){
    for (int i = 0; i < kurs.size() ; i++ ) {
      Kurs kurse = kurs.get(i);
      erreichtePunkte += kurse.getPunkte();
    } // end of for
    return erreichtePunkte;
  }
  
  public static void setBenoetigtePunkte(int punkte){
    this.erreichtePunkte = punkte; 
  }
  
  public static void getBenoetigtePunkte(){
    return benoetigtePunkte;
  }

}