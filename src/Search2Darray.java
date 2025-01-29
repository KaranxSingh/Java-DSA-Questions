public class Search2Darray
{
    public static void main(String[] args)
    {
        int[][] arr =
                {
                {12,24,36},
                {48,60,72},
                {84,96,108}
                };

        int target = 36;
        System.out.println(Search(arr, target));
    }

    static int Search(int[][] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] == target)
                {
                    return j;
                }
            }
        }

        return -1;
    }
}
