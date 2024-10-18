
" we are considering ith index bar completely and 
then check all adjacent bar in left and right
        1. with height >= ith index bar
        2. to know left and right bar limit simple keep limit in left and right array 
"
class Solution {


    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int leftLimit[] = new int[n];
        for (int i = 0; i < n; i++) {
            int pidx = i - 1;
            while (pidx != -1 && arr[pidx] >= arr[i]) {
                pidx = leftLimit[pidx];
            }
            leftLimit[i] = pidx;
        }

        int rightLimit[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int pidx = i + 1;
            while (pidx != n && arr[pidx] >= arr[i]) {
                pidx = rightLimit[pidx];
            }
            rightLimit[i] = pidx;
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, (rightLimit[i] - leftLimit[i]-1) * arr[i]);
        }

        return max;
    }
}


