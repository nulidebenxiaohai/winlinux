# Leetcode 题解

## 双指针

1. 有序数组的Two Sum
2. 两数平方和
3. 反转字符串中的元音字符
4. 回文字符串
5. 归并两个有序数组
6. 判断链表是否存在环
7. 最长子序列

双指针主要用于遍历数组，两个指针指向不同的元素，从而协同完成任务

### 1. 有序数组的Two Sum

167. Two Sum || - Input array is sorted (Easy)

![image-20220113210725708](Leetcode.assets/image-20220113210725708.png)

```java
public int[] twoSum(int[] numbers, int target){
    if(numbers == null) return null;
    int i = 0;
    int j = numbers.length - 1;
    while(i < j){
        int sum = numbers[i] + numbers[j];
        if (sum == target){
            return new int[]{i+1,j+1};
        }
        else if(sum < target){
            i++;
        }
        else{
            j--;
        }
    }
    retrun null;
}
```

### 2. 两数平方和

633. Sum of Square Numbers (easy)

![image-20220113233015218](Leetcode.assets/image-20220113233015218.png)

```java
public boolean judgeSquareSum(int target){
    if (target < 0 ) return false;
    int i = 0, j = (int) Math.sqrt(target);
    while(i <= j){
        int powsum = i*i+j*j;
        if(powsum == target){
            return true;
        }
        else if(powsum > target || powsum < 0){ //这里必须时powsum > target，因为当int溢出时，powsum将会变成负数，小于target。而这种情况时，应该是powsum过大。
            j--;
        }
        else{
            i++;
        }
    }
    return false;
}
```

### 3. 反转字符串中的元音字符

345. Reverse Vowels of a String (Easy)

![image-20220114001236528](Leetcode.assets/image-20220114001236528.png)

```java
private final static HashSet<Character> vowels = new HashSet<>(
    Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
public String reverseVowels(String s){
    if(s == null) return null;
    int i = 0; j = s.length() - 1;
    char[] result = new char[s.length()];
    while(i <= j){
        char ci = s.charAt(i);
        char cj = s.charAt(j);
        if(！vowel.contains(ci)){
            result[i] = ci;
            i++;
        }
        else if(！vowel.contains(cj)){
            result[j] = cj;
            j++;
        }
        else{
            result[i] = cj;
            result[j] = ci;
            i++;
            j--;
        }
    }
    return new String(result);
}
```

