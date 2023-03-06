//static binding programm-> three keywords: final,static,private
   class A1{
     void fn()
	{
	 System.out.println("hello");
	}
	
   }
   class B extends A1{
	   void fn()
	   {
		      System.out.println("hellofrom B class");
	   }
	   public static void main(String[] args){
		   A obj = new B();
		   obj.fn();
	   }
   }
   
   
   
   
   