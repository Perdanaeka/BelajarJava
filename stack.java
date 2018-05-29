class Stacking
{
	private int Max_Stack;
	private String tumpukan[];
	private int top=-1;
	
	public Stacking (int s)
		{
		Max_Stack = s;
		tumpukan = new String[Max_Stack];
		top = -1;
		}
	
	public void push (String j)
		{
		tumpukan[++top]=j;
		}
		
	public void cetak()
		{
		int i =top;
		while (i>=0)
			{
			System.out.print(tumpukan[i]);
    		System.out.print(" ");
    		i--;
			}
		System.out.println(" ");	
		}
	
	public void cetakmundur()
		{
		int i =0;
		while (i<=top)
			{
			System.out.print(tumpukan[i]);
    		System.out.print(" ");
    		i++;
			}
		System.out.println(" ");	
		}
	
}		


class Stack_utama
{
    public static void main(String [] args) 
    {
    	Tumpukan stack = new Tumpukan (20);
    	stack.push("S");
    	stack.push("T");
    	stack.push("R");
    	stack.push("U");
    	stack.push("K");
    	stack.push("T");
    	stack.push("U");
    	stack.push("R");
    	stack.push(" ");
    	stack.push("D");
    	stack.push("A");
    	stack.push("T");
    	stack.push("A");
    	stack.cetakmundur();
    	System.out.println();
    	System.out.println("Hasil Stack ");
    	stack.cetak();
    	stack.cetakmundur();    	
    	
    	
    }
    
    
}
