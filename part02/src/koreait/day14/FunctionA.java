package koreait.day14;

@FunctionalInterface
public interface FunctionA {
	int methodA(int a, int b);
	//void methodB();
}
//�Լ��� �������̽� : @FunctionalInterface �ֳ����̼� �����
//�������̽� �߿� *�߻�޼ҵ尡 1���� ��*�� �ٸ� ���α׷��� ���� ���Ǵ� �Լ� �������� ǥ���� �� �ֽ��ϴ�.
//�ٸ� ���α׷��� ���� �ڹٿ��� -> ��ȣ�� �ٿ��� ��(���ٽ�). ������, ���Ἲ�� ���ؼ� ����մϴ�.

//�߻� �޼ҵ� �̸��� �߿����� ����
//����: ���ϰ�, ����(�Ű�����)
//�ڹٿ��� ���Ŀ� ���� ����� �� �ִ� �������� �Լ��� �������̽��� ���� : Consumer, Producer, Predicate, ...

