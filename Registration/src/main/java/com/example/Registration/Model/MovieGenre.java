package com.example.Registration.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "genre")
public class MovieGenre {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "genre_id")
		private int id;
		@Column(name = "genre_name")
		private String name;

	    public int getId() { return id; }

	    public void setId(int id) {
	        this.id = id;
	    }

		public String getGenreName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
}
