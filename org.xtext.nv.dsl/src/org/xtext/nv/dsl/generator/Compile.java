/*******************************************************************************
 * Copyright (c) 2015 Niksa Visic.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.xtext.nv.dsl.generator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public class Compile 
{	
	public void run()
	{
		// get aencrypt path
		String path = getResourcesFilePath();
		// input is the ALL file path
		String inputfile = getInputFile();
		// output is the ABL file path
		String outputfile = getOutputFile();
		
		// create command with parameters
		String[] cmd = new String[] {path, inputfile, outputfile};
		ProcessBuilder pb = new ProcessBuilder(cmd);
		
		try 
		{			
			// eclipse home location
			// System.out.println("Eclipse home: " + System.getProperty("eclipse.home.location"));
			
			// execute command
			System.out.println("Compiling ...");
			// System.out.println(cmd[0]);
			System.out.println("Input: ");
			System.out.println(cmd[1]);
			System.out.println("Output: ");
			System.out.println(cmd[2]);
			pb.start();
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	private String getResourcesFilePath()
	{
		// TODO: search for the alternative path finding technique
//		String path1 = Compile.class.getProtectionDomain().getCodeSource().getLocation().getPath();
//		String path2 = this.getClass().getName().replace("Compile", "").replace(".", "/").replace("generator", "resources");
//		String path = path1 + "bin/" + path2;
		
		// Use executables in 'resources' folder inside eclipse directory
		String eclipseHomeFull = System.getProperty("eclipse.home.location");
		String eclipseHomePath = eclipseHomeFull.substring(6);
		Path pathTemp = Paths.get(eclipseHomePath + "resources/aencrypt.exe");
		String path = pathTemp.toAbsolutePath().toString();
		
		return path;
	}
	
//	private String getWorkspacePath()
//	{
//		IWorkspace workspace = ResourcesPlugin.getWorkspace();
//		IWorkspaceRoot root = workspace.getRoot();
//		IPath location = root.getLocation();
//		String str = location.toPortableString();
//		
//		return str;
//	}
	
	private String getActiveWindowFilePath()
	{
		IWorkbenchPart workbenchPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart(); 
	    IFile file = (IFile) workbenchPart.getSite().getPage().getActiveEditor().getEditorInput().getAdapter(IFile.class);
	    if (file == null)
	        try {
	            throw new FileNotFoundException();
	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    String path = file.getRawLocation().toPortableString();
	    
	    return path;
	}
	
	private String getInputFile()
	{
		String path = getActiveWindowFilePath();
		
		return path;
	}
	
	private String getOutputFile()
	{
		String path = getActiveWindowFilePath().replace(".all", ".abl");		
		
		return path;
	}
}
