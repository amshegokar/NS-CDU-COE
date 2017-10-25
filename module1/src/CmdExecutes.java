package com.techm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdExecutes {

	public static void main(String[] args) {

		eventReception();
	}

	public static void eventReception() {

		String testCurlCommand = "hostnameee";

		// final Process terminal = curlCommand.start();
		try {
			Process p = Runtime.getRuntime().exec(testCurlCommand);
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

			// read the output from the command

			String s = null;
			while ((s = stdInput.readLine()) != null) {

				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

		// return "false";
	}

}
