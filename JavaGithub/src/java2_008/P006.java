package java2_008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P006 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k32_f = new File("C:\\\\Users\\\\501-21\\\\Desktop\\\\kopo32\\\\Java\\\\��ȭ\\\\����_��ȭ\\\\8��\\\\�ѱ������������_������������������_20191224.csv");
		// ������ ������ File�� BufferedReader�� �������� ����
		BufferedReader k32_br = new BufferedReader (new FileReader(k32_f));
		// �ؽ�Ʈ�� �ٲ㰡�鼭 ���� ���ڿ� ���� ����
		String k32_readtxt;
		// ù ���� readtxt�� �Է��ϰ� ���� ���̿��� null�� ������ ������ �޼��� ���
		if((k32_readtxt = k32_br.readLine()) == null) {
			System.out.println("�� �����Դϴ�.");
			return;
		}
		// field_name ���ڿ� �迭�� ù���� ,������ �߶� �Է��Ѵ�.
		String[] k32_field_name = k32_readtxt.split(",");
		
		//���ձ�� �츮�� �����浵 
		double k32_lat = 37.3860521;
		double k32_lng = 127.1214038;
		
		int k32_LineCnt = 1;	// ���� ���°�� ���� �ִ��� Ȯ���� ������ ���� ����
		int k32_maxnumber = 0;	// �ִ밪�� ��ġ�� ���� ���� ����
		int k32_minnumber = 0;	// �ּҰ��� ��ġ�� ���� ���� ����
		double k32_distanceMax = 0.0;	// �ִ�Ÿ��� ���� ���� ����
		double k32_distanceMin = 0.0;	// �ּҰŸ��� ���� ���� ����
		String k32_maxPlace = "";	// �ִ�Ÿ��� ��� ���ڿ� ���� ����
		String k32_minPlace = "";	// �ּҰŸ��� ��� ���ڿ� ���� ����
		
		while((k32_readtxt = k32_br.readLine()) != null) { 	// ���� ���������� ���� while�� �ۼ�
			
			String [] k32_field = k32_readtxt.split(",");	// ���� ������ �޸� ������ �߶� field �迭�� �ִ´�.
			System.out.printf("**[%d��° �׸�]***********************\n",k32_LineCnt);	// ���� ���° �׸����� ����Ѵ�.
			System.out.printf(" %s : %s\n", k32_field_name[1], k32_field[1]);	// �ش� ���� ��������� �׸�� ������ ����Ѵ�.
			System.out.printf(" %s : %s\n", k32_field_name[3], k32_field[3]);	// �ش� ���� ���� : ������ ���� ����Ѵ�.
			System.out.printf(" %s : %s\n", k32_field_name[2], k32_field[2]);	// �ش� ���� �浵 : �浵�� ���� ����Ѵ�.
			// �Ÿ� ��� (��Ÿ��� ����) sqrt(������), pew(����), field�� ���� ���������� �ٲ㼭 ������ ������ ��ǥ�� �Ÿ����
			double dist = Math.sqrt(Math.pow(Double.parseDouble(k32_field[3]) - k32_lat,2)
					+ Math.pow(Double.parseDouble(k32_field[2]) -k32_lng, 2));
			// ������ ����� �Ÿ� ���
			System.out.printf(" ���������� �Ÿ� : %f\n", dist);
			System.out.println("************************************");
			// �ִ� �ּ� ���ϴ� if�� ����
			if(k32_LineCnt == 1) {
				k32_distanceMax = dist;	// �ش簪�� �ִ밪 ������ �־��
				k32_distanceMin = dist;	// �ش� ���� �ּҰ� ������ �־��
				k32_maxnumber = k32_LineCnt;	// �ִ밪�� ��ȣ(���°��)�� �־��
				k32_minnumber = k32_LineCnt;	// �ּҰ��� ��ȣ(���°��)�� �־��
				k32_maxPlace = k32_field[1];	// �ִ�Ÿ��� ��Ҹ� �־��
				k32_minPlace = k32_field[1];	// �ּҰŸ��� ��Ҹ� �־��
				
			} else {
				if(dist > k32_distanceMax) {
					k32_distanceMax = dist;	// �ִ밪�� �����Ѵ�.
					k32_maxnumber = k32_LineCnt;	//�ִ밪�� ��ġ�� �����Ѵ�.
					k32_maxPlace = k32_field[1];	// �ִ�Ÿ��� ��Ҹ� �����Ѵ�
				}
				if(k32_distanceMin > dist) {
					k32_distanceMin = dist;	//�ּҰ��� �����Ѵ�.
					k32_minnumber = k32_LineCnt;	// �ּҰ��� ��ġ�� �����Ѵ�.
					k32_minPlace = k32_field[1];	// �ּҰŸ��� ��Ҹ� �����Ѵ�
				}
			}
			
			k32_LineCnt++;	// �����ٷ� �Ѿ�ٴ� �ǹ̷� +1
		}
		// �ִ�Ÿ� , �ּҰŸ� �� �� ���° ������ ����Ѵ�.
		System.out.printf("[%d��° �׸�] %s - �ִ�Ÿ� : %f\n", k32_maxnumber, k32_maxPlace, k32_distanceMax);
		System.out.printf("[%d��° �׸�] %s - �ּҰŸ� : %f", k32_minnumber, k32_minPlace, k32_distanceMin);		
		// BufferedReader ����
		k32_br.close();
	}

}
