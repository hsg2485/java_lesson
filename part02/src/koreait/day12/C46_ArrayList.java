package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C46_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] datas = {11, 22, 33, 44, 55, 66, 77}; //�迭�� ������ �� �迭�� ũ�⸦ ����
											//�迭�� �⺻�� ������ Ÿ�� int, double, long, ... �Ǵ� ������ Ÿ��
		
		ArrayList<Integer> list = new ArrayList<>();
									//ArrayList�� ũ�Ⱑ ����
									//������ Ÿ���� ������ Ÿ�Ը�. �⺻���� ����Ŭ���� ���
									//<E> �� ���ʸ�(Generic) Ÿ���̶�� �θ�. ������ ����� Ÿ���� ����. 
									//����Ʈ�� �����ϴ� �����͸� ���(Element)��� ��
		
		String[] names = {"����", "���", "�ź�", "����", "����"};
		ArrayList<String> name_list = new ArrayList<>();
		
		//ArrayList�� ������ �߰��� add() �޼ҵ�
		list.add(11);
		list.add(33);
		list.add(44);list.add(55);list.add(66);list.add(77);
		
		System.out.println("1. ù��° ArrayList<Integer> ���");
		System.out.println(list);
		System.out.println("����(�迭 ��� ���) :  " + Arrays.toString(datas)
							+ "�迭 ũ�� ��¹��" + datas.length);
		System.out.println("�ι�° ArrayList<String> ���");
		System.out.println(name_list);		//
		System.out.println("����Ʈ�� ũ�� : " + name_list.size());		//������ ���� ���� 0
		
		name_list.add("����");name_list.add("���");name_list.add("����");
		name_list.add("����");
		System.out.println("2. �ι�° ArrayList<Integer> ���");
		System.out.println(name_list);
		System.out.println("����Ʈ�� ũ�� : " + name_list.size());
		
		System.out.println("3. Ư�� ��ġ�� ������ �߰�");
		list.add(1,22);		//(�ε��� ��ġ, �߰��� ��) ��, �ε��� ��ġ�� �迭�� ũ�⺸�� �۾ƾ� ��
		/*int temp = 22;
		   list.add(1,temp);	//���� �����ؼ� ���ͷ� ���� ��ġ�� ������ �־ ����
		*/
		System.out.println("add(1,22) ��� : " + list);
		name_list.add(2, "�ź�");
		System.out.println("add(2,\"�ź�\") ���" + name_list);
		
		System.out.println("4. �迭ó�� index ������ ������ ��������");
		System.out.println("list.get(3) : " + list.get(3));
		System.out.println("name_list.get(3) : " + name_list.get(3));
		
		System.out.println("5. Ư�� ��ġ�� ������(���) ����");
		list.remove(4);
		System.out.println(list);
		name_list.remove(4);
		System.out.println(name_list);
		
		System.out.println("\n6. Ư�� �� ��ġ�� �˾Ƴ���");
		System.out.println("�迭 : " +Arrays.binarySearch(names, "�ź�"));
		System.out.println("����Ʈ : " + name_list.indexOf("�ź�"));
		
		System.out.println("\n7. 6���� ���� ������ for������ �Ѵٸ�?");
		System.out.println("�迭");
		int i;
		for(i = 0; i< names.length; i++) {
			if(names[i].equals("�ź�"))
				break;
		}
		System.out.println("'�ź�'�� �ε��� : " + i);
		System.out.println("����Ʈ");
		for(i = 0; i < name_list.size(); i++) {
			if(name_list.get(i).equals("�ź�")) 
				break;
		}
		System.out.println("'�ź�'�� �ε��� : "  + i);
		
		//'�ź�' ��Ұ� �������϶� ����Ʈ�� lastIndexOf �޼ҵ�� ������ ��ġ ��Ҹ� ã�� �� ����
		
		System.out.println("\n8. contains �޼ҵ�");
		System.out.println("'����'�� ����Ʈ�� �ִ°�? " + name_list.contains("����"));
		System.out.println("'����'�� ����Ʈ�� �ִ°�? " + name_list.contains("����"));
		
		
		
		
		

	}

}
/* �迭 : ���� ���� �����͸� �����ϴ� ���
 * �÷���(Collections) : �ڷ� ����. ���� ���� �����͸� �����ϴ� ���̰� ������ Ư¡�� ����
 * 								����(����, �б�/����)�ϴ� ���̰� ����
 * 								�����͸� ����/���� ���� �˰����� �޼ҵ�� �����Ǿ� ����
 * 			��ArrayList Ŭ����
 * 			��HashMap Ŭ����
 * 
 * add �߰�
	get ������ ��������
	remove Ư����ġ ������ ����
	�⺻�迭ũ�� length
	����Ʈ ũ�� size

 * 
 */
