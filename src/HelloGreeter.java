public class HelloGreeter {

    String greeting;

    public HelloGreeter(String greeting) {
        this.greeting = greeting;
    }


    public void showRepeatGreeting(int numGreets)
    {
        for (int i = 1; i <= numGreets; i++)
        {
            System.out.println(greeting);
        } 
    }
}
