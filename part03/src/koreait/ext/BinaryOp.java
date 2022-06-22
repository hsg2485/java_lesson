package koreait.ext;

public class BinaryOp {

	public static void main(String[] args) {
		
		//2������ ��Ʈ ���� : & , | , ^, ~, >>, << ��� ������ �׽�Ʈ
		int data = 0b0101110100100110;
		
		System.out.println("1. ~ (��Ʈ ����) ���� ���");	//���� : !������ true �� false �� �ݴ�� (boolean)
		System.out.println(String.format("%32s", Integer.toBinaryString(data)));
		System.out.println(String.format("%32s", Integer.toBinaryString(~data)));

		System.out.println("2. >>�� ������ ����Ʈ ���� (������ �������� ����Ʈ ���� Ƚ��)");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1), data>>1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2), data>>2));
		// >> 1�� ������ 2�� ��� ��
		
		System.out.println("3. <<�� ���� ����Ʈ ���� (������ �������� ����Ʈ ���� Ƚ��)");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<1), data<<1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<2), data<<2));
		// << 1�� ���ϱ� 2�� ��� ��
		
		data = -2345;
		System.out.println("4. ������ >> ������ ����Ʈ ���� (���ʿ� �߰��Ǵ� ��Ʈ��?)");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1), data>>1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2), data>>2));
		//���� 32��Ʈ�� �� ���� ��Ʈ�� ��ȣ�� ǥ����. ������ ����Ʈ ���꿡�� ������ �߰��Ǵ� ��Ʈ�� ��ȣ��Ʈ�� ����
		// ���� : ������ ����Ʈ �� �� ��ȣ�� ������� ���ʿ� �߰��Ǵ� ��Ʈ�� 0���� �ؾߵ� ������ >>> �������� ��
		
		System.out.println("5. >>> ������ ����Ʈ ����");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>>2), data>>>2));
		
		byte n = (byte)0x11010011;		//32��Ʈ�� ��� 1
		data = 100;
		//���� : ������ and �� �� and �� �϶��� ����� ��, ������ or�� ���� or ������ ���� ����� ����
		//		��Ʈ���� and �� 1&1�� ���� ����� 1, ��Ʈ���� or�� 0 or 0�� ���� ����� 0
		// ��Ʈ ���� Ȱ�� => x&1�� ����� x, x&0�� ����� 0, x|1�� ����� 1, x|0�� ����� x
		System.out.println("6. &�� bit and ����");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("--------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data&n), data&n));
		
		System.out.println("7. |�� bit or ����");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("--------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data|n), data|n));
		
		n = 0;
		System.out.println("8. &�� bit and ����");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("--------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data&n), data&n));
		
		System.out.println("9. |�� bit or ����");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("--------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data|n), data|n));
	}

}
