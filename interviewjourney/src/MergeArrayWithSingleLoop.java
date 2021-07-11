public class MergeArrayWithSingleLoop {
	private static int[] merge(int[] a, int[] b) {
		int[]combine = new int[a.length+b.length];
		int j=0;
		int temp = a.length;
		for(int i = 0;i<combine.length;i++) {
			if(combine[a.length-1]!=0&j<b.length) {
				combine[a.length+j] = b[j];
				temp++;
				j++;
			}else {
				combine[i] = a[i];
			}
		}
		return combine;
	}
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {6,7,8,9};
		int[] merge = merge(arr1, arr2);
		for (int i =0;i<merge.length;i++) {
			System.out.println(merge[i]);
		}
	}
}
