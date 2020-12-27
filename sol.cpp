#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

ll gcd(ll a, ll b) {
	if(b==0)
		return a;
	return gcd(b, a%b);
}

ll lcm(ll a, ll b) {
	return (a*b)/gcd(a, b);
}

void solve() {
	int n;
	cin >> n;
	ll a[n];
	for(int i=0; i<n; ++i)
		cin >> a[i];
	ll ans=LONG_MAX;
	//find the smallest least common multiple of 'EACH' pair
	for(int i=0; i<n; ++i)
		for(int j=i+1; j<n; ++j)
			ans=min(ans, lcm(a[i], a[j]));
	cout << ans << "\n";
}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int t;
	cin >> t;
	while(t--)
		solve();
}
