package codeDemo.core_northwind_java.core.utilities.results;

	public class ErrorResult extends Result{
		
		public  ErrorResult(){
			super(false);
		}
		
		public  ErrorResult(String message){
			super(false,message);
		}

}
