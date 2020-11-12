/*
 * Copyright 2004 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example;

import com.ancientprogramming.fixedformat4j.annotation.Record;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Align;
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;

import java.util.Date;

@Record
public class Customer implements Comparable<Customer> {

	private String name;
	private Integer id;
	private Date dob;

	@Field(offset = 1, length = 10)
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	@Field(offset = 11, length = 5)
	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	@Field(offset = 16, length = 10)
	@FixedFormatPattern("yyyy-MM-dd")
	public Date getdob() {
		return dob;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", dob=" + dob + "]";
	}

	public void setdob(Date dob) {
		this.dob = dob;
	}

	@Override
	public int compareTo(Customer st) {
		if (this.id == st.getid())
			return 0;
		else if (this.id > st.getid())
			return 1;
		else
			return -1;
	}

}