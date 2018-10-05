package sortProcessor;
public class Quick_6D_luoyaoguang_Sort{
	public int[] sort(int [] a) {
		quick2d(a,0,a.length-1);
		return a;
	}

	private void quick2d(int[] a, int lp, int rp) {
		if(lp<rp)
		{int c=rp-lp+1;	 if(c<7){int j;for(int i=1+lp;i<lp+c;i++)
		{j=i;while(j>=1+lp){if(a[j]<a[j-1])
		{int temp=a[j];a[j]=a[j-1];a[j-1]=temp;}j--;}	}	
		} else{int pos[]=new int[1];partition(a,lp,rp,pos);
		quick2d(a,lp,pos[0]-1);quick2d(a,pos[0]+1,rp);}}}

	private void partition(int[] a, int lp, int rp, int[]pos) {
		// TODO Auto-generated method stub
		int x,lp1,rp1,temp;x=a[lp];rp1=rp;lp1=lp;int y=a[rp];
		if(x<y){while(lp1<rp1)
		{while((a[lp1]<=x)&&(lp1<rp1)) lp1++;while(a[rp1]>x)rp1--;
		if(lp1<rp1){temp=a[rp1];a[rp1]=a[lp1];a[lp1]=temp;}}
		a[lp]=a[rp1];a[rp1]=x;}else{
			while(lp1<rp1){while((a[lp1]<=y)&&(lp1<rp1)) lp1++;
			while(a[rp1]>y)rp1--;if(lp1<rp1){temp=a[rp1];
			a[rp1]=a[lp1];a[lp1]=temp;}}
			a[lp]=a[rp1];a[rp1]=y;}pos[0]=rp1;}
}