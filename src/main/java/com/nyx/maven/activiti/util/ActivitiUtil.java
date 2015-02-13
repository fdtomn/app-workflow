package com.nyx.maven.activiti.util;

import java.io.File;

public class ActivitiUtil {

	public  static String[] getTemplate(){
		String path = ActivitiUtil.class.getResource("/").getPath();
		path=path.substring(1,path.length());
		System.out.println(path);
		path = path+"diagrams";
		System.out.println(path);
		return new File(path).list();
	}
	
	public static void main(String[] args) {
		String[] template = getTemplate();
		for(int i=0;i<template.length;i++){
			System.out.println(template[i]);
		}
	}
}
