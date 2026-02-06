1class Solution {
2    public int candy(int[] arr) {
3        if(arr.length==1){
4            return 1;
5        }
6        int c=0;
7        int r[]=new int[arr.length];
8        Arrays.fill(r,1);
9        for(int i=arr.length-1;i>0;i--){
10            
11            if(arr[i-1]>arr[i]){
12                r[i-1]=r[i]+1;
13            }
14            else if(arr[i]>arr[i-1]){
15                r[i]=Math.max(r[i-1]+1,r[i]);
16            }
17        }
18        if(arr[0]>arr[1]){
19            r[0]=r[1]+1;
20        }
21        for(int i=0;i<arr.length-1;i++){
22            if(arr[i+1]>arr[i] && r[i+1]<=r[i]){
23                r[i+1]=r[i]+1;
24            }
25        }
26
27        // for(int i=0;i<arr.length-1;i++){
28        //     if(arr[i]>arr[i+1]){
29        //         r[i]=r[i+1]+1;
30        //     }
31        //     else if(arr[i+1]>arr[i]){
32        //         r[i+1]=r[i]+1;
33        //     }
34        // }
35        // if(arr[arr.length-1]>arr[arr.length-2]){
36        //     r[arr.length-1]=r[arr.length-2]+1;
37        // }
38        // else if(arr[arr.length-2]>arr[arr.length-1]){
39        //     r[arr.length-2]=r[arr.length-1]+1;
40        // }
41        for(int i:r){
42            c+=i;
43        }
44        return c;
45    }
46}