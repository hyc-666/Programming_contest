import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.File;
public class MainMenu{
	public static String PASSWORD = "mima123"; //Ĭ�ϵĹ���Ա����
	public static ArrayList<Xinli> xinli = new ArrayList<>();    //�ĸ���
	public static ArrayList<Yigong> yigong = new ArrayList<>();   //�幤�
	public static ArrayList<CRbook> crbook = new ArrayList<>();     //�����ͽ���Ԥ��
	public static ArrayList<Student> students = new ArrayList<>();    //ѧ����Ϣ
	public static ArrayList<String> ziyuan = new ArrayList<>();     //������Դ
	public static int num1 = -1;  //��������¼
	public static int num2 = -1;     //��¼����
	public static int num3 = -1;      //�����б�ĳ���
	public static int num4 = -1;      //ȫ�ֱ���
	public static int num5 = -1;
	public static void main(String[] args){

		while(true){  //���оͲ���ͣ
		String select = mainMenu();   //�����˵����صĲ���
		switch(select){
			case "1":{          //ѡ��1
				Scanner input = new Scanner(System.in);
				boolean mn1 = true;   //�����ؼ���ѭ��
				while(mn1){   //��ѭ��
					menu1();   //�Ӳ˵�1
					System.out.println("  0.������һ��\t\t���������");
					String go = input.next();  //���������ѡ��
					if(go.equals("0"))     //0�˳�
						mn1 = false;      //�����˳�ѭ��
				}
				break;
			}
			case "2":{         //ѡ��2
				Scanner input = new Scanner(System.in);
				boolean mn2 = true;       //ѡ��2��ѭ��
				while(mn2){
					menu2();    //�����Ӳ˵�2
					System.out.println("  0.������һ��\t\t���������");
					String go = input.next();
					if(go.equals("0")) //0�˳�
						mn2 = false;
				}
				break;
			}
			case "3":{         //ѡ��3
				Scanner input = new Scanner(System.in);
				boolean mn3 = true;  //ѡ��3��ѭ��
				while(mn3){
					menu3();   //�Ӳ˵�3
					System.out.println("  0.������һ��\t\t���������");
					String go = input.next();  //���ܿ���̨�����ݾ����Ƿ����
					if(go.equals("0"))     //0���˳��Ӳ˵�3
						mn3 = false;  //ѭ����־��
				}
				break;
			}
			case "4":{           //ѡ��4
				Scanner input = new Scanner(System.in);
				boolean mn4 = true; //ѡ��4��ѭ��
				while(mn4){
					menu4();   //�Ӳ˵�4
					System.out.println("  0.������һ��\t\t���������");
					String go = input.next();
					if(go.equals("0"))  //0���˳�
						mn4 = false;
				}
				break;
			}
			case "5":{           //ѡ��5
				System.out.print("���������Ա���룺");
				Scanner input = new Scanner(System.in);
				String password = input.next();   //��Ҫ�ӿ���̨�������Ա����
				if(key(password)){       //������ȷ
					boolean mn5 = true;   //�����Ӳ˵�5��ѭ��
					while(mn5){    
						menu5(); //�����Ӳ˵�5
						System.out.println("  0.������һ��\t\t���������"); //��ʾ�Ƿ����
						String go = input.next();     //���ܲ���
						if(go.equals("0"))      //����0
							mn5 = false;         //�˳�
					}
				}
				break;
			}
		}
		}
	}
	public static String mainMenu(){            //���˵�
		System.out.println("*******************************************");
		System.out.println("************** ѧ������ϵͳ ***************");        //����
		System.out.println("*******************************************");          //�Ӳ˵�ѡ��
		System.out.println("******** 1.������ѯԤԼƽ̨ ***************");
		System.out.println("******** 2.�幤�ڡ������Ͷ�����ƽ̨ *******");
		System.out.println("******** 3.��������������ԤԼƽ̨ *********");
		System.out.println("******** 4.������Դ����ƽ̨ ***************");
		System.out.println("******** 5.ѧ����Ϣ���� *******************");
		System.out.println("*******************************************");
		Scanner input = new Scanner(System.in);
		String x = null;   //��ѡ��
		boolean goon  = false;    //���˵�֮���ѡ��
		while(!goon){
				System.out.print("***��ѡ��");
				x = input.next();    //���ܴӿ���̨������
			
			if(!x.equals("1")&&!x.equals("2")&&!x.equals("3")&&!x.equals("4")&&!x.equals("5")){
				System.out.println("ѡ����Ч��������ѡ��");         //���˵�ֻ��5��ѡ��
			}
			else  //û��ѡ��5��ѡ��
				goon = true;    //����ѡ
		}		
		return x;		//������ѡ��Ĳ���
	}
	public static void menu1(){      //�Ӳ˵�1
		System.out.println("************* ������ѯƽ̨ ****************");
		System.out.println("** 1.������ԤԼ ");
		System.out.println("** 2.��ӿ�ԤԼ�� ");
		System.out.println("** 3.�鿴ԤԼ ");
		Scanner input = new Scanner(System.in);
		/*File heart = new File("heart.txt");
		if(heart.exists()){
			System.exit(0);
		}*/
		String s = input.next();     //�Ӳ˵�ѡ��
		
		switch(s){
			case "3":{
				for(int i = 0;i<xinli.size();i++){  //��ʾ����ӵĶ����б�
					System.out.println(xinli.get(i).toString()); //���ڲ��ķ���
				}
				if(xinli.size() ==0)     //����б���Ϊ0
					System.out.println("��ʱû��ԤԼ�����Ϣ");   //û����ص�ԤԼ��Ϣ
				break;
			}
			case "2":{         //����������Ϣ
				//System.out.print("ѧ��������");
				//String Sname = input.next();
				System.out.print("��ʦ������");
				String Tname = input.next();
				System.out.print("��ʦ�绰��");
				String Tel = input.next();
				System.out.print("�칫�ң�");
				String office = input.next();
				System.out.print("ʱ�䣺");
				String date = input.next();
				xinli.add(new Xinli(Tname,Tel,office,date)); //�����������ӵ��б���
				num1++;  //�б��ȼ�1
				System.out.println(xinli.get(num1).show());//��ʾ�����
				
				/*String temp = xinli.get(num1).toString();  
				try(
					PrintWriter hearts = new PrintWriter(heart);
				){
				hearts.print(temp+"\n");
				}*/
				System.out.println("�����");  //�����
			    break;
			}
			
			case "1":{        //��дԤԼ��Ϣ
				if(xinli.size()==0){
					System.out.println("��ʱû�п�ѡԤԼ��");
					break;
				}
				else{
				/*System.out.print("ѧ��������");
				String Sname = input.next();
				System.out.print("��ʦ������");
				String Tname = input.next();
				System.out.print("��ϵ��ʽ��");
				String Tel = input.next();
				System.out.print("�칫�ң�");
				String office = input.next();
				System.out.print("ʱ�䣺");
				String date = input.next();
				System.out.println("��ԤԼ");*/
				for(int i = 0;i<xinli.size();i++){
					System.out.println(i+": "+xinli.get(i).show());   //��ʾ�Ѿ���ӹ��ĺ�ԤԼ
				}
				System.out.print("��ѡ�����ѡ�");
				int i = input.nextInt();
				if(i>=0&&i<=xinli.size()){
					System.out.println(xinli.get(i).show());
					System.out.print("ѧ��������");
					String Sname = input.next();
					xinli.get(i).setSname(Sname);
					System.out.println(xinli.get(i).toString());       //��ʾԤԼ����
					xinli.get(i).setBook(true);        //����Ϊ��ԤԼ
					System.out.println("��ԤԼ");       //��ʾԤԼ�ɹ�
				}					
				else
					System.out.println("û�д˿�ѡ��");	//��������б�������
				
				}
			break;	
			}
		}
	}
	public static void menu2(){        //�Ӳ˵�2
		System.out.println("********** �幤�ڡ������Ͷ�����ƽ̨ *******");
		System.out.println("** 1.�幤�ڰ��Ų鿴 ");
		System.out.println("** 2.�����Ͷ����� ");
		Scanner input = new Scanner(System.in);
		String s =input.next();     //�Ӳ˵�2��ѡ�����
		switch(s){
			case "1":{       //��ʾ����ӹ���
				for(int i = 0;i<yigong.size();i++){
					System.out.println(yigong.get(i).toString());//��ӡ����ӵ��б�
				}
				if(yigong.size() == 0)	         //��ʼʱû�������Ϣ
					System.out.println("��ʱû�������Ϣ");
				break;
			}
			case "2":{          //������ӿ�ѡ��
				System.out.print("���ң�");
				String place = input.next();
				System.out.print("����༶��");
				String banji = input.next();
				System.out.print("�����ˣ�");
				String looker = input.next();
				System.out.print("�ʱ�䣺");
				String time = input.next();
				yigong.add(new Yigong(place,banji,looker,time)); //��ӵ��б�
				num2++;     //��¼��1
				System.out.println(yigong.get(num2).toString()); //��ʾ�����
				System.out.println("�����");
				break;
			}
		}
	}
	public static void menu3(){       //�Ӳ˵�3
		System.out.println("********** ��������������ԤԼƽ̨ *********");
		System.out.println("** 1.��������������ԤԼ ");
		System.out.println("** 2.�鿴ԤԼ ");
		System.out.println("** 3.��ӿ�ԤԼ�� ");
		Scanner input = new Scanner(System.in);
		String s = input.next();      //���ܴӿ���̨���ص��Ӳ˵�3��ѡ�����
		switch(s){
			case "1":{
				System.out.print("����/������ţ�");
				String id = input.next();
				System.out.print("ԤԼʱ�䣺");
				String time = input.next();
				for(int i = 0;i<crbook.size();i++){      //�����Ƿ���ԤԼ
					if(id.equals(crbook.get(i).getId())){    //����������ԤԼ����ͬ
					if(crbook.get(i).book)     //�����Ѿ���ԤԼ
						System.out.println("�˽���/�����ѱ�ԤԼ");   //�ѱ�ԤԼ
					else
						System.out.println("ԤԼ�ɹ�");
						crbook.get(i).setBook(true);    //����Ϊ��ԤԼ
						System.out.println(crbook.get(i).toString());   //��ʾ��ԤԼ��Ϣ
				}
			}
				break;
			}
			case "2":{
				for(int i = 0;i<crbook.size();i++){          //�����ԤԼ����ӵ�������Ϣ
					System.out.println(crbook.get(i).toString());     //�������
				}
				if(crbook.size() == 0) 		//��ʼʱû�������Ϣ
					System.out.println("��ʱû�������Ϣ");
				break;
			}
			case "3":{
				boolean t = true;     //�Ƿ�������
				while(t){
					System.out.print("����/������ţ�");
					String id = input.next();     //�ѻ���������뼴��
					System.out.print("ԤԼʱ�䣺");
					String time = input.next();
					crbook.add(new CRbook(id,time));     //�´����Ķ�����ӵ��б���
					num3++;        //�б��ȼ�1
					System.out.println(crbook.get(num3).toString());    //ȷ�������Ϣ
					System.out.println("�����");
					System.out.println("\t0.����\t������������");     //0���˳�
					String g = input.next();  //����������
					if(g.equals("0")){
						t = false;     //�˳��������
					}
				}
				break;
			}
		}
		
	}
	public static void menu4(){        //�Ӳ˵�4
		System.out.println("********** ������Դ����ƽ̨ ***************");
		System.out.println("** 1.�鿴������Դ ");
		System.out.println("** 2.��ӹ�����Դ ");
		Scanner input = new Scanner(System.in);
		String s = input.next();       //�Ӳ˵�4��ѭ��
		switch(s){
			case "2":{       //����Ϊ�ַ��������б�
				String ziyuan1 = input.next();
				ziyuan.add(ziyuan1);     //�������Դ��ӵ��б�
				num4++;     //�б��ȼ�1
				break;
			}
			case "1":{        //��ʾ����ӹ���������Դ
				for(int i = 0;i<ziyuan.size();i++){
					System.out.println(ziyuan.get(i));
				}
				if(ziyuan.size() == 0)      //����б���Ϊ0
					System.out.println("��δ�����Դ");     //��˵���б�����ʱû����Դ
				break;
			}
		}
	}
	public static void menu5(){         //�Ӳ˵�5
		System.out.println("************** ѧ����Ϣ���� ***************");
		System.out.println("** 1.���ѧ����Ϣ ");
		System.out.println("** 2.�޸�ѧ����Ϣ ");
		System.out.println("** 3.ɾ��ѧ����Ϣ ");
		System.out.println("** 4.�鿴ѧ����Ϣ ");
		System.out.println("** 5.�޸Ĺ���Ա���� ");
		Scanner input = new Scanner(System.in);
		String s = input.next();       //�Ӳ˵�5��ѭ��
		boolean exit = false;   //�����ѧ��û�б����
		//boolean z = true;
		switch(s){
			case "1":{
				boolean go = true;   //�Ƿ�������
				while(go){
				System.out.print("ѧ�ţ�");
				String id = input.next();      //����ѧ��
				for(int i = 0;i<students.size();i++){     //�����Ƿ��Ѿ���ӹ�
					if(id.equals(students.get(i).getId())){    //���������ӵ�ѧ���ظ�
						System.out.println("��ѧ���Ѵ��ڣ�");
						exit = true;    //��ѧ���Ѵ���
					}
				}
				if(exit)  //��ѧ�Ŵ������˳�
					break;      //��ǰ������Ϣ¼��
				System.out.print("������");      //�����ڼ�������Ҳ�����
				String name = input.next();
				System.out.print("Ժϵ��");
				String dept = input.next();
				System.out.print("�༶��");
				String banji = input.next();
				students.add(new Student(id,name,dept,banji));      //��ѧ����Ϣ��ӵ�ѧ���б���
				num5++;   //�б�Ԫ�ؼ�1
				System.out.println(students.get(num5).toString());       //ȷ�������
				System.out.println("�����");
				System.out.println("**0���˳���������������");   //��0����¼��
				String tian = input.next();    //�Ƿ�������
				if(tian.equals("0"))  //�����˳�
					go = false;
			}
				break;
			}
			case "2":{
				boolean z = true;       //�Ƿ�������ƥ����
				System.out.print("����ѧ�ţ�");      //��ѧ�Ų�����Ϣ
				String gai = input.next();     //���������ѧ��
				for(int i = 0;i<students.size();i++){     //У���Ƿ����Ѿ����б���¼���
					if(gai.equals(students.get(i).getId())){      //���ѧ����ͬ
						System.out.println(students.get(i).toString()); //�г�ѧ����Ϣ
						z = false;     //���������ƥ����
						boolean x = true;  //�Ƿ�����޸�
						while(x){
						System.out.println("ѡ���޸���:");
						System.out.println("1.����   2.Ժϵ   3.�༶   4.������Ϣ   5.�����");
						String g = input.next();     //����ѡ����Ϣ
						//boolean x = true;
						//while(x){ 
						switch(g){
							case "1":{   //�����Ҫ�޸�����
								System.out.print("����������");
								String name = input.next();
								students.get(i).setName(name);
								break;
							}
							case "2":{    //�����޸�ѧԺ��Ϣ������תרҵתԺ�ģ�
								System.out.print("����Ժϵ��");
								String dept = input.next();
								students.get(i).setDept(dept);
								break;
							}
							case "3":{
								System.out.print("���°༶��");    //��ϵ��תרҵ�ģ�������
								String banji = input.next();
								students.get(i).setBanji(banji);   //�༶��Ϣ���
								break;
							}
							case "4":{
								System.out.print("���±�����Ϣ��");
								String match = input.next();
								students.get(i).setMatch(match);
								break;
							}
							case "5":{
								System.out.print("���»������");
								String honor = input.next();
								students.get(i).setHonor(honor);
								break;
							}
						}
						System.out.println("����������޸ģ�0������");     //�Ƿ�����޸�
						String c = input.next();
						if(c.equals("0"))   //0�˳�
							x = false;  //�������ѡ���޸���һ��
						}
					}
				}
				if(z)      //���û��������ƥ����
					System.out.println("û��������ƥ����");
				break;
			}
			case "3":{
				boolean z1 = true;      //���û��������ƥ����
				System.out.print("����ѧ�ţ�");  //����ѧ�Ų���
				String xue = input.next();     //����ѧ��
				for(int i = 0;i<students.size();i++){    //�б�������
					if(xue.equals(students.get(i).getId())){   //��ѧ����ͬ��
						z1 = false;    //��������
						System.out.println(students.get(i).toString()); //��ʾ����������Ϣ
						students.remove(i);        //ɾ��������¼
						num5--;                   //�Ƴ�һ����¼���б��ȼ�1
						System.out.println("��ɾ��");
					}
					
						//System.out.println("û��������ƥ����");
				}
				if(z1)       //���û��������
					System.out.println("û��������ƥ����");
				break;
			}
			case "4":{        //��ʾ�����ѵ����ѧ����Ϣ
				for(int i = 0;i<students.size();i++){
					System.out.println(students.get(i).toString());
				}
				if(students.size() == 0)    //����б���û����Ϣ
					System.out.println("��ʱû�е������ѧ����Ϣ");
				break;
			}
			case "5":{
				System.out.print("��������룺");
				String mima = input.next();
				if(key(mima)){     //������������ȷ
				System.out.print("���������룺");
				String newmima = input.next();
				PASSWORD = newmima;     //����Ա�������
				System.out.println("�������޸�");
				}
				break;
			}
		}
	}
	public static boolean key(String password){       //��֤����Ա������ȷ�ķ���
			if(PASSWORD.equals(password)){    //�����յ���������ȷ
				System.out.println("������ȷ");
				return true;      //����true
			}
			else{
				System.out.println("�������");    //������󷵻�false
				return false;
			}
	}
}
