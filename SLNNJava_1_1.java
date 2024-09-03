import java.util.Scanner;

public class SLNNJava_1_1{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("键入数据1");
		double Input_01 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入数据2");
		double Input_02 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入数据3");
		double Input_03 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入数据1的权重");
		double W_01 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入数据2的权重");
		double W_02 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入数据3的权重");
		double W_03 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入阈值");
		double Sgn_01 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入偏置（无则键入0）");
		double B_01 = scanner.nextDouble();
		
		//输入数据
		double Output_01=Input_01*W_01+Input_02*W_02+Input_03*W_03+B_01;
		System.out.println("--------------------");
		System.out.println("计算后的数据为：");
		System.out.println(Output_01);
		//输出Output_01
		System.out.println("输出结果：");
		System.out.println(Output_01>Sgn_01);
		
	}
}