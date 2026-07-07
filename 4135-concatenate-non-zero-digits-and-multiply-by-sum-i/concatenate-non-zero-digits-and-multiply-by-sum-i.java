class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb = new StringBuilder();
        int temp = n;

        while (temp > 0) {
            int r = temp % 10;
            if (r != 0) {
                sb.append(r);
            }
            temp /= 10;
        }

        if (sb.length() == 0)
            return 0;

        sb.reverse();   

        int sum = 0;
        for (int i = 0; i < sb.length(); i++) {
            sum += sb.charAt(i) - '0';
        }

        long num = Long.parseLong(sb.toString());

        return sum * num;
    }
}