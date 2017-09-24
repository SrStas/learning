import java.util.EmptyStackException;

public class Person {
    private int age;

    public Person(int initialAge)  {
        //check age validity
        if (initialAge<-5)
            throw new EmptyStackException();
        else if (initialAge>30) throw new EmptyStackException();
        else if (initialAge<0){
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        age = initialAge;
    }

    public void amIOld()  {

        String msg;
        if (age<13){
            msg = "You are young.";
        }else if (age<18){
            msg = "You are a teenager.";
        }else msg = "You are old.";

        System.out.println(msg);
    }

    public void yearPasses(){
        age++;
    }


}
