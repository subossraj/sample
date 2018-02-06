package subash;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{12,15,26},{45,24,1},{15,42,78},{1,2,3}};
System.out.println(a.length);
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length-1; j++) {
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
	}

}
