package excercise.overall.processor;

public class LowerCase extends Processor {

	@Override
	public String process(Object input) {		 
		return ((String)input).toLowerCase();
	}

}
