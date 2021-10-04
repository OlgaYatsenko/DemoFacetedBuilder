import java.time.LocalDate;

public class DemoApplication {

    public static void main(String[] args){

        Child child = new ChildBuilder()
                .setPersonalInfo()
                    .withName("Olga")
                    .withDateOfBirth(LocalDate.of(2001,12,20))
                .lives()
                    .at("Main street")
                    .in("England")
                .build();
        System.out.println(child);
    }
}
