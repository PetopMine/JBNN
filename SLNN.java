public class SLNN{
	/*定义类为SLNN*/
	public static void main(String[] args0){
		double Input_01=1.0;
		double Input_02=2.0;
		double Input_03=0.0;
		int B=1;
		/*输入数据,向量B*/
		double W_01=1.0;
		double W_02=3.0;
		double W_03=2.0;
		double W_0201=0.5;
		double W_0202=2.5;
		double W_0203=1.5;
		/*输入数据权重*/
		double Count_01=Input_01*W_01+Input_02*W_02+Input_03*W_03+B;
		double Count_02=Input_01*W_0201+Input_02*W_0202+Input_03*W_0203+B;
		/*计算数据（输入*权重）*/
		double W2_01=1.0;
		double W2_0201=0.5;
		double W2_0301=0.0;
		double W2_02=2.0;
		double W2_0202=1.5;
		double W2_0302=1.0;
		/*输入计算层1（Count_01/02）的权重*/
		double Count2_01=Count_01*W2_01+Count_02*W2_02+B;
		double Count2_02=Count_01*W2_0201+Count_02*W2_0202+B;
		double Count2_03=Count_01*W2_0301+Count_02*W2_0302+B;
		/*计算数据（Count1*权重）*/
		double W3_01=1.0;
		double W3_02=2.0;
		double W3_03=3.0;
		/*输入权重（计算层Count2）*/
		double Output_01=Count2_01*W3_01+Count2_02*W3_02+Count2_03*W3_03+B;
		
			if( Output_01>75 ){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
	}
}