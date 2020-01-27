#include<iostream>
#include<vector>

using namespace std;
void fill(vector<int> & arr){
    for(int i = 0; i<arr.size(); i++){
        cin>>arr[i];
    }
}
int binarySearch(vector<int> & arr, int data){
    int hi = arr.size()-1;
    int low = 0;
    // int ans = -1;
    int o = -1;
    while(low<=hi){
         int mid = hi + low /2;
        if(arr[mid] == data){
            o = mid;
            hi = mid - 1;
        }
        else if(arr[mid] > data){
            hi = mid -1;
        }
        else{
            low = mid + 1;
        }
    }

    if(o != -1){
        return o;
    }

    return -1;

}




int main(){
    int n; cin>>n;
    vector<int> arr(n,0);
    fill(arr);
    int data;       cin>>data;
    cout<<binarySearch(arr,data);




    return 0;
}