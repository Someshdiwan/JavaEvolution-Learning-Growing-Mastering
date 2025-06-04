public class EnhancedForLoop
{
    public static void main(String[] args)
    {
        String[] seasons = new String[4];
        seasons[0] = "Spring";
        seasons[1] = "Summer";
        seasons[2] = "Autumn";
        seasons[3] = "Winter";

        for (String season: seasons)
            System.out.println(season);

        //Remember char are NOT Strings; notice the SINGLE QOUTES
        char[] cardinalPoints = {'W', 'N', 'E', 'S'};

        for (char point: cardinalPoints)
            System.out.println(point);
    }
}
