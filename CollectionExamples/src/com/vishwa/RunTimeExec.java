package com.vishwa;

import java.io.IOException;

public class RunTimeExec {
	
	public static void main(String[] args) {
		try {
			System.out.println("Opening notepad");
			Runtime runTime = Runtime.getRuntime();
			Process process = runTime.exec("notepad");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Closing notepad");
			process.destroy();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
