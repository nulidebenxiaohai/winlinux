# 基础数据结构

## 1.1 数组/链表

### 前缀和数组

#### 303. 区域和检索-数组不可变

![image-20220118192910235](labuladong.assets/image-20220118192910235.png)

```java
class NumArray {
    private int[] prenums;
    public NumArray(int[] nums) {
        int n = nums.length;
        prenums = new int[n + 1];
        for(int i = 0; i < n; i++){
            prenums[i+1] = prenums[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return prenums[right + 1] - prenums[left];
    }
}
```

#### 304. 二维区域和检索 - 矩阵不可变

![image-20220118193131331](labuladong.assets/image-20220118193131331.png)

<img src="labuladong.assets/image-20220118193147205.png" alt="image-20220118193147205" style="zoom:67%;" />

```java
class NumMatrix {
    private int[][] presum;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        if(m == 0 || n == 0) return;
        
        presum = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                presum[i][j] = presum[i-1][j] + presum[i][j-1] + matrix[i-1][j-1] - presum[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return presum[row2+1][col2+1] - presum[row1][col2+1] - presum[row2+1][col1] + presum[row1][col1];
    }
}
```

