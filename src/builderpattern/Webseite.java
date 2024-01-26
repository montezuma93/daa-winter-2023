package builderpattern;

public class Webseite {
    public static void main(String[] args) throws Exception {

        UserOld userOld = new UserOld("hermann", "ritzenthaler", "68723", "Mannheim", "Belchenstraße"
        ,123,"012500123", "hmr@gmail.com", 30, "male");
        System.out.println("User registered");
        System.out.println(userOld.toString());
        UserOld userOld2 = new UserOld("philipp", "braun", "pb@gmail.com","singen");
        System.out.println("User registered");
        System.out.println(userOld2.toString());
        UserOld userOld3 = new UserOld("aisheh", "labash", "al@gmail.com", "0123456",20);
        System.out.println("User registered");
        System.out.println(userOld3.toString());


        User user4 = new User.Builder("manuela")
                .nachname("hanns")
                .build();

        User user5 = new User.Builder("philipp")
                .nachname("braun")
                .email("pb@gmail.com")
                .build();

        System.out.println("User registered");
        System.out.println(user4.toString());


    }
}
