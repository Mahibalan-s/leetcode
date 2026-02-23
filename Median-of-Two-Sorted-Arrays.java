1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int arr[]=new int[nums1.length+nums2.length];
4        int i=0;
5        int j=0;
6        int k=0;
7        while(i<nums1.length || j<nums2.length){
8            if(i==nums1.length){
9                arr[k++]=nums2[j++];
10            }
11            else if(j==nums2.length){
12                arr[k++]=nums1[i++];
13            }
14            else if(nums1[i]<=nums2[j]){
15                arr[k++]=nums1[i++];
16            }
17            else if(nums1[i]>nums2[j]){
18                arr[k++]=nums2[j++];
19            }
20        }
21        if(arr.length%2==0){
22            double f=(arr[arr.length/2]+arr[(arr.length/2)-1])/2.0;
23            return f;
24        }
25        double f=arr[arr.length/2];
26        return f;
27    }
28}