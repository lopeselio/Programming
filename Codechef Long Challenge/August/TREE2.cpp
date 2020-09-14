#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        vector<int> v;
        int n;
        cin >> n;
        set<int> s;
        for(int i =0; i < n; i++)
        {
            int pl;
            cin >> pl;
            s.insert(pl);
        }
        set<int>::iterator it;
        
        for (it = s.begin(); it != s.end(); ++it)
        {
            v.push_back(*it);
        }
        
        int get = 0;
        for(int i = 0; i< v.size(); i++)
        {
            if(v[i] == 0)
            {
                get = 1;
            }
        }
        if(get == 1)
        {
            cout << v.size() -1 <<endl;
        }
        else
        {
            cout << v.size() << endl;
        }
    }
    return 0;
}
