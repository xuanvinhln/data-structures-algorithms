package Lession2;

public class Bai1678 {
	   public String interpret(String command) { 
	        command = command.replace("()","o");
	        command = command.replace("(al)","al");
	        return command;
	    }

}
