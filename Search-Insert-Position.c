int searchInsert(int* arr, int n, int t) {
    int d=0;
    if(t<arr[0]){
        return d;
    }
    for(int i=0;i<n;i++){
        if(t<=arr[i]){
            return d;
        }
        d++;
    }
    return d;
}