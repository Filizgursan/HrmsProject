package kodlamaio.Hrms.core.utilities.results;

public class Result {
	
	private boolean success;
	private String message;
	
	public Result() {
		
	}
	
	public Result(boolean success) {
		this.success =  success;
	}
	
	public Result(boolean success,String message) {
		//DRY
		this(success);
		this.message = message;
	}
	
	public boolean isSuccess() {
		return this.isSuccess();
	}
	public String getMessage() {
		return this.getMessage();
	}

}
