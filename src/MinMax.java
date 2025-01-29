public class MinMax
{
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,1,40,5,3,2};
        System.out.println(Mixmax(arr));
    }

//    static int Mixmax(int[] arr)
//    {
//        if(arr.length == 0)
//        {
//            return -1;
//        }
//
//        int ans = arr[0];
//        for (int i = 1; i < arr.length ; i++)
//        {
//            if(arr[i] < ans)
//            {
//                ans = arr[i];
//            }
//        }
//        return ans;

    static int Mixmax(int[] arr)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        int ans = arr[0];
        for (int i = 1; i < arr.length ; i++)
        {
            if(arr[i] > ans)
            {
                ans = arr[i];
            }
        }
        return ans;
    }
}
