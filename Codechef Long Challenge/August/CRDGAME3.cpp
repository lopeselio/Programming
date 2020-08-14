#include<bits/stdc++.h>
using namespace std;
int main() {
    int r, c, t, x, y;
    cin>>t;
    while(t--){
        cin>>c>>r;
        x = c/9 + ((c%9 == 0)?0:1);
        y = r/9 + ((r%9 == 0)?0:1);
        (x == y)?cout<<1<<" "<<y<<endl:((x>y)?cout<<1<<" "<<y<<endl:cout<<0<<" "<<x<<endl);
        
    }
    // return 0;
}
