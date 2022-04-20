package excercise.overall.processor;

public abstract class Processor {
   public String name() {
	   return this.getClass().getSimpleName();
   }
   protected abstract Object process(Object input);
}
