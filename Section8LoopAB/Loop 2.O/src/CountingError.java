public class CountingError
{
    public static int count(String[][] things)
    {
        int count = 0;
        for (int r = 0; r < things.length; r++)
        {
            for (int c = 0; c < things[r].length - 1; c++)
            {
                if (things[r][c].indexOf("a") >= 0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
