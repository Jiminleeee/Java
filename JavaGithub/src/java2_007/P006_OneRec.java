package java2_007;
// Ŭ������ �迭 / 20220420 / k32_������ / �ּ����� k32_����
public class P006_OneRec {
		//private �� Ŭ���������� ��� ����
		private String k32_name;	// ���ڿ� ���� �л��� �̸� ����
		private int k32_kor;	// ���� ���� ���� ���� ����
		private int k32_eng;	// ���� ���� ���� ���� ����
		private int k32_math;	// ���� ���� ���� ���� ����
		
		public P006_OneRec(String name, int kor, int eng, int math) {	// ������ ����� (���� 4�� > �̸�, ����, ����, ���� ����)
			
			this.k32_name = name;	// ������ ������ �̸��� �����ڷ� �޾ƿ´�
			this.k32_kor = kor;		// ������ ������ ���� ������ �����ڷ� �޾ƿ´�
			this.k32_eng = eng;		// ������ ������ ���� ������ �����ڷ� �޾ƿ´�
			this.k32_math = math;	// ������ ������ ���� ������ �����ڷ� �޾ƿ´�
			
		}
		
		

		
		public String k32_getName() {return this.k32_name;};	// �Է��� �̸��� �����ϴ� �޼ҵ� ����
		public int k32_getKor() {return this.k32_kor;};		// �Է��� ���� ������ �����ϴ� �޼ҵ� ����
		public int k32_getEng() {return this.k32_eng;};		// �Է��� ���� ������ �����ϴ� �޼ҵ� ����
		public int k32_getMath() {return this.k32_math;};	// �Է��� ���� ������ �����ϴ� �޼ҵ� ����
		public int k32_getSum() {return this.k32_kor + this.k32_eng + this.k32_math;};	// 3������ ���� ���ϴ� �޼ҵ� ����
		public double k32_getAvg() {return this.k32_getSum() / 3.0;};	// 3������ ���(�Ǽ���)�� ���ϴ� �޼ҵ� ����
		
	}

