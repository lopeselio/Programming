#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int H,P;
	    cin>>H>>P;
	    while(H!=0 && P!=0){
	        if(H>P){
	            H=H-P;
	        }
	        else {
	            H=0;
	        }
	        P /= 2;
	        
	    }
	   // cout << P;
	    if(H){
	        cout << 0 << endl;
	    }
	    else{
	        cout << 1 << endl;
	    }
	}
	return 0;
}

