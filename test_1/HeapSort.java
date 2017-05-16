public class  HeapSort
{	static int heapsize;
	public static void main(String[] args) 
	{
		int i;


		int len = args.length;
		int a[] =new int[len];

		for(i = 0; i < len ;i++)
			a[i] = Integer.parseInt( args[i] );
		//int a[] ={1,4,7,8,96,62,75,73,18,20};
		//int len = 10;
					//��������


/**		for( i =0 ; i < len ; i++ ){
				a[i] = Integer.parseInt( args[i] );
				System.out.println( a[i] );
		}
**/

		build_maxheapy(len,a);

		heap_sort(len,a);

		for(i =0 ; i < len ; i++ )		
			System.out.print( a[i] + "	");
	}

		static void build_maxheapy (int len ,int[] a){
		int i;
		heapsize=len;
		for(i= len/2-1 ;  i>=0 ; i--)	//�����±�� 0 ��ʼ
			maxheapy(i, a);
		
		}

		static void maxheapy (int i ,int[] a) {	//	i�Ǹ��ڵ��±�
				int tmp, largest= 0;
				int l = 2*i+1;
				int r = 2 * i + 2;
				
				if ((l< heapsize) && (a[l]> a[i]))
					largest = l;
				else
					largest = i;

				if ((r< heapsize) && (a[r] > a[largest]))
					largest = r;

				if (largest != i)
				{
					tmp = a[i];
					a[i] = a[largest];
					a[largest] = tmp;
					maxheapy (largest,a) ;
				}


				//System.out.println( a[i] + "---------");
			}
		


		static void heap_sort(int len ,int[] a){	//����Ĺ�ģ�ڼ�С
			int j ,i, tmp;
			for(i= len-1, j=0; i>=1; i--){
				tmp = a[j] ;
				a[j] = a[i];
				a[i] = tmp;
				heapsize-=1;
				maxheapy(0, a);		
			}
		}

		
}
