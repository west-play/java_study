package mar22.add;

class ArrayEx5 {
	public static void main(String[] args) {
		int[] number = new int[10];

		for (int i=0; i < number.length ; i++ ) {
			System.out.print(number[i] = (int)(Math.random() * 10));
		}
		System.out.println();

		for (int i=0; i < number.length ; i++ ) {
			boolean changed = false;	// �ڸ��ٲ��� �߻��ߴ����� üũ�Ѵ�.

			for (int j=0; j < number.length-1-i ; j++ ) {
				if(number[j] > number[j+1]) { // ���� ���� ũ�� ���� �ٲ۴�.
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
					changed = true;	// �ڸ��ٲ��� �߻������� changed�� true��.
				} // end if
			} // end for j

			if (!changed) break;	// �ڸ��ٲ��� ������ �ݺ����� �����.

			for(int k=0; k<number.length;k++)
				System.out.print(number[k]); // ���ĵ� ����� ����Ѵ�.
			System.out.println();
		} // end for i
	}
}

















