import java.time.LocalDate;
import java.time.LocalTime;
public class pruefungen{
  private int KNr;
  private int raum;
  private String pruefer;
  private int datumTag;
  private int datumMonat;
  private int datumJahr;
  private int anmeldefristTag;
  private int anmeldefristMonat;
  private int anmeldefristJahr;  
  private int uhrzeitH;
  private int uhrzeitMin;
  public pruefungen (int m, int r, String p, int dTag, int dMonat, int dJahr, int aTag, int aMonat, int aJahr, int uH, int uMin){
    KNr = m;
    raum = r;
    pruefer = p;
    datumTag = dTag;
    datumMonat = dMonat;
    datumJahr = dJahr;
    anmeldefristTag = aTag;
    anmeldefristMonat = aMonat;
    anmeldefristJahr = aJahr;
    uhrzeitH = uH;
    uhrzeitMin = uMin;
  }
  public void Kurs(){
    System.out.println("Kursnummer: " + KNr);
  }
  public void Raum(){
    System.out.println("Raum: " + raum);
  }
  public void Pruefer(){
    System.out.println("Prüfer: " + pruefer);
  }
  public void Datum(){
    System.out.println("Datum: " + datumTag + "." + datumMonat + "." + datumJahr);
  }
  public void Uhrzeit(){
    System.out.println("Uhrzeit: " + uhrzeitH + "." + uhrzeitMin + " Uhr");
  }
  public void Anmeldefrist(){
    if (anmeldefristTag==0||anmeldefristMonat==0) {
      System.out.println("keine Anmeldefrist");
    } else {
      System.out.println("Anmeldefrist bis: " + anmeldefristTag + "."+ anmeldefristMonat + "." + anmeldefristJahr);
    }
  }
  public String getKurs(){
    return String.valueOf(KNr);
  }
  public String getRaum(){
    return String.valueOf(raum);
  }
  public String getPruefer(){
    return pruefer;
  }
  public String getDatum(){
    return String.valueOf(datumTag)+"."+String.valueOf(datumMonat)+"."+String.valueOf(datumJahr);
  }
  public String getUhrzeit(){
    return uhrzeitH + "." + uhrzeitMin + " Uhr";
  }
  public String getAnmeldefrist(){
      return String.valueOf(anmeldefristTag) + "."+ String.valueOf(anmeldefristMonat) + "." + String.valueOf(anmeldefristJahr);
  }
  public boolean Schaltjahr() {
    if ((datumJahr/4)*4==datumJahr) {
      return true;
    } else {
      return false;
    }
  }
  public void Timer() {
    LocalDate heute = LocalDate.now();
    LocalTime jetzt = LocalTime.now();
    if (heute.getMonthValue()<datumMonat && heute.getDayOfMonth() < datumTag||heute.getYear()<datumJahr&&(heute.getDayOfMonth()<datumTag||heute.getMonthValue()+1<datumMonat||heute.getMonthValue()-1>datumMonat)||heute.getMonthValue()+1<datumMonat) {
      System.out.println("Noch über ein Monat bis zur Prüfung");
    } else {
      if (heute.getDayOfMonth()!=datumTag) {
        int d;
        if (heute.getMonthValue()==datumMonat) {
          d=datumTag-heute.getDayOfMonth();
        } 
        else {
          if (heute.getMonthValue()==1||heute.getMonthValue()==3||heute.getMonthValue()==5||heute.getMonthValue()==7||heute.getMonthValue()==8||heute.getMonthValue()==10||heute.getMonthValue()==12) {
            d=datumTag+(31-heute.getDayOfMonth());
          }
          else {
            if (heute.getMonthValue()==4||heute.getMonthValue()==6||heute.getMonthValue()==9||heute.getMonthValue()==11) {
              d=datumTag+(30-heute.getDayOfMonth());
            }
            else {
              if (Schaltjahr()==false) {
                d=datumTag+(28-heute.getDayOfMonth());
              } else {
                  d=datumTag+(29-heute.getDayOfMonth());
              }
            }  
          } 
        }       
        System.out.println("Noch " + d + " Tage bis zur Prüfung");
      } else {
        if (heute.getDayOfMonth()==datumTag&&uhrzeitH > jetzt.getHour()) {
          int s = uhrzeitH - jetzt.getHour();
          System.out.println("Noch " + s + " Stunden bis zur Prüfung");
        }else {
          if (heute.getDayOfMonth()==datumTag && uhrzeitH == jetzt.getHour()) {
            int m = uhrzeitMin - jetzt.getMinute();
            System.out.println("Noch " + m + " Minuten bis zur Prüfung");
          } else {
            System.out.println("Timer abgelaufen");
          } 
        }
      }
    } 
  }
  public String getTimer() {
    LocalDate heute = LocalDate.now();
    LocalTime jetzt = LocalTime.now();
    if (heute.getMonthValue()<datumMonat && heute.getDayOfMonth() < datumTag||heute.getYear()<datumJahr&&(heute.getDayOfMonth()<datumTag||heute.getMonthValue()+1<datumMonat||heute.getMonthValue()-1>datumMonat)||heute.getMonthValue()+1<datumMonat) {
      return "Noch über ein Monat bis zur Prüfung";
    } else {
      if (heute.getDayOfMonth()!=datumTag) {
        int d;
        if (heute.getMonthValue()==datumMonat) {
          d=datumTag-heute.getDayOfMonth();
        } 
        else {
          if (heute.getMonthValue()==1||heute.getMonthValue()==3||heute.getMonthValue()==5||heute.getMonthValue()==7||heute.getMonthValue()==8||heute.getMonthValue()==10||heute.getMonthValue()==12) {
            d=datumTag+(31-heute.getDayOfMonth());
          }
          else {
            if (heute.getMonthValue()==4||heute.getMonthValue()==6||heute.getMonthValue()==9||heute.getMonthValue()==11) {
              d=datumTag+(30-heute.getDayOfMonth());
            }
            else {
              if (Schaltjahr()==false) {
                d=datumTag+(28-heute.getDayOfMonth());
              } else {
                d=datumTag+(29-heute.getDayOfMonth());
              }
            }  
          } 
        }       
        return "Noch " + String.valueOf(d) + " Tage bis zur Prüfung";
      } else {
        if (heute.getDayOfMonth()==datumTag&&uhrzeitH > jetzt.getHour()) {
          int s = uhrzeitH - jetzt.getHour();
          return "Noch " + String.valueOf(s) + " Stunden bis zur Prüfung";
        }else {
          if (heute.getDayOfMonth()==datumTag && uhrzeitH == jetzt.getHour()) {
            int m = uhrzeitMin - jetzt.getMinute();
            return "Noch " + String.valueOf(m) + " Minuten bis Prüfungsbeginn";
          } else {
            return "Timer abgelaufen";
          } 
        }
      }
    } 
  }
}
