public class Kurs {

  private String name;
  private int KNr;
  private int ects;
  private String dozent;
  private String emailDozent;
  private int semester;
  private String vorlesungsart;
  private String raum;
  private String gebaeude;
  private String wochentag;
  private String uhrzeit;

  public Kurs(String name, int KNr, int ects, String dozent, String emailDozent,
  int semester, String vorlesungsart, String raum, String gebaeude,
  String wochentag, String uhrzeit) {
    this.name = name;
    this.KNr = KNr;
    this.ects = ects;
    this.dozent = dozent;
    this.emailDozent = emailDozent;
    this.semester = semester;
    this.vorlesungsart = vorlesungsart;
    this.raum = raum;
    this.gebaeude = gebaeude;
    this.wochentag = wochentag;
    this.uhrzeit = uhrzeit;
  }
  
  public void ausgabe() {
    System.out.println("=== Kursinformationen ===");
    System.out.println("Name: " + name);
    System.out.println("Kursnummer: " + kNr);
    System.out.println("ECTS: " + ects);
    System.out.println("Dozent: " + dozent);
    System.out.println("E-Mail Dozent: " + emailDozent);
    System.out.println("Semester: " + semester);
    System.out.println("Vorlesungsart: " + vorlesungsart);
    System.out.println("Raum: " + raum);
    System.out.println("Gebäude: " + gebaeude);
    System.out.println("Wochentag: " + wochentag);
    System.out.println("Uhrzeit: " + uhrzeit);
    System.out.println("=========================");
    
  }
  
  public String getName() {
    return name;
  }

  public int getKNr() {
    return kNr;
  }

  public int getEcts() {
    return ects;
  }

  public String getDozent() {
    return dozent;
  }

  public String getEmailDozent() {
    return emailDozent;
  }

  public int getSemester() {
    return semester;
  }

  public String getVorlesungsart() {
    return vorlesungsart;
  }

  public String getRaum() {
    return raum;
  }

  public String getGebaeude() {
    return gebaeude;
  }

  public String getWochentag() {
    return wochentag;
  }

  public String getUhrzeit() {
    return uhrzeit;
  }

