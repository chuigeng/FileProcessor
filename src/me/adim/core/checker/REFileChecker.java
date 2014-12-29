package me.adim.core.checker;

import java.io.File;

/**
 * File checker base on regular expression.Every line of the file must match
 * this REGEXP, or method check will return false
 * 
 * @author ADi
 * 
 */
public class REFileChecker implements FileChecker {

	private String regExp = "/.*/";

	/**
	 * Set the regular expression which is used for checkout every line of the
	 * file
	 * 
	 * @param regExp
	 */
	public void setRE(String regExp) {
		this.regExp = regExp;
	}

	@Override
	public boolean check(File file) {
		return false;
	}

}
