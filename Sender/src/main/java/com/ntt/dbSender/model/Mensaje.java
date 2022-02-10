package com.ntt.dbSender.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;

@Document(collection = "mensaje")
@Builder
public class Mensaje {
	@Id
	String id;
	
	String msg;
	
	

	@Override
	public String toString() {
		return "Mensaje [id_msg=" + id + ", msg=" + msg + "]";
	}



	public String getId_msg() {
		return id;
	}



	public void setId_msg(String id) {
		this.id = id;
	}



	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
