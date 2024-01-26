package builderpattern;

public class UserOld {
    String vorname;
    String nachname;
    String plz;
    String stadt;
    String strasse;
    int hausnummer;
    String handyNummer;
    String emailAdresse;
    int age;
    String gender;
    String hobby;

    public UserOld(String vorname, String nachname, String emailAdresse, String hobby) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.emailAdresse = emailAdresse;
        this.hobby = hobby;
    }

    public UserOld(String vorname, String nachname, String emailAdresse, String handyNummer, int age) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.handyNummer = handyNummer;
        this.emailAdresse = emailAdresse;
        this.age = age;
    }

    public UserOld(String vorname, String nachname, String plz, String stadt, String strasse, int hausnummer, String handyNummer, String emailAdresse, int age, String gender) throws Exception {
        if(vorname == null ){
            throw new Exception("vorname ist super wichtig");
        }
        this.vorname = vorname;
        this.nachname = nachname;
        this.plz = plz;
        this.stadt = stadt;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.handyNummer = handyNummer;
        if(! emailAdresse.contains("@")){
            throw new Exception("invalid mail");
        }
        this.emailAdresse = emailAdresse;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", plz='" + plz + '\'' +
                ", stadt='" + stadt + '\'' +
                ", strasse='" + strasse + '\'' +
                ", hausnummer=" + hausnummer +
                ", handyNummer='" + handyNummer + '\'' +
                ", emailAdresse='" + emailAdresse + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }




}
