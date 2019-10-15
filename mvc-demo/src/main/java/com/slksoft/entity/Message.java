package com.slksoft.entity;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Message {
	private Integer id;
	private String msgFrom;
	private String msgTo;
	private String msgCc;
	private String msgSubject;
	private String msgBody;
	private Date sentAt;
}
