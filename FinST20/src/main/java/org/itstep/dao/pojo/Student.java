package org.itstep.dao.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student extends User{

	private String group;
	private int course;
}
