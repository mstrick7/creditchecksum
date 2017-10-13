public class creditchecksum {
    public static void main(String[] args) {

        //put digits from string into an array

        int[] digits = new int[10];
        int i = 0;
        while (i < digits.length){
            digits[i] = Integer.parseInt(args[i]);
            i++;
        }

        //replace odd digits with f(d)

        int j = 0;
        while (j < digits.length){
            digits[j] = digits[j]*2;
            if (digits[j] >= 10) {
                digits[j] = (digits[j] - 10) + 1;
            }
            j = j + 2;
            }

        //print 10 digits plus 11th checksum digit

        int l = 0;
        int k = 0;
        while (k < digits.length){
            System.out.print(digits[k]);
            l = l + digits[k];
            k++;
        }
        System.out.print(l);



    }
}
