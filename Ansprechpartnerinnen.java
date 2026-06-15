public class Ansprechpartnerinnen {
  private String Name;
  private String Funktion;
  private String Email;
  private String Telefon;
  private String Buero;
  
  public Ansprechpartnerinnen(String Name, String Funktion, String Email, String Telefon, String Buero){
    this.Name = Name;
    this.Funktion = Funktion;
    this.Email = Email;
    this.Telefon = Telefon;
    this.Buero = Buero;
  }
  
  protected void setName (String Name){
    this.Name = Name;
  }
  
  protected String getName(){
    return Name;
  }

  
  protected void setFunktion (String Funktion){
    this.Funktion = Funktion;
  }
  
  protected String getFunktion(){
    return Funktion;
  }

  
  protected void setEmail (String Email){
    this.Email = Email;
  }
  
  protected String getEmail(){
    return Email;
  }
  
  
  protected void setTelefon (String Telefon){
    this.Telefon = Telefon;
  }
  
  protected String getTelefon(){
    return Telefon;
  }
  
  
  protected void setBuero (String Buero){
    this.Buero = Buero;
  }
  
  protected String getBuero(){
    return Buero;
  }
  }