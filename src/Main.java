public class Main {

    public static void main(String[] args)
    {
       for (int cnt = 0; cnt <= 30; cnt++) // initialize the count to start at 0, stopping condition is when count is greater than or equal to 30, count increases by one each time
        {
            System.out.print(cnt + " "); // each time the loop repeats, the count will be printed (with a space between each)
        }

        for (int cnt = 30; cnt >= 0; cnt--) // initialize the count to start at 30, stopping condition is when count is less than or equal to 0, count decreases by one each time
        {
            System.out.print(cnt + " "); // each time the loop repeats, the count will be printed (with a space between each)
        }

        for (int cnt = 0; cnt <= 18; cnt = cnt + 3) // initialize the count to start at 0, stopping condition is when count is greater than or equal to 18, every time the loop runs, count will increase by 3
        {
            System.out.print(cnt + " "); // each time the loop repeats, the count will be printed (with a space between each)
        }

        for (int cnt = 10; cnt >= 0; cnt = cnt - 2) // initialize the count to start at 10, stopping condition is when count is less than or equal to 0, count decreases by two each time
        {
            System.out.print(cnt + " "); // each time the loop repeats, the count will be printed (with a space between each)
        }
    }
}
