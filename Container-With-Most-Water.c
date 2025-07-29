int maxArea(int* arr, int n) {
    int max=0;
    int w=n-1;
    int l;
    int i=0,j=n-1;
    while(w>0){
        if(arr[i]>arr[j]){
            l=arr[j];
            if(max<(l*w)){
                max=(l*w);
            }
            j--;
            w--;
        }
        else{
            l=arr[i];
            if(max<l*w){
                max=(l*w);
            }
            i++;
            w--;
        }
    }
    return max;
}