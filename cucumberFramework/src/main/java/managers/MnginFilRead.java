package managers;

import reusablefunctions.Wrappers;

public class MnginFilRead {
	private static MnginFilRead fileReaderManager = new MnginFilRead();
	public static Wrappers configFileReader;
 
	public MnginFilRead() {
	}
 
	 public static MnginFilRead getInstance( ) {
	      return fileReaderManager;
	 }
 
	 public Wrappers getConfigReader() {
		 return (configFileReader == null) ? new Wrappers() : configFileReader;
	 }


}
