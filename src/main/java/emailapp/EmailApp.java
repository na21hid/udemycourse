package emailapp;

/**
 * Created by amir on 5/3/19.
 */
public class EmailApp {

    public static void main(String[] args) {

        Email em1 = new Email("John" , "Stony");

//        em1.setAlternateEmail("js@gmail.com");
//        System.out.println(em1.getAlternateEmail());

        System.out.println(em1.showInfo());
    }
}
