//Hackerrank interview Preparation Kit :: Counting inversions using Merge Sort
#include <bits/stdc++.h>
using namespace std;

long merge(long arr[], long temp[], long start, long mid, long end){
    long i, j, k;
    i = start;
    j = mid;
    k = start;
    long count=0;
    
    while((i<=mid-1)&&(j<=end)){
        if(arr[i]<=arr[j]){
            temp[k++] = arr[i++];
        }
        else{
            temp[k++] = arr[j++];
            count+=mid-i;
        }
    }
    while(i <= mid -1){
        temp[k++] = arr[i++];
    }
    while(j <= end){
        temp[k++] = arr[j++];
    }
    
    for(int a = start; a <= end; a++){
        arr[a] = temp[a];
    }
    return count;
}

long mergesort(long arr[], long temp[], long start, long end){
    long count = 0;
    long mid;
    
    if(start < end){
        mid = (end + start)/2;
        count += mergesort(arr, temp, start, mid);
        count += mergesort(arr, temp, mid+1, end);
        count += merge(arr, temp, start, mid + 1, end);
    }
    return count;
}

int main()
{
    int testcase;
    int n;
    long * arr;
    cin >> testcase;
    while(testcase--){
        cin >> n;
        arr = new long[n];
        for(int i = 0; i < n; i++){
            cin>> arr[i];
        }
        long temp[n];
        cout<<mergesort(arr, temp, 0, n-1)<<endl;
        
    }
    return 0;
}
