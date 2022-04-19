package java2_006;
// ¸Þ¼Òµå ¿À¹ö·Îµù / 20220417 / k32_ÀÌÁö¹Î / ÁÖ¼®Àº k32_Á¦¿Ü
public class P007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P007_Calc1 k32_cc = new P007_Calc1();	// P007_Calc1 Å¬·¡½º cc ¼±¾ð
		
		System.out.printf("2°³ µ¡¼ÀÀÌ È£ÃâµÊ [%d]\n", k32_cc.k32_sum(1, 2));		// 2°³ µ¡¼À °á°ú Ãâ·Â
		System.out.printf("3°³ µ¡¼ÀÀÌ È£ÃâµÊ [%d]\n", k32_cc.k32_sum(1, 2, 3));	// 3°³ µ¡¼À °á°ú Ãâ·Â
		System.out.printf("4°³ µ¡¼ÀÀÌ È£ÃâµÊ [%d]\n", k32_cc.k32_sum(1, 2, 3, 4));	// 4°³ µ¡¼À °á°ú Ãâ·Â
		System.out.printf("´õºíÇü µ¡¼ÀÀÌ È£ÃâµÊ [%f]\n", k32_cc.k32_sum(1.3, 2.4));	// ½Ç¼öÇü µ¡¼À °á°ú Ãâ·Â
	}

}
