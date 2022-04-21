package java2_007;

public class P010_OneRec {
	
	private int k32_totalPerson;	// �� �ο��� ������ ���� ����
	private int k32_pgPerson;	// ������ �� �ο� �� ������ ���� ����
	private int  k32_student_id;	// ������ �迭 ��� ��ȣ ����
	private String k32_name;	// ���ڿ� �迭 ��� �̸� ����
	private int k32_kor;	// ������ �迭 ���� ���� ����
	private int k32_eng;	// ������ �迭 ���� ���� ����
	private int k32_math;	// ������ �迭 ���� ���� ����
	private int k32_personGroupArray;	// ������ �迭 ������ �� �ο� �� 
	
	public P010_OneRec(int totalPerson, int pgPerson, int student_id, String name, int kor, int eng, int math) {	// ������ ����� (���� 4�� > �̸�, ����, ����, ���� ����)
		this.k32_totalPerson = totalPerson;
		this.k32_pgPerson = pgPerson;
		this.k32_student_id = student_id;
		this.k32_name = name;	// ������ ������ �̸��� �����ڷ� �޾ƿ´�
		this.k32_kor = kor;		// ������ ������ ���� ������ �����ڷ� �޾ƿ´�
		this.k32_eng = eng;		// ������ ������ ���� ������ �����ڷ� �޾ƿ´�
		this.k32_math = math;	// ������ ������ ���� ������ �����ڷ� �޾ƿ´�
	}
	
	public int k32_getStudent_id() {return this.k32_student_id;};
	public String k32_getName() {return this.k32_name;};	// �Է��� �̸��� �����ϴ� �޼ҵ� ����
	public int k32_getKor() {return this.k32_kor;};		// �Է��� ���� ������ �����ϴ� �޼ҵ� ����
	public int k32_getEng() {return this.k32_eng;};		// �Է��� ���� ������ �����ϴ� �޼ҵ� ����
	public int k32_getMath() {return this.k32_math;};	// �Է��� ���� ������ �����ϴ� �޼ҵ� ����
	public int k32_getSum() {return this.k32_kor + this.k32_eng + this.k32_math;};	// 3������ ���� ���ϴ� �޼ҵ� ����
	public double k32_getAvg() {return this.k32_getSum() / 3.0;};	// 3������ ���(�Ǽ���)�� ���ϴ� �޼ҵ� ����
}
