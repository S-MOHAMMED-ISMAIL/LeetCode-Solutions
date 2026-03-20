class Solution {
    public int integerReplacement(int n1) {
        long n = n1;
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0)
                n /= 2;
            else if (n == 3 || n % 4 == 1)
                n--;
            else
                n++;

            count++;
        }
        return count;
    }
}