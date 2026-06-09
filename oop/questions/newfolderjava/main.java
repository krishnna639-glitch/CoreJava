public class main {
    public static void main(String[] args)
    {
        int[] arr = {12,5,36,98,29};
        int max = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if (max < arr[i])
            {
                max = arr[i];
            }
            System.out.println(arr[i]);

        }
        System.out.println(max);
    }
}