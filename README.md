# String:
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

# Array:
https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html

# Collections
https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html

# Collection Sort - Lambda
https://www.baeldung.com/java-8-sort-lambda

# BST Inorder Travesal - Stack
https://leetcode.com/submissions/detail/235826659/

# Binary search
https://leetcode.com/problems/binary-search/

# Quicksort
https://leetcode.com/submissions/detail/470569532/

# LRU cache
https://leetcode.com/problems/lru-cache/

# LFU cache
https://leetcode.com/problems/lfu-cache/discuss/1606715/Simple-java-approach

# Number of Islands
https://leetcode.com/submissions/detail/237750107/

# Max contigoues subarray - DP
https://leetcode.com/problems/maximum-subarray/

# N Queen
https://www.geeksforgeeks.org/java-program-for-n-queen-problem-backtracking-3/

# Read - Write

```java
public static void main(String[] args) throws FileNotFoundException {
        File finput = new File("/Users/nguyenan/Documents/IO-files/in.txt");
        File foutput = new File("/Users/nguyenan/Documents/IO-files/out.txt");
        Scanner scanner = new Scanner(finput);
        //Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(foutput);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        //scanner.nextLine();
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }
        pw.println(n);
        for (int v: arr) {
            pw.print(String.format("%.2f ", (float)v));
        }
        
        pw.close();
        scanner.close();
    }
```
