#include<iostream>
#include<vector>
using namespace std;
void fillArray(vector<int> & arr){
    for(int i = 0; i<arr.size(); i++){
        cin>>arr[i];
    }
}

int maxOfArray(vector<int> & arr){
    int maxx = arr[0];
    for(int i = 0; i<arr.size(); i++){
        if(arr[i]>maxx){
            maxx = arr[i];
        }
    }
    return maxx;
}



int minOfArray(vector<int> & arr){
    int minn = arr[0];
    for(int i = 0; i<arr.size(); i++){
        if(arr[i]<minn){
            minn = arr[i];
        }
    }
    return minn;
}

int spanOfArray(vector<int> & arr){
    int mymax = maxOfArray(arr);
    int mymin = minOfArray(arr);
    return mymax-mymin;
}
int main(){
    int n;
    cin>>n;
    vector<int> arr(n,0);
    fillArray(arr);
    int span = spanOfArray(arr);
    cout<<"Span of Array is --> "<<span;
    return 0;
}