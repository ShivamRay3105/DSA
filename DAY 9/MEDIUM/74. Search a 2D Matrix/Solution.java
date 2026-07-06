class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int row = 0;
        // while(row<matrix.length){
        // if(matrix[row].length == 1){
        // if(target == matrix[row][0]) return true;
        // }
        // if(matrix.length == 1 || row == matrix.length-1){
        // int left = 0;
        // int right = matrix[row].length-1;
        // while(left<=right){
        // int mid = (left + right) /2;
        // if(target == matrix[row][mid]){
        // return true;
        // } else if (target > matrix[row][mid]){
        // left = mid+1;
        // } else right = mid-1;
        // }
        // }

        // if(matrix[row][0]>target && row>0){
        // int left = 0;
        // int right = matrix[row-1].length-1;
        // while(left<=right){
        // int mid = (left + right) /2;
        // if(target == matrix[row-1][mid]){
        // return true;
        // } else if (target > matrix[row-1][mid]){
        // left = mid+1;
        // } else right = mid-1;
        // }
        // }
        // row++;
        // }
        // return false;

        int row = 0;
        while (row < matrix.length) {
            if (matrix[row][0] <= target || matrix[row][matrix[row].length - 1] >= target) {
                int left = 0;
                int right = matrix[row].length - 1;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (target == matrix[row][mid]) {
                        return true;
                    } else if (target > matrix[row][mid]) {
                        left = mid + 1;
                    } else
                        right = mid - 1;
                }
            }
            row++;
        }
        return false;
    }
}