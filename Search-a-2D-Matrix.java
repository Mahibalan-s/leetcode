1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        if(matrix.length==1){
4            if(matrix[0].length==1){
5                if(matrix[0][0]==target){
6                    return true;
7                }
8                return false;
9            }
10            else{
11                int i=0;
12                while(i<matrix[0].length){
13                    if(matrix[0][i]==target){
14                        return true;
15                    }
16                    i++;
17                }
18                return false;
19            }
20        }
21        else if(matrix.length==0){
22            return false;
23        }
24        else if(matrix.length>1){
25            if(matrix[0].length==1){
26                int i=0;
27                while(i<matrix.length){
28                    if(matrix[i][0]==target){
29                        return true;
30                    }
31                    i++;
32                }
33                return false;
34            }
35        }
36        int l=matrix.length/2;
37        if(matrix[l][matrix[0].length-1]>target){
38            int i=0;
39            while(i<=l){
40                int j=0;
41                while(j<matrix[0].length){
42                    if(matrix[i][j]==target){
43                        return true;
44                    }
45                    j++;
46                }
47                i++;
48            }
49        }
50        else{
51            int i=l;
52            while(i<matrix.length){
53                int j=0;
54                while(j<matrix[0].length){
55                    if(matrix[i][j]==target){
56                        return true;
57                    }
58                    j++;
59                }
60                i++;
61            }
62        }
63        return false;
64    }
65}