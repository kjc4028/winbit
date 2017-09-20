package web.page.DTO;

import java.sql.Timestamp;

public class BoardDto {
int bbsID;
String title;
String content;
String writer;
Timestamp wtime;
int bCount;
int gNum;
int lNum;
int indent;

public BoardDto() {
	// TODO Auto-generated constructor stub
}

public BoardDto(int bbsID, String title, String content, String writer, Timestamp wtime, int bCount, int gNum, int lNum,
		int indent) {
	super();
	this.bbsID = bbsID;
	this.title = title;
	this.content = content;
	this.writer = writer;
	this.wtime = wtime;
	this.bCount = bCount;
	this.gNum = gNum;
	this.lNum = lNum;
	this.indent = indent;
}

public int getBbsID() {
	return bbsID;
}

public void setBbsID(int bbsID) {
	this.bbsID = bbsID;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public String getWriter() {
	return writer;
}

public void setWriter(String writer) {
	this.writer = writer;
}

public Timestamp getWtime() {
	return wtime;
}

public void setWtime(Timestamp wtime) {
	this.wtime = wtime;
}

public int getbCount() {
	return bCount;
}

public void setbCount(int bCount) {
	this.bCount = bCount;
}

public int getgNum() {
	return gNum;
}

public void setgNum(int gNum) {
	this.gNum = gNum;
}

public int getlNum() {
	return lNum;
}

public void setlNum(int lNum) {
	this.lNum = lNum;
}

public int getIndent() {
	return indent;
}

public void setIndent(int indent) {
	this.indent = indent;
}






}

