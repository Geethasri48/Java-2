public class Question_1
{
    public static void main(String args[])
    {
        int arr[]={25,35,12,4,36,48};
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i]+arr[i-1];
            //System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}