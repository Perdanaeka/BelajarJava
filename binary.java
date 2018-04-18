import java.io.* ;
public class Binary
{
	public static void main (String args []) throws IOException
	{
		BufferedReader lol = new BufferedReader(new InputStreamReader(System.in));
		int  n,cari,m;

		System.out.print("Masukkan Panjang Data = ");
		n=Integer.parseInt(lol.readLine());
		int data []=new int [n];
		for(int i=0;i<data.length;i++)
		{
			System.out.print("Masukkan Data ke-"+i+" = ");
			data[i]=Integer.parseInt(lol.readLine());
		}

		System.out.print("Masukkan Data YG Dicari = ");
		cari=Integer.parseInt(lol.readLine());
		int l=0,r=n-1;
		int ktm = 0;
		while (l<=r && ktm ==0)
			{
				m = (l+r)/2;
				if (data[m] == cari)
				ktm=1;
			else if(cari < data[m] )
					r= m-1;
			else
					l = m+1;
			}
		if(ktm==1)
			System.out.println ("DATA DITEMUKAN");
		else
			System.out.println ("DATA TIDAK DITEMUKAN");
	}
}
