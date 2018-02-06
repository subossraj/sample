package subash;

public class DuplicatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {12,13,55,12,45,25,35,55};
for (int i = 0; i < a.length; i++) {
	for (int j = 1; j < a.length; j++) {
		
		if(a[i] == a[j] && i!=j)
		{
			System.out.print(a[i]+" ");
			break;
		}
	}
}
System.out.println("end");
	}

}
