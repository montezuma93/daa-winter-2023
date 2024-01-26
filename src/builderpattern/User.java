package builderpattern;

public class User {
    String vorname;
    String nachname;
    String email;
    int age;

    User(Builder builder) {
        this.vorname = builder.vorname;
        this.nachname = builder.nachname;
        this.age = builder.age;
        this.email = builder.email;
    }

    @Override
    public String toString() {
        return "User{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    static class Builder {
        String vorname;
        String nachname;
        int age;
        String email;

        Builder(String vorname){
            this.vorname = vorname;

        }

        Builder nachname(String nachname){
            this.nachname = nachname;
            return this;
        }

        Builder email(String email) throws Exception {
            if(! email.contains("@")){
                throw new Exception("invalid mail");
            }
            this.email = email;
            return this;
        }

        User build() {
            return new User(this);
        }

    }

}
