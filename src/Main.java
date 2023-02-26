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




        for (int row = 1; row <= 5; row++) // outer for loop - there will be 5 rows. the variable row starts at 1, increases each time the outer loop runs. loop stops once row is greater than or equal to 5
        {
            for (int col = 1; col <= row; col++) // inner for loop - this loop handles the columns. the number of stars is equal to the number row you are on
            {
                System.out.print("*"); // a star is printed each time the inner loop runs. the number of stars is equal to the number row we are on
            }
            System.out.println(""); // puts each iteration on its own row. every time we break out of the inner loop, we skip to the next line before running the loops again
        }



        for (int row = 5; row >= 1; row--) // outer for loop - there will be 5 rows. the variable row starts at 5, decreases each time the outer loop runs. loop stops once row is less than or equal to 1
        {
            for (int col = 1; col <= row; col++) // inner for loop - this loop handles the columns. the number of stars is equal to the number row you are on. because we start at row 5 and decrease, the number of stars decreases
            {
                System.out.print("*"); // a star is printed each time the inner loop runs. the number of stars is equal to the number row we are on
            }
            System.out.println(""); /// puts each iteration on its own row. every time we break out of the inner loop, we skip to the next line before running the loops again
        }


        for (int row = 1; row <= 5; row++) // outer for loop - there will be 5 rows. the variable row starts at 1, increases each time the outer loop runs. loop stops once row is greater than or equal to 5
        {
            for (int col = 1; col <= 5; col++) // inner for loop - this loop handles the columns. this loop runs 5 times (printing 5 *) before it breaks out, skips to the next line and runs the outer loop
            {
                System.out.print("*"); // a star is printed each time the inner loop runs. the inner loop runs 5 times and prints 5 * before it breaks out.
            }
            System.out.println(""); // puts each iteration on its own row. every time we break out of the inner loop, we skip to the next line before running the loops again
        }




    }
}
