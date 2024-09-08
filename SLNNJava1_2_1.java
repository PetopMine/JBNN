import java.util.Scanner;

public class SLNNJava1_2_1{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("键入感知机1中的数据1");
		double Input_01 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入感知机1中的数据2");
		double Input_02 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入感知机2中的数据1");
		double Input2_01 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入感知机2中的数据2");
		double Input2_02 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入感知机1中的数据1的权重(无则键入1)");
		double W_01 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入感知机1中的数据2的权重(无则键入1)");
		double W_02 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入感知机2中的数据1的权重(无则键入1)");
		double W2_01 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入感知机2中的数据2的权重(无则键入1)");
		double W2_02 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入感知机1的阈值");
		double Sgn_01 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入感知机1输出为true的输出");
		double Count_1OutputT = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入感知机1输出为false的输出");
		double Count_1OutputF = scanner.nextDouble();
		System.out.println("--------------------");
        System.out.println("键入感知机2的阈值");
		double Sgn_02 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入感知机2输出为true的输出");
		double Count_2OutputT = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入感知机2输出为false的输出");
		double Count_2OutputF = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入感知机1的偏置（无则键入0）");
		double B_01 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入感知机2的偏置（无则键入0）");
		double B_02 = scanner.nextDouble();
		System.out.println("--------------------");
		
		System.out.println("键入感知机1输出的权重(无则键入1)");
		double W_Count1 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入感知机2输出的权重(无则键入1)");
		double W_Count2 = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入输出阈值");
		double Sgn_Output = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println("键入输出偏置（无则键入0）");
		double B_Output = scanner.nextDouble();
		
		
		//输入数据
		double Count_01 =Input_01*W_01+Input_02+W_02*+B_01;
		
		double Count_02 =Input2_01*W2_01+Input2_02*W2_02+B_02;
		//计算输入
		double  CountOutput_01 = Count_01>Sgn_01?Count_1OutputT:Count_1OutputF ;
		
		
		
		double  CountOutput_02 = Count_02>Sgn_02?Count_2OutputT:Count_2OutputF;
		//输入到下一个感知机
		
		System.out.println("--------------------");
		System.out.println("感知机1的计算结果");
		System.out.println(Count_01);
		System.out.println("感知机1的布尔值");
		System.out.println( Count_01>Sgn_01 );
		System.out.println("感知机1的输出");
		System.out.println(CountOutput_01);
		System.out.println("--------------------");
		System.out.println("感知机2的计算结果");
		System.out.println( Count_02 );
		System.out.println("感知机2的布尔值");
		System.out.println(Count_02>Sgn_02);
		System.out.println("感知机2的输出");
		System.out.println( CountOutput_02 );
		
		//输出到cmd

		
		double Output_01 =CountOutput_01*W_Count1+CountOutput_02*W_Count2+B_Output;
		//计算输出
		System.out.println("--------------------");
		System.out.println( "输出结果" );
		System.out.println( Output_01>Sgn_Output );
		System.out.println( "计算数据" );
		System.out.println( Output_01 );
		
	}
}