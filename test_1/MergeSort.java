public class  MergeSort
{	static int heapsize;
	public static void main(String[] args) 
	{
		int i , n1, n2 , p , q , v ;
		//int len = args.length;
		///int a[] =new int[len];

		//for(i = 0; i < len ;i++)
		//	a[i] = Integer.parseInt( args[i] );
		int a[] ={1,96,7,8,24,62,3,73,18,20};
		int len = 10;
					//²âÊÔÓÃÀý
		
			if(len%2 == 0)
				q = len/2;
			else
				q= len/2 +1;
			
			p = 0 ;
			v = len;
			n1 = q - p +1 ;
			n2 = v - q;

		int l[] = new int[n1+1];
		int r[] = new int[n2+1];

		

		merge2 (a , len , l , r);
		mergeSort(n1 , n2 , l , r);

		//System.out.println(n1);
		//System.out.println(n2);

		for( i =0 ; i < len ; i++ ){
				//a[i] = Integer.parseInt( args[i] );
				System.out.println( a[i] );
		}
	}


		static void mergeSort(int n1, int n2 , int[] l , int[] r ){
		int i , j , k ; 
		int len = n1 + n2 ;
		int a [] = new int[len] ;

		for( i = j = k = 0  ;  k < len &&  i <= n1 && j <= n2 ; k ++)  //     no_need_to_consider
			{
				if ( l[i] <= r[j])
				{
					a[k] = l[i];
					System.out.println( a[k] + "-------1" );
					if( l[j] != 0 )
						i++;
					else
						l[i] = l[ i - 1 ] ;
				}
				else
				{
					a[k] = r[j] ;
					System.out.println( a[k] + "-------2"  );
					if( r[j] != 0 )
						j++;
					else
						r[j] = r[ j - 1] ;
				}
			}
		}

		
		static void merge2(int[] a, int len , int[] r ,int[] l){
			int i, n1, n2 , p , q ,v ;

			//int l1[] = new int[n1+1];
			//int r1[] = new int[n2+1];

			if(len%2 == 0)
				q = len/2;
			else
				q= len/2 +1;
			
			p = 0 ;
			v = len;
			n1 = q - p +1 ;
			n2 = v - q;

			for(i = 0; i < n1; i ++ )
				l[i] = a [i];
				l[n1] = 0 ;
				
			for(i = 0; i < n2; i ++ )
				r[i] = a [n1 + i ];
				r[n2] = 0 ;

			//merge2( l , n1 , l1 , r1);
			//merge2( r , n2 , l1 , r1);
		}


		static void merge1(int[] a, int len){
			int n1, n2 , p , q ,v ;
			if(len%2 == 0)
				q = len/2;
			else
				q= len/2 +1;
			
			p = 0 ;
			v = len;
			n1 = q - p +1 ;
			n2 = v - q;
		}
}

