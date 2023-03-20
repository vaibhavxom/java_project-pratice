class Exam {
		
		private int examId;	 
		private String examName;
		private String examClass;

	
	public void setExamId( int id)
	
	{
		
		examId = id;
	
	
	}
	
	public void setExamName( String  name)
	
	{
		
		examName = name;
	
	
	}

	public void setExamClass( String  class1)
	
	{
		
		examClass = class1;
	
	
	}

	public int getExamId( )
	
	{
	
		return examId;
	
	}
	
	public String getExamName( )
	
	{
	
		return examName;
	
	}
	
	public String getExamClass( )
	
	{
	
		return examClass;
	
	}

}

class DemoEncapsulation{
	public static void main(String args[])
	{
	
 	
		
		Exam e1 = new Exam();
		
		e1.setExamId(1);
		e1.setExamName("Unit Test");
		e1.setExamClass(" BSc.SE");

		Exam e2 = new Exam();
		
		e2.setExamId(2);
		e2.setExamName("Unit Test -2");
		e2.setExamClass(" BSc.Cs");

		System.out.println(e1.getExamId() );	 
		System.out.println(e1.getExamName() );
		System.out.println(e1.getExamClass() );

		System.out.println(e2.getExamId() );	 
		System.out.println(e2.getExamName() );
		System.out.println(e2.getExamClass() );	 
	}
}