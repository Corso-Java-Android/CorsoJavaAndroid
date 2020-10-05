package web.util;

public class HtmlPrologue {
	
	public static String prologue(String title) {
		StringBuilder sb = new StringBuilder();
		sb.append("<!DOCTYPE html><html><head><meta charset='UTF-8'><title>"+title+"</title>");
		sb.append("</head><body>");
		sb.append("<h3>");
		return sb.toString();
	}

}
