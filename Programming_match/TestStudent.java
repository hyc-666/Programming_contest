class Student{
	private String id;     //ѧ��
	private String name;     //����
	private String dept;      //ϵ/ѧԺ
	private String banji;       //�༶
	private String match;    //������Ϣ
	private String honor;        //�������������
	public Student(){        //��ʽ�޲ι�����
	}
	public Student(String id,String name,String dept,String banji){
		setId(id);
		setName(name);
		setDept(dept);
		setBanji(banji);
	}
	/*���������޸��� */
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setDept(String dept){
		this.dept = dept;
	}
	public String getDept(){
		return this.dept;
	}
	public void setBanji(String banji){
		this.banji = banji;
	}
	public String getBanji(){
		return this.banji;
	}
	public void setMatch(String match){
		this.match = match;
	}
	public String getMatch(){
		return this.match;
	}
	public void setHonor(String honor){
		this.honor = honor;
	}
	public String getHonor(){
		return this.honor;
	}
	public String toString(){
		return "ѧ�ţ�"+getId()+"  ������"+getName()+"  Ժϵ��"+getDept()
		+"  �༶��"+getBanji()+"  ������Ϣ��"+getMatch()+"  ������"+getHonor();
	}
}
public class TestStudent{
	public static void main(String[] args){
		Student student = new Student();
		System.out.println(student.toString());
	}
}
