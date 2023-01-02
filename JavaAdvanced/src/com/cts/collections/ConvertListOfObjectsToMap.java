package com.cts.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Notes{
	private int id;
	private String tagName;
	private long tagId;
	public Notes(int id, String tagName, long tagId) {
		super();
		this.id = id;
		this.tagName = tagName;
		this.tagId = tagId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public long getTagId() {
		return tagId;
	}
	public void setTagId(long tagId) {
		this.tagId = tagId;
	}
	
	
}
public class ConvertListOfObjectsToMap {

	public static void main(String[] args) {
		
		List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));
        noteLst.add(new Notes(6, "note4", 66));
        
        Map<String, Long> noteMap = noteLst.stream()
        		.collect(Collectors.toMap(Notes::getTagName, Notes::getTagId,(oldValue,newValue)->newValue));
        
        System.out.println("List to Map::"+noteMap);

	}

}
