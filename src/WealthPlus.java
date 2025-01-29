public class WealthPlus
{
    public static void main(String[] args)
    {
        int[][] arr = {
                {1,2,3},
                {3,3,0},
                {1,9,5}
        };

        System.out.println(AddArrays(arr));

    }

    static int AddArrays(int[][] arr){


        int ans = 0;
        for (int row = 0; row < arr.length; row++)
        {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++)
            {
                sum = sum + arr[row][col];

            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
