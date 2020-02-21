package com.example.Registration.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name ="genre")
public class MovieGenre {
	
	
		@Id
		@Column(name ="id")
	    private int id;
		
		@Column(name ="name")
		private String name;

	    public int getId() { return id; }

	    public void setId(int id) {
	        this.id = id;
	    }

		public String getname() {
			return name;
		}

		public void setGenreName(String name) {
			this.name = name;
		}
}
