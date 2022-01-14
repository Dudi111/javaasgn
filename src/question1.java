public class question1 {
    public static void main(String[] args) {
       int[] ar={3,2 ,-1,-1,2};
         int sum=0;
         int length=0;
         String finalresult="";
       for (int i=0;i<ar.length;i++) {
           String res = "";
           sum = 0;
           for (int j = i; j < ar.length; j++) {
               sum = sum + ar[j];
               res = res + String.valueOf(ar[j]);


               if (length < (j - i + 1)) {
                   length = (j - i + 1);
                   finalresult = res;
               }

           }
       }


    }
}
