package me.adim.core.checker;

import java.io.File;

/**
 * All file content validation class should implement this interface
 * 
 * @author ADi
 * 
 */
public interface FileChecker {

	/**
	 * check the validity of a file
	 * 
	 * @param file
	 * @return
	 */
	public abstract boolean check(File file);
}
