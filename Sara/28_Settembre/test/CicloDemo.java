public class CicloDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] arr= {-1, 2, 23, 44, -73,101,150};
	
	for(int i:arr)System.out.println(i);
	
	System.out.println("********************************");
	
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2!=0) continue;
		System.out.println("numero doppio: "+arr[i]*2);
	}
	
	

	}

}
