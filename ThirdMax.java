public class ThirdMax {
    public static void main(String[] args) {
        int[] arr={4,5,7,63,4,5,75,34,75,87,9};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        for (int i : arr) {
            if (i>first) {
                third=second;
                second=first;
                first=i;
                
            }
            else if(i>second && i!=first){
                third=second;
                second=i;
            }
            else if(i>third && i!=second && i!=third){
                third=i;
            }
        }
        if (third==Integer.MIN_VALUE) {
            System.out.println(first);
            
        }
        System.out.println(third);

    }
}
