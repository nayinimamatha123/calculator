package com.abc.calculator;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Arrays;

	public class Calculator {
	    private ScriptEngine engine;

	    /**
	     * initializes the Script engine with Script Manager
	     */
	    Calculator() {
	        ScriptEngineManager mgr = new ScriptEngineManager();
	        engine = mgr.getEngineByName("JavaScript");
	    }

	    double add(double... values) {
	        return Arrays.stream(values).sum();
	    }

	    double subtract(double a, double b) {
	        return a - b;
	    }

	    double divide(double a, double b) {
	        return a / b;
	    }

	    /**
	     * @param values takes multiple inputs
	     * @return return multiplying all inputs
	     */
	    double multiply(double... values) {
	        return Arrays.stream(values).reduce(1, (a, b) -> a * b);
	    }

	    /**
	     * @param expression javascript expression to be evaluated and executed
	     * @return evaluated expression or error message
	     */
	    Object expressionEval(String expression) {
	        try {
	            return engine.eval(expression);
	        } catch (ScriptException e) {
	            return e.getMessage();
	        }
	    }

	}

}
