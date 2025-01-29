public class RangeSearch
 {
    public static void main(String[] args)
    {
        int[] arr = {12,2,34,6,45,84};
        int target = 6;
         int ans = Range(arr, target, 0,3);
        System.out.println(ans);
    }

    static int Range(int[] arr, int target, int start, int end)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        for(int i = start ; i <= end ; i++)
        {
            if (target == arr[i])
            {
                return arr[i];
            }
        }

        return -1;
 }


}
